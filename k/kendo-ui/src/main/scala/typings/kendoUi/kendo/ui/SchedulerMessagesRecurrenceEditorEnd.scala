package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorEnd extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var mobileLabel: js.UndefOr[String] = js.undefined
  var never: js.UndefOr[String] = js.undefined
  var occurrence: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorEnd {
  @scala.inline
  def apply(
    after: String = null,
    label: String = null,
    mobileLabel: String = null,
    never: String = null,
    occurrence: String = null,
    on: String = null
  ): SchedulerMessagesRecurrenceEditorEnd = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mobileLabel != null) __obj.updateDynamic("mobileLabel")(mobileLabel.asInstanceOf[js.Any])
    if (never != null) __obj.updateDynamic("never")(never.asInstanceOf[js.Any])
    if (occurrence != null) __obj.updateDynamic("occurrence")(occurrence.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorEnd]
  }
}

