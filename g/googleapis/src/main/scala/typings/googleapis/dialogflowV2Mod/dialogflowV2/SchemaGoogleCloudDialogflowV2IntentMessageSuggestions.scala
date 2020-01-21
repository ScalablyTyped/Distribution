package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(suggestions: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion] = null): SchemaGoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions]
  }
}

