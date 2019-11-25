package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesActions extends js.Object {
  var addChild: js.UndefOr[String] = js.undefined
  var append: js.UndefOr[String] = js.undefined
  var insertAfter: js.UndefOr[String] = js.undefined
  var insertBefore: js.UndefOr[String] = js.undefined
  var pdf: js.UndefOr[String] = js.undefined
}

object GanttMessagesActions {
  @scala.inline
  def apply(
    addChild: String = null,
    append: String = null,
    insertAfter: String = null,
    insertBefore: String = null,
    pdf: String = null
  ): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    if (addChild != null) __obj.updateDynamic("addChild")(addChild.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter.asInstanceOf[js.Any])
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMessagesActions]
  }
}

