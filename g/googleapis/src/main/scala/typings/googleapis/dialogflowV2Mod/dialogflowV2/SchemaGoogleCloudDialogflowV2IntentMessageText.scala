package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The text response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageText extends js.Object {
  /**
    * Optional. The collection of the agent&#39;s responses.
    */
  var text: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageText {
  @scala.inline
  def apply(text: js.Array[String] = null): SchemaGoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageText]
  }
}

