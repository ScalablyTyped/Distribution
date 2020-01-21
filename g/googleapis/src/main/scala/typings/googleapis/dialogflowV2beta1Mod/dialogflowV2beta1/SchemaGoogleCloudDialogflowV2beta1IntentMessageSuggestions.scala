package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions extends js.Object {
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  @scala.inline
  def apply(suggestions: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion] = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
}

