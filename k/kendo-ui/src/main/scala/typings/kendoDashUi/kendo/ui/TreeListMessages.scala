package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListMessages extends js.Object {
  var commands: js.UndefOr[TreeListMessagesCommands] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var noRows: js.UndefOr[String] = js.undefined
  var requestFailed: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[String] = js.undefined
}

object TreeListMessages {
  @scala.inline
  def apply(
    commands: TreeListMessagesCommands = null,
    loading: String = null,
    noRows: String = null,
    requestFailed: String = null,
    retry: String = null
  ): TreeListMessages = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noRows != null) __obj.updateDynamic("noRows")(noRows.asInstanceOf[js.Any])
    if (requestFailed != null) __obj.updateDynamic("requestFailed")(requestFailed.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListMessages]
  }
}

