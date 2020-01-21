package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The quick replies response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies extends js.Object {
  /**
    * Optional. The collection of quick replies.
    */
  var quickReplies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The title of the collection of quick replies.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies {
  @scala.inline
  def apply(quickReplies: js.Array[String] = null, title: String = null): SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
}

