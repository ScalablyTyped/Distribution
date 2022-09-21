package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageSuggestions extends StObject {
  
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageSuggestions {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions](x: Self) {
    
    inline def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
