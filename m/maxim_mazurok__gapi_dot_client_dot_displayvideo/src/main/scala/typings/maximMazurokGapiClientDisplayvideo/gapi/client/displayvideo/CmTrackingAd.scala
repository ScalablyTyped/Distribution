package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmTrackingAd extends StObject {
  
  /** The ad ID of the campaign manager 360 tracking Ad. */
  var cmAdId: js.UndefOr[String] = js.undefined
  
  /** The creative ID of the campaign manager 360 tracking Ad. */
  var cmCreativeId: js.UndefOr[String] = js.undefined
  
  /** The placement ID of the campaign manager 360 tracking Ad. */
  var cmPlacementId: js.UndefOr[String] = js.undefined
}
object CmTrackingAd {
  
  inline def apply(): CmTrackingAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmTrackingAd]
  }
  
  extension [Self <: CmTrackingAd](x: Self) {
    
    inline def setCmAdId(value: String): Self = StObject.set(x, "cmAdId", value.asInstanceOf[js.Any])
    
    inline def setCmAdIdUndefined: Self = StObject.set(x, "cmAdId", js.undefined)
    
    inline def setCmCreativeId(value: String): Self = StObject.set(x, "cmCreativeId", value.asInstanceOf[js.Any])
    
    inline def setCmCreativeIdUndefined: Self = StObject.set(x, "cmCreativeId", js.undefined)
    
    inline def setCmPlacementId(value: String): Self = StObject.set(x, "cmPlacementId", value.asInstanceOf[js.Any])
    
    inline def setCmPlacementIdUndefined: Self = StObject.set(x, "cmPlacementId", js.undefined)
  }
}
