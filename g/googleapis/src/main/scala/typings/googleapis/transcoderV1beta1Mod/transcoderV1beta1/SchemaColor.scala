package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColor extends StObject {
  
  /**
    * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
    */
  var brightness: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
    */
  var contrast: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
    */
  var saturation: js.UndefOr[Double | Null] = js.undefined
}
object SchemaColor {
  
  inline def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  
  extension [Self <: SchemaColor](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessNull: Self = StObject.set(x, "brightness", null)
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastNull: Self = StObject.set(x, "contrast", null)
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationNull: Self = StObject.set(x, "saturation", null)
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
  }
}
