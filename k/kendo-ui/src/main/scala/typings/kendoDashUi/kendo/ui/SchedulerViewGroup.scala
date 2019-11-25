package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerViewGroup extends js.Object {
  var date: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
}

object SchedulerViewGroup {
  @scala.inline
  def apply(date: js.UndefOr[Boolean] = js.undefined, orientation: String = null): SchedulerViewGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerViewGroup]
  }
}

