package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events allow for matching intents by event name instead of the natural
  * language input. For instance, input `&lt;event: { name:
  * &quot;welcome_event&quot;, parameters: { name: &quot;Sam&quot; } }&gt;` can
  * trigger a personalized welcome response. The parameter `name` may be used
  * by the agent in the response: `&quot;Hello #welcome_event.name! What can I
  * do for you today?&quot;`.
  */
trait SchemaGoogleCloudDialogflowV2beta1EventInput extends StObject {
  
  /**
    * Required. The language of this query. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique identifier of the event.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The collection of parameters associated with the event.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1EventInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EventInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1EventInput](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
