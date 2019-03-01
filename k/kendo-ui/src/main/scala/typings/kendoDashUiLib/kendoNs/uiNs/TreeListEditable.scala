package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListEditable extends js.Object {
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var move: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object TreeListEditable {
  @scala.inline
  def apply(
    mode: java.lang.String = null,
    move: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String | js.Function = null,
    window: js.Any = null
  ): TreeListEditable = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[TreeListEditable]
  }
}

