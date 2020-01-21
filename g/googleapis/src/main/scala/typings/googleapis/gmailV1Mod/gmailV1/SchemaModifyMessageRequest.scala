package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModifyMessageRequest extends js.Object {
  /**
    * A list of IDs of labels to add to this message.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list IDs of labels to remove from this message.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyMessageRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[String] = null, removeLabelIds: js.Array[String] = null): SchemaModifyMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyMessageRequest]
  }
}

