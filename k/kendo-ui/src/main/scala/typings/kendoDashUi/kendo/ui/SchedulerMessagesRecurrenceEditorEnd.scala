package typings.kendoDashUi.kendo.ui

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
    if (after != null) __obj.updateDynamic("after")(after)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mobileLabel != null) __obj.updateDynamic("mobileLabel")(mobileLabel)
    if (never != null) __obj.updateDynamic("never")(never)
    if (occurrence != null) __obj.updateDynamic("occurrence")(occurrence)
    if (on != null) __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorEnd]
  }
}

