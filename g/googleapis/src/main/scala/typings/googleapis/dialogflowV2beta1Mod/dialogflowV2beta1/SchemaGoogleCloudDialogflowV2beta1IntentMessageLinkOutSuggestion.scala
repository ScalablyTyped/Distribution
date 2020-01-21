package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion chip message that allows the user to jump out to the app or
  * website associated with this agent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion extends js.Object {
  /**
    * Required. The name of the app or site this chip is linking to.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Required. The URI of the app or site to open when the user taps the
    * suggestion chip.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(destinationName: String = null, uri: String = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion]
  }
}

