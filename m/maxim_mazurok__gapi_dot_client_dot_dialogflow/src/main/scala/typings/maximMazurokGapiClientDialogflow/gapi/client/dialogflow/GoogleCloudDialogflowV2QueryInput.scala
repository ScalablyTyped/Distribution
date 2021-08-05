package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2QueryInput extends StObject {
  
  /** Instructs the speech recognizer how to process the speech audio. */
  var audioConfig: js.UndefOr[GoogleCloudDialogflowV2InputAudioConfig] = js.undefined
  
  /** The event to be processed. */
  var event: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.undefined
  
  /** The natural language text to be processed. */
  var text: js.UndefOr[GoogleCloudDialogflowV2TextInput] = js.undefined
}
object GoogleCloudDialogflowV2QueryInput {
  
  inline def apply(): GoogleCloudDialogflowV2QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryInput]
  }
  
  extension [Self <: GoogleCloudDialogflowV2QueryInput](x: Self) {
    
    inline def setAudioConfig(value: GoogleCloudDialogflowV2InputAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setEvent(value: GoogleCloudDialogflowV2EventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setText(value: GoogleCloudDialogflowV2TextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
