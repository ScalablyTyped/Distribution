package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional. Contains information about a button.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageCardButton extends js.Object {
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String] = js.native
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageCardButton {
  @scala.inline
  def apply(postback: String = null, text: String = null): SchemaGoogleCloudDialogflowV2IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCardButton]
  }
}

