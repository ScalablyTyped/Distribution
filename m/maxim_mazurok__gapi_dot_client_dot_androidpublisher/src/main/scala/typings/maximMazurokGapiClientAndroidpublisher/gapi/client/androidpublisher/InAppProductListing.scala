package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppProductListing extends StObject {
  
  /** Localized entitlement benefits for a subscription. */
  var benefits: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Description for the store listing. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Title for the store listing. */
  var title: js.UndefOr[String] = js.undefined
}
object InAppProductListing {
  
  @scala.inline
  def apply(): InAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProductListing]
  }
  
  @scala.inline
  implicit class InAppProductListingMutableBuilder[Self <: InAppProductListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenefits(value: js.Array[String]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    @scala.inline
    def setBenefitsVarargs(value: String*): Self = StObject.set(x, "benefits", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
