package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCmTrackingAd extends StObject {
  
  /**
    * The ad ID of the campaign manager 360 tracking Ad.
    */
  var cmAdId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The creative ID of the campaign manager 360 tracking Ad.
    */
  var cmCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The placement ID of the campaign manager 360 tracking Ad.
    */
  var cmPlacementId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCmTrackingAd {
  
  inline def apply(): SchemaCmTrackingAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCmTrackingAd]
  }
  
  extension [Self <: SchemaCmTrackingAd](x: Self) {
    
    inline def setCmAdId(value: String): Self = StObject.set(x, "cmAdId", value.asInstanceOf[js.Any])
    
    inline def setCmAdIdNull: Self = StObject.set(x, "cmAdId", null)
    
    inline def setCmAdIdUndefined: Self = StObject.set(x, "cmAdId", js.undefined)
    
    inline def setCmCreativeId(value: String): Self = StObject.set(x, "cmCreativeId", value.asInstanceOf[js.Any])
    
    inline def setCmCreativeIdNull: Self = StObject.set(x, "cmCreativeId", null)
    
    inline def setCmCreativeIdUndefined: Self = StObject.set(x, "cmCreativeId", js.undefined)
    
    inline def setCmPlacementId(value: String): Self = StObject.set(x, "cmPlacementId", value.asInstanceOf[js.Any])
    
    inline def setCmPlacementIdNull: Self = StObject.set(x, "cmPlacementId", null)
    
    inline def setCmPlacementIdUndefined: Self = StObject.set(x, "cmPlacementId", js.undefined)
  }
}
