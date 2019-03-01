package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridEditable extends js.Object {
  var cancelDelete: js.UndefOr[java.lang.String] = js.undefined
  var confirmDelete: js.UndefOr[java.lang.String] = js.undefined
  var confirmation: js.UndefOr[scala.Boolean | java.lang.String | js.Function] = js.undefined
  var createAt: js.UndefOr[java.lang.String] = js.undefined
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var update: js.UndefOr[scala.Boolean] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object GridEditable {
  @scala.inline
  def apply(
    cancelDelete: java.lang.String = null,
    confirmDelete: java.lang.String = null,
    confirmation: scala.Boolean | java.lang.String | js.Function = null,
    createAt: java.lang.String = null,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    window: js.Any = null
  ): GridEditable = {
    val __obj = js.Dynamic.literal()
    if (cancelDelete != null) __obj.updateDynamic("cancelDelete")(cancelDelete)
    if (confirmDelete != null) __obj.updateDynamic("confirmDelete")(confirmDelete)
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation.asInstanceOf[js.Any])
    if (createAt != null) __obj.updateDynamic("createAt")(createAt)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[GridEditable]
  }
}

