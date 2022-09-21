package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2OutputAudio extends StObject {
  
  /**
    * The natural language speech audio.
    */
  var audio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instructs the speech synthesizer how to generate the speech audio.
    */
  var config: js.UndefOr[SchemaGoogleCloudDialogflowV2OutputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2OutputAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2OutputAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2OutputAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2OutputAudio](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDialogflowV2OutputAudioConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
