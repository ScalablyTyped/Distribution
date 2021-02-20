package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmTrackingAd extends StObject {
  
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
  implicit class CmTrackingAdMutableBuilder[Self <: CmTrackingAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmAdId(value: String): Self = StObject.set(x, "cmAdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmAdIdUndefined: Self = StObject.set(x, "cmAdId", js.undefined)
    
    @scala.inline
    def setCmCreativeId(value: String): Self = StObject.set(x, "cmCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmCreativeIdUndefined: Self = StObject.set(x, "cmCreativeId", js.undefined)
    
    @scala.inline
    def setCmPlacementId(value: String): Self = StObject.set(x, "cmPlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmPlacementIdUndefined: Self = StObject.set(x, "cmPlacementId", js.undefined)
  }
}
