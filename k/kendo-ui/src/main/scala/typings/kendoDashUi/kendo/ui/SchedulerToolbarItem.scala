package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerToolbarItem extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object SchedulerToolbarItem {
  @scala.inline
  def apply(name: String = null): SchedulerToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerToolbarItem]
  }
}

