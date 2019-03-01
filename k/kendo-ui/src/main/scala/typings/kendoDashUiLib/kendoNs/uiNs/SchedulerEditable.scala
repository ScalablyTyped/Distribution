package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEditable extends js.Object {
  var confirmation: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var create: js.UndefOr[scala.Boolean] = js.undefined
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  var editRecurringMode: js.UndefOr[java.lang.String] = js.undefined
  var move: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var update: js.UndefOr[scala.Boolean] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object SchedulerEditable {
  @scala.inline
  def apply(
    confirmation: scala.Boolean | java.lang.String = null,
    create: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    editRecurringMode: java.lang.String = null,
    move: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String | js.Function = null,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    window: js.Any = null
  ): SchedulerEditable = {
    val __obj = js.Dynamic.literal()
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (editRecurringMode != null) __obj.updateDynamic("editRecurringMode")(editRecurringMode)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[SchedulerEditable]
  }
}

