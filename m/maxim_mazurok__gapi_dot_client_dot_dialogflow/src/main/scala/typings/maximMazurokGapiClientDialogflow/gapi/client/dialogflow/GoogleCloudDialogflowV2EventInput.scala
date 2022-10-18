package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2EventInput extends StObject {
  
  /**
    * Required. The language of this query. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported language codes. Note
    * that queries in the same session do not necessarily need to specify the same language. This field is ignored when used in the context of a WebhookResponse.followup_event_input
    * field, because the language was already defined in the originating detect intent request.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The unique identifier of the event. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of parameters associated with the event. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON
    * object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite
    * entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a composite
    * entity: map from composite entity property names to property values - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GoogleCloudDialogflowV2EventInput {
  
  inline def apply(): GoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2EventInput]
  }
  
  extension [Self <: GoogleCloudDialogflowV2EventInput](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
