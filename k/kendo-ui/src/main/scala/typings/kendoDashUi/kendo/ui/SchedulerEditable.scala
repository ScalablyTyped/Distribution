package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEditable extends js.Object {
  var confirmation: js.UndefOr[Boolean | String] = js.undefined
  var create: js.UndefOr[Boolean] = js.undefined
  var destroy: js.UndefOr[Boolean] = js.undefined
  var editRecurringMode: js.UndefOr[String] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object SchedulerEditable {
  @scala.inline
  def apply(
    confirmation: Boolean | String = null,
    create: js.UndefOr[Boolean] = js.undefined,
    destroy: js.UndefOr[Boolean] = js.undefined,
    editRecurringMode: String = null,
    move: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    template: String | js.Function = null,
    update: js.UndefOr[Boolean] = js.undefined,
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

