package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessages extends js.Object {
  var allDay: js.UndefOr[java.lang.String] = js.undefined
  var ariaEventLabel: js.UndefOr[java.lang.String] = js.undefined
  var ariaSlotLabel: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var defaultRowText: js.UndefOr[java.lang.String] = js.undefined
  var deleteWindowTitle: js.UndefOr[java.lang.String] = js.undefined
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  var editable: js.UndefOr[SchedulerMessagesEditable] = js.undefined
  var editor: js.UndefOr[SchedulerMessagesEditor] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var pdf: js.UndefOr[java.lang.String] = js.undefined
  var previous: js.UndefOr[java.lang.String] = js.undefined
  var recurrenceEditor: js.UndefOr[SchedulerMessagesRecurrenceEditor] = js.undefined
  var recurrenceMessages: js.UndefOr[SchedulerMessagesRecurrenceMessages] = js.undefined
  var save: js.UndefOr[java.lang.String] = js.undefined
  var showFullDay: js.UndefOr[java.lang.String] = js.undefined
  var showWorkDay: js.UndefOr[java.lang.String] = js.undefined
  var time: js.UndefOr[java.lang.String] = js.undefined
  var today: js.UndefOr[java.lang.String] = js.undefined
  var views: js.UndefOr[SchedulerMessagesViews] = js.undefined
}

object SchedulerMessages {
  @scala.inline
  def apply(
    allDay: java.lang.String = null,
    ariaEventLabel: java.lang.String = null,
    ariaSlotLabel: java.lang.String = null,
    cancel: java.lang.String = null,
    date: java.lang.String = null,
    defaultRowText: java.lang.String = null,
    deleteWindowTitle: java.lang.String = null,
    destroy: java.lang.String = null,
    editable: SchedulerMessagesEditable = null,
    editor: SchedulerMessagesEditor = null,
    event: java.lang.String = null,
    next: java.lang.String = null,
    pdf: java.lang.String = null,
    previous: java.lang.String = null,
    recurrenceEditor: SchedulerMessagesRecurrenceEditor = null,
    recurrenceMessages: SchedulerMessagesRecurrenceMessages = null,
    save: java.lang.String = null,
    showFullDay: java.lang.String = null,
    showWorkDay: java.lang.String = null,
    time: java.lang.String = null,
    today: java.lang.String = null,
    views: SchedulerMessagesViews = null
  ): SchedulerMessages = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (ariaEventLabel != null) __obj.updateDynamic("ariaEventLabel")(ariaEventLabel)
    if (ariaSlotLabel != null) __obj.updateDynamic("ariaSlotLabel")(ariaSlotLabel)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (date != null) __obj.updateDynamic("date")(date)
    if (defaultRowText != null) __obj.updateDynamic("defaultRowText")(defaultRowText)
    if (deleteWindowTitle != null) __obj.updateDynamic("deleteWindowTitle")(deleteWindowTitle)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (event != null) __obj.updateDynamic("event")(event)
    if (next != null) __obj.updateDynamic("next")(next)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (recurrenceEditor != null) __obj.updateDynamic("recurrenceEditor")(recurrenceEditor)
    if (recurrenceMessages != null) __obj.updateDynamic("recurrenceMessages")(recurrenceMessages)
    if (save != null) __obj.updateDynamic("save")(save)
    if (showFullDay != null) __obj.updateDynamic("showFullDay")(showFullDay)
    if (showWorkDay != null) __obj.updateDynamic("showWorkDay")(showWorkDay)
    if (time != null) __obj.updateDynamic("time")(time)
    if (today != null) __obj.updateDynamic("today")(today)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[SchedulerMessages]
  }
}

