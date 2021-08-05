package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2TextInput extends StObject {
  
  /**
    * Required. The language of this conversational query. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported
    * language codes. Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2TextInput {
  
  inline def apply(): GoogleCloudDialogflowV2TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2TextInput]
  }
  
  extension [Self <: GoogleCloudDialogflowV2TextInput](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
