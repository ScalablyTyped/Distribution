package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageSuggestions extends StObject {
  
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageSuggestions {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageSuggestionsMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
