package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorEnd extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var mobileLabel: js.UndefOr[java.lang.String] = js.undefined
  var never: js.UndefOr[java.lang.String] = js.undefined
  var occurrence: js.UndefOr[java.lang.String] = js.undefined
  var on: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorEnd {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    label: java.lang.String = null,
    mobileLabel: java.lang.String = null,
    never: java.lang.String = null,
    occurrence: java.lang.String = null,
    on: java.lang.String = null
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

