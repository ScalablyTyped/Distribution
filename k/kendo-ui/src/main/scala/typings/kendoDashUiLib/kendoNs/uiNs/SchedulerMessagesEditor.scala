package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesEditor extends js.Object {
  var allDayEvent: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var editorTitle: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var endTimezone: js.UndefOr[java.lang.String] = js.undefined
  var repeat: js.UndefOr[java.lang.String] = js.undefined
  var separateTimezones: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var startTimezone: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var timezoneEditorButton: js.UndefOr[java.lang.String] = js.undefined
  var timezoneEditorTitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesEditor {
  @scala.inline
  def apply(
    allDayEvent: java.lang.String = null,
    description: java.lang.String = null,
    editorTitle: java.lang.String = null,
    end: java.lang.String = null,
    endTimezone: java.lang.String = null,
    repeat: java.lang.String = null,
    separateTimezones: java.lang.String = null,
    start: java.lang.String = null,
    startTimezone: java.lang.String = null,
    timezone: java.lang.String = null,
    timezoneEditorButton: java.lang.String = null,
    timezoneEditorTitle: java.lang.String = null,
    title: java.lang.String = null
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

