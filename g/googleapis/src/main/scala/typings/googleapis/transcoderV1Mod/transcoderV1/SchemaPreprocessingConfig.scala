package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreprocessingConfig extends StObject {
  
  /**
    * Audio preprocessing configuration.
    */
  var audio: js.UndefOr[SchemaAudio] = js.undefined
  
  /**
    * Color preprocessing configuration.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Specify the video cropping configuration.
    */
  var crop: js.UndefOr[SchemaCrop] = js.undefined
  
  /**
    * Deblock preprocessing configuration.
    */
  var deblock: js.UndefOr[SchemaDeblock] = js.undefined
  
  /**
    * Denoise preprocessing configuration.
    */
  var denoise: js.UndefOr[SchemaDenoise] = js.undefined
  
  /**
    * Specify the video pad filter configuration.
    */
  var pad: js.UndefOr[SchemaPad] = js.undefined
}
object SchemaPreprocessingConfig {
  
  inline def apply(): SchemaPreprocessingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreprocessingConfig]
  }
  
  extension [Self <: SchemaPreprocessingConfig](x: Self) {
    
    inline def setAudio(value: SchemaAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrop(value: SchemaCrop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setDeblock(value: SchemaDeblock): Self = StObject.set(x, "deblock", value.asInstanceOf[js.Any])
    
    inline def setDeblockUndefined: Self = StObject.set(x, "deblock", js.undefined)
    
    inline def setDenoise(value: SchemaDenoise): Self = StObject.set(x, "denoise", value.asInstanceOf[js.Any])
    
    inline def setDenoiseUndefined: Self = StObject.set(x, "denoise", js.undefined)
    
    inline def setPad(value: SchemaPad): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
