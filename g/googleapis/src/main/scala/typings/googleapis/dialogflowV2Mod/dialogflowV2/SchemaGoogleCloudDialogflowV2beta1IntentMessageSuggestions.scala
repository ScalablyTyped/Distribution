package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions extends StObject {
  
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestionsMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
