package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHistoryLabelAdded extends js.Object {
  /**
    * Label IDs added to the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaHistoryLabelAdded {
  @scala.inline
  def apply(labelIds: js.Array[String] = null, message: SchemaMessage = null): SchemaHistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistoryLabelAdded]
  }
}

