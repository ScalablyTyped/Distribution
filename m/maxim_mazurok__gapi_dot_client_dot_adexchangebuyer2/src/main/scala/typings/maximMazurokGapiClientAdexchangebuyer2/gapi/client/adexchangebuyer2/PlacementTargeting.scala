package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementTargeting extends js.Object {
  
  /** Mobile application targeting information in a deal. This doesn't apply to Auction Packages. */
  var mobileApplicationTargeting: js.UndefOr[MobileApplicationTargeting] = js.native
  
  /** URLs to be included/excluded. */
  var urlTargeting: js.UndefOr[UrlTargeting] = js.native
}
object PlacementTargeting {
  
  @scala.inline
  def apply(): PlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTargeting]
  }
  
  @scala.inline
  implicit class PlacementTargetingOps[Self <: PlacementTargeting] (val x: Self) extends AnyVal {
    
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
    def setMobileApplicationTargeting(value: MobileApplicationTargeting): Self = this.set("mobileApplicationTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileApplicationTargeting: Self = this.set("mobileApplicationTargeting", js.undefined)
    
    @scala.inline
    def setUrlTargeting(value: UrlTargeting): Self = this.set("urlTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlTargeting: Self = this.set("urlTargeting", js.undefined)
  }
}
