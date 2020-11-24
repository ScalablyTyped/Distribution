package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageSuggestions extends js.Object {
  
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
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageSuggestionsOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
}
