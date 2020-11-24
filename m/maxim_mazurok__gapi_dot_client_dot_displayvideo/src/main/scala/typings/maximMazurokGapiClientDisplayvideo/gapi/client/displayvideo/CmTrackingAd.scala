package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmTrackingAd extends js.Object {
  
  /** The ad ID of the campaign manager 360 tracking Ad. */
  var cmAdId: js.UndefOr[String] = js.native
  
  /** The creative ID of the campaign manager 360 tracking Ad. */
  var cmCreativeId: js.UndefOr[String] = js.native
  
  /** The placement ID of the campaign manager 360 tracking Ad. */
  var cmPlacementId: js.UndefOr[String] = js.native
}
object CmTrackingAd {
  
  @scala.inline
  def apply(): CmTrackingAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmTrackingAd]
  }
  
  @scala.inline
  implicit class CmTrackingAdOps[Self <: CmTrackingAd] (val x: Self) extends AnyVal {
    
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
    def setCmAdId(value: String): Self = this.set("cmAdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmAdId: Self = this.set("cmAdId", js.undefined)
    
    @scala.inline
    def setCmCreativeId(value: String): Self = this.set("cmCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmCreativeId: Self = this.set("cmCreativeId", js.undefined)
    
    @scala.inline
    def setCmPlacementId(value: String): Self = this.set("cmPlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmPlacementId: Self = this.set("cmPlacementId", js.undefined)
  }
}
