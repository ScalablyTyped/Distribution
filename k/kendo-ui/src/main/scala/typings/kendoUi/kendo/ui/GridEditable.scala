package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridEditable extends js.Object {
  var cancelDelete: js.UndefOr[String] = js.undefined
  var confirmDelete: js.UndefOr[String] = js.undefined
  var confirmation: js.UndefOr[Boolean | String | js.Function] = js.undefined
  var createAt: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object GridEditable {
  @scala.inline
  def apply(
    cancelDelete: String = null,
    confirmDelete: String = null,
    confirmation: Boolean | String | js.Function = null,
    createAt: String = null,
    destroy: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    template: String | js.Function = null,
    update: js.UndefOr[Boolean] = js.undefined,
    window: js.Any = null
  ): GridEditable = {
    val __obj = js.Dynamic.literal()
    if (cancelDelete != null) __obj.updateDynamic("cancelDelete")(cancelDelete.asInstanceOf[js.Any])
    if (confirmDelete != null) __obj.updateDynamic("confirmDelete")(confirmDelete.asInstanceOf[js.Any])
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation.asInstanceOf[js.Any])
    if (createAt != null) __obj.updateDynamic("createAt")(createAt.asInstanceOf[js.Any])
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridEditable]
  }
}

