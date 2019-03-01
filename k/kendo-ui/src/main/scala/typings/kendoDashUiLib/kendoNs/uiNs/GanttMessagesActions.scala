package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesActions extends js.Object {
  var addChild: js.UndefOr[java.lang.String] = js.undefined
  var append: js.UndefOr[java.lang.String] = js.undefined
  var insertAfter: js.UndefOr[java.lang.String] = js.undefined
  var insertBefore: js.UndefOr[java.lang.String] = js.undefined
  var pdf: js.UndefOr[java.lang.String] = js.undefined
}

object GanttMessagesActions {
  @scala.inline
  def apply(
    addChild: java.lang.String = null,
    append: java.lang.String = null,
    insertAfter: java.lang.String = null,
    insertBefore: java.lang.String = null,
    pdf: java.lang.String = null
  ): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    if (addChild != null) __obj.updateDynamic("addChild")(addChild)
    if (append != null) __obj.updateDynamic("append")(append)
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    __obj.asInstanceOf[GanttMessagesActions]
  }
}

