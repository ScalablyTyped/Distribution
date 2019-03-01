package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerToolbarItem extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerToolbarItem {
  @scala.inline
  def apply(name: java.lang.String = null): SchedulerToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SchedulerToolbarItem]
  }
}

