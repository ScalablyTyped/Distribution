package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDenoise extends StObject {
  
  /**
    * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0.
    */
  var strength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Set the denoiser mode. The default is `"standard"`. Supported denoiser modes: - 'standard' - 'grain'
    */
  var tune: js.UndefOr[String | Null] = js.undefined
}
object SchemaDenoise {
  
  inline def apply(): SchemaDenoise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDenoise]
  }
  
  extension [Self <: SchemaDenoise](x: Self) {
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthNull: Self = StObject.set(x, "strength", null)
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setTune(value: String): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
    
    inline def setTuneNull: Self = StObject.set(x, "tune", null)
    
    inline def setTuneUndefined: Self = StObject.set(x, "tune", js.undefined)
  }
}
