package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerifyVideoViewability extends StObject {
  
  /**
    * Target inventory to maximize impressions with 400x300 or greater player size.
    */
  var playerImpressionRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target web inventory to maximize IAB viewable rate.
    */
  var videoIab: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target web inventory to maximize fully viewable rate.
    */
  var videoViewableRate: js.UndefOr[String | Null] = js.undefined
}
object SchemaDoubleVerifyVideoViewability {
  
  inline def apply(): SchemaDoubleVerifyVideoViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerifyVideoViewability]
  }
  
  extension [Self <: SchemaDoubleVerifyVideoViewability](x: Self) {
    
    inline def setPlayerImpressionRate(value: String): Self = StObject.set(x, "playerImpressionRate", value.asInstanceOf[js.Any])
    
    inline def setPlayerImpressionRateNull: Self = StObject.set(x, "playerImpressionRate", null)
    
    inline def setPlayerImpressionRateUndefined: Self = StObject.set(x, "playerImpressionRate", js.undefined)
    
    inline def setVideoIab(value: String): Self = StObject.set(x, "videoIab", value.asInstanceOf[js.Any])
    
    inline def setVideoIabNull: Self = StObject.set(x, "videoIab", null)
    
    inline def setVideoIabUndefined: Self = StObject.set(x, "videoIab", js.undefined)
    
    inline def setVideoViewableRate(value: String): Self = StObject.set(x, "videoViewableRate", value.asInstanceOf[js.Any])
    
    inline def setVideoViewableRateNull: Self = StObject.set(x, "videoViewableRate", null)
    
    inline def setVideoViewableRateUndefined: Self = StObject.set(x, "videoViewableRate", js.undefined)
  }
}
