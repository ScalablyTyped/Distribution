package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerGroup extends js.Object {
  var date: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
}

object SchedulerGroup {
  @scala.inline
  def apply(date: js.UndefOr[Boolean] = js.undefined, orientation: String = null, resources: js.Any = null): SchedulerGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerGroup]
  }
}

