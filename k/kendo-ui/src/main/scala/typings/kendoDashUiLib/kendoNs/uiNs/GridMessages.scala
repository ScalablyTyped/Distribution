package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMessages extends js.Object {
  var commands: js.UndefOr[GridMessagesCommands] = js.undefined
  var expandCollapseColumnHeader: js.UndefOr[java.lang.String] = js.undefined
  var noRecords: js.UndefOr[java.lang.String] = js.undefined
}

object GridMessages {
  @scala.inline
  def apply(
    commands: GridMessagesCommands = null,
    expandCollapseColumnHeader: java.lang.String = null,
    noRecords: java.lang.String = null
  ): GridMessages = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (expandCollapseColumnHeader != null) __obj.updateDynamic("expandCollapseColumnHeader")(expandCollapseColumnHeader)
    if (noRecords != null) __obj.updateDynamic("noRecords")(noRecords)
    __obj.asInstanceOf[GridMessages]
  }
}

