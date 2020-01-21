package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of actions to perform on a message.
  */
@js.native
trait SchemaFilterAction extends js.Object {
  /**
    * List of labels to add to the message.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Email address that the message should be forwarded to.
    */
  var forward: js.UndefOr[String] = js.native
  /**
    * List of labels to remove from the message.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFilterAction {
  @scala.inline
  def apply(
    addLabelIds: js.Array[String] = null,
    forward: String = null,
    removeLabelIds: js.Array[String] = null
  ): SchemaFilterAction = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterAction]
  }
}

