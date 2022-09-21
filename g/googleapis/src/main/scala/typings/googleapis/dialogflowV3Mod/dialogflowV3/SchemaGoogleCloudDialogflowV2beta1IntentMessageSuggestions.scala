package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions extends StObject {
  
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions](x: Self) {
    
    inline def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
