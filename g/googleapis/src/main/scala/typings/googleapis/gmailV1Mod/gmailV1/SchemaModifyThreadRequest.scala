package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModifyThreadRequest extends js.Object {
  /**
    * A list of IDs of labels to add to this thread.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IDs of labels to remove from this thread.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyThreadRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[String] = null, removeLabelIds: js.Array[String] = null): SchemaModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyThreadRequest]
  }
}

