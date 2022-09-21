package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2QueryInput extends StObject {
  
  /**
    * Instructs the speech recognizer how to process the speech audio.
    */
  var audioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2InputAudioConfig] = js.undefined
  
  /**
    * The event to be processed.
    */
  var event: js.UndefOr[SchemaGoogleCloudDialogflowV2EventInput] = js.undefined
  
  /**
    * The natural language text to be processed. Text length must not exceed 256 character for virtual agent interactions.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2TextInput] = js.undefined
}
object SchemaGoogleCloudDialogflowV2QueryInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2QueryInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2QueryInput](x: Self) {
    
    inline def setAudioConfig(value: SchemaGoogleCloudDialogflowV2InputAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setEvent(value: SchemaGoogleCloudDialogflowV2EventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setText(value: SchemaGoogleCloudDialogflowV2TextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
