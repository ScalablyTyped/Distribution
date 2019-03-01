package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterable extends js.Object {
  var extra: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[GridFilterableMessages] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var operators: js.UndefOr[GridFilterableOperators] = js.undefined
}

object GridFilterable {
  @scala.inline
  def apply(
    extra: js.UndefOr[scala.Boolean] = js.undefined,
    messages: GridFilterableMessages = null,
    mode: java.lang.String = null,
    operators: GridFilterableOperators = null
  ): GridFilterable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[GridFilterable]
  }
}

