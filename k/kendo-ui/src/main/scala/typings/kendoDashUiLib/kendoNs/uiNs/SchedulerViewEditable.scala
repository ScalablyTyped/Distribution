package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerViewEditable extends js.Object {
  var create: js.UndefOr[scala.Boolean] = js.undefined
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

object SchedulerViewEditable {
  @scala.inline
  def apply(
    create: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    update: js.UndefOr[scala.Boolean] = js.undefined
  ): SchedulerViewEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SchedulerViewEditable]
  }
}

