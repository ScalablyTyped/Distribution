package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorOffsetPositions extends js.Object {
  var first: js.UndefOr[java.lang.String] = js.undefined
  var fourth: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var second: js.UndefOr[java.lang.String] = js.undefined
  var third: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorOffsetPositions {
  @scala.inline
  def apply(
    first: java.lang.String = null,
    fourth: java.lang.String = null,
    last: java.lang.String = null,
    second: java.lang.String = null,
    third: java.lang.String = null
  ): SchedulerMessagesRecurrenceEditorOffsetPositions = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first)
    if (fourth != null) __obj.updateDynamic("fourth")(fourth)
    if (last != null) __obj.updateDynamic("last")(last)
    if (second != null) __obj.updateDynamic("second")(second)
    if (third != null) __obj.updateDynamic("third")(third)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorOffsetPositions]
  }
}

