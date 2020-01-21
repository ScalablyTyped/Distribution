package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessages extends js.Object {
  var allDay: js.UndefOr[String] = js.undefined
  var ariaEventLabel: js.UndefOr[String] = js.undefined
  var ariaSlotLabel: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var defaultRowText: js.UndefOr[String] = js.undefined
  var deleteWindowTitle: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[String] = js.undefined
  var editable: js.UndefOr[SchedulerMessagesEditable] = js.undefined
  var editor: js.UndefOr[SchedulerMessagesEditor] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var pdf: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var recurrenceEditor: js.UndefOr[SchedulerMessagesRecurrenceEditor] = js.undefined
  var recurrenceMessages: js.UndefOr[SchedulerMessagesRecurrenceMessages] = js.undefined
  var save: js.UndefOr[String] = js.undefined
  var showFullDay: js.UndefOr[String] = js.undefined
  var showWorkDay: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var today: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[SchedulerMessagesViews] = js.undefined
}

object SchedulerMessages {
  @scala.inline
  def apply(
    allDay: String = null,
    ariaEventLabel: String = null,
    ariaSlotLabel: String = null,
    cancel: String = null,
    date: String = null,
    defaultRowText: String = null,
    deleteWindowTitle: String = null,
    destroy: String = null,
    editable: SchedulerMessagesEditable = null,
    editor: SchedulerMessagesEditor = null,
    event: String = null,
    next: String = null,
    pdf: String = null,
    previous: String = null,
    recurrenceEditor: SchedulerMessagesRecurrenceEditor = null,
    recurrenceMessages: SchedulerMessagesRecurrenceMessages = null,
    save: String = null,
    showFullDay: String = null,
    showWorkDay: String = null,
    time: String = null,
    today: String = null,
    views: SchedulerMessagesViews = null
  ): SchedulerMessages = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (ariaEventLabel != null) __obj.updateDynamic("ariaEventLabel")(ariaEventLabel.asInstanceOf[js.Any])
    if (ariaSlotLabel != null) __obj.updateDynamic("ariaSlotLabel")(ariaSlotLabel.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultRowText != null) __obj.updateDynamic("defaultRowText")(defaultRowText.asInstanceOf[js.Any])
    if (deleteWindowTitle != null) __obj.updateDynamic("deleteWindowTitle")(deleteWindowTitle.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (recurrenceEditor != null) __obj.updateDynamic("recurrenceEditor")(recurrenceEditor.asInstanceOf[js.Any])
    if (recurrenceMessages != null) __obj.updateDynamic("recurrenceMessages")(recurrenceMessages.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (showFullDay != null) __obj.updateDynamic("showFullDay")(showFullDay.asInstanceOf[js.Any])
    if (showWorkDay != null) __obj.updateDynamic("showWorkDay")(showWorkDay.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessages]
  }
}

