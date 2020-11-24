package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InAppProductListing extends js.Object {
  
  /** Localized entitlement benefits for a subscription. */
  var benefits: js.UndefOr[js.Array[String]] = js.native
  
  /** Description for the store listing. */
  var description: js.UndefOr[String] = js.native
  
  /** Title for the store listing. */
  var title: js.UndefOr[String] = js.native
}
object InAppProductListing {
  
  @scala.inline
  def apply(): InAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProductListing]
  }
  
  @scala.inline
  implicit class InAppProductListingOps[Self <: InAppProductListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBenefitsVarargs(value: String*): Self = this.set("benefits", js.Array(value :_*))
    
    @scala.inline
    def setBenefits(value: js.Array[String]): Self = this.set("benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenefits: Self = this.set("benefits", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
