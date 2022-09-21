package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3QueryInput extends StObject {
  
  /**
    * The natural language speech audio to be processed.
    */
  var audio: js.UndefOr[SchemaGoogleCloudDialogflowCxV3AudioInput] = js.undefined
  
  /**
    * The DTMF event to be handled.
    */
  var dtmf: js.UndefOr[SchemaGoogleCloudDialogflowCxV3DtmfInput] = js.undefined
  
  /**
    * The event to be triggered.
    */
  var event: js.UndefOr[SchemaGoogleCloudDialogflowCxV3EventInput] = js.undefined
  
  /**
    * The intent to be triggered.
    */
  var intent: js.UndefOr[SchemaGoogleCloudDialogflowCxV3IntentInput] = js.undefined
  
  /**
    * Required. The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The natural language text to be processed.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TextInput] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3QueryInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3QueryInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3QueryInput](x: Self) {
    
    inline def setAudio(value: SchemaGoogleCloudDialogflowCxV3AudioInput): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setDtmf(value: SchemaGoogleCloudDialogflowCxV3DtmfInput): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    inline def setEvent(value: SchemaGoogleCloudDialogflowCxV3EventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIntent(value: SchemaGoogleCloudDialogflowCxV3IntentInput): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: SchemaGoogleCloudDialogflowCxV3TextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
