package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesEditor extends js.Object {
  var allDayEvent: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var editorTitle: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var endTimezone: js.UndefOr[String] = js.undefined
  var repeat: js.UndefOr[String] = js.undefined
  var separateTimezones: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var startTimezone: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var timezoneEditorButton: js.UndefOr[String] = js.undefined
  var timezoneEditorTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesEditor {
  @scala.inline
  def apply(
    allDayEvent: String = null,
    description: String = null,
    editorTitle: String = null,
    end: String = null,
    endTimezone: String = null,
    repeat: String = null,
    separateTimezones: String = null,
    start: String = null,
    startTimezone: String = null,
    timezone: String = null,
    timezoneEditorButton: String = null,
    timezoneEditorTitle: String = null,
    title: String = null
  ): SchedulerMessagesEditor = {
    val __obj = js.Dynamic.literal()
    if (allDayEvent != null) __obj.updateDynamic("allDayEvent")(allDayEvent)
    if (description != null) __obj.updateDynamic("description")(description)
    if (editorTitle != null) __obj.updateDynamic("editorTitle")(editorTitle)
    if (end != null) __obj.updateDynamic("end")(end)
    if (endTimezone != null) __obj.updateDynamic("endTimezone")(endTimezone)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    if (separateTimezones != null) __obj.updateDynamic("separateTimezones")(separateTimezones)
    if (start != null) __obj.updateDynamic("start")(start)
    if (startTimezone != null) __obj.updateDynamic("startTimezone")(startTimezone)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (timezoneEditorButton != null) __obj.updateDynamic("timezoneEditorButton")(timezoneEditorButton)
    if (timezoneEditorTitle != null) __obj.updateDynamic("timezoneEditorTitle")(timezoneEditorTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SchedulerMessagesEditor]
  }
}

