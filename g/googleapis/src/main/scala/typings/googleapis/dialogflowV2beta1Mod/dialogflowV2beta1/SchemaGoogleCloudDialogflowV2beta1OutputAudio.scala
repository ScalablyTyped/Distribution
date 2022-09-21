package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1OutputAudio extends StObject {
  
  /**
    * Required. The natural language speech audio.
    */
  var audio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Instructs the speech synthesizer how to generate the speech audio.
    */
  var config: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1OutputAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1OutputAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1OutputAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1OutputAudio](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
