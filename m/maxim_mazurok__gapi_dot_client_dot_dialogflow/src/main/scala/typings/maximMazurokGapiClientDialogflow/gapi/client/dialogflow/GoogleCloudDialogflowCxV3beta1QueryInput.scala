package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1QueryInput extends StObject {
  
  /** The natural language speech audio to be processed. */
  var audio: js.UndefOr[GoogleCloudDialogflowCxV3beta1AudioInput] = js.undefined
  
  /** The DTMF event to be handled. */
  var dtmf: js.UndefOr[GoogleCloudDialogflowCxV3beta1DtmfInput] = js.undefined
  
  /** The event to be triggered. */
  var event: js.UndefOr[GoogleCloudDialogflowCxV3beta1EventInput] = js.undefined
  
  /** The intent to be triggered. */
  var intent: js.UndefOr[GoogleCloudDialogflowCxV3beta1IntentInput] = js.undefined
  
  /**
    * Required. The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
    * Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** The natural language text to be processed. */
  var text: js.UndefOr[GoogleCloudDialogflowCxV3beta1TextInput] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1QueryInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1QueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1QueryInput] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: GoogleCloudDialogflowCxV3beta1AudioInput): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setDtmf(value: GoogleCloudDialogflowCxV3beta1DtmfInput): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    inline def setEvent(value: GoogleCloudDialogflowCxV3beta1EventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIntent(value: GoogleCloudDialogflowCxV3beta1IntentInput): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: GoogleCloudDialogflowCxV3beta1TextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
