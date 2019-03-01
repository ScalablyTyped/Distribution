package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListMessages extends js.Object {
  var commands: js.UndefOr[TreeListMessagesCommands] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var noRows: js.UndefOr[java.lang.String] = js.undefined
  var requestFailed: js.UndefOr[java.lang.String] = js.undefined
  var retry: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListMessages {
  @scala.inline
  def apply(
    commands: TreeListMessagesCommands = null,
    loading: java.lang.String = null,
    noRows: java.lang.String = null,
    requestFailed: java.lang.String = null,
    retry: java.lang.String = null
  ): TreeListMessages = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (noRows != null) __obj.updateDynamic("noRows")(noRows)
    if (requestFailed != null) __obj.updateDynamic("requestFailed")(requestFailed)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[TreeListMessages]
  }
}

