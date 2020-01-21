package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterable extends js.Object {
  var extra: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[GridFilterableMessages] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var operators: js.UndefOr[GridFilterableOperators] = js.undefined
}

object GridFilterable {
  @scala.inline
  def apply(
    extra: js.UndefOr[Boolean] = js.undefined,
    messages: GridFilterableMessages = null,
    mode: String = null,
    operators: GridFilterableOperators = null
  ): GridFilterable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (operators != null) __obj.updateDynamic("operators")(operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFilterable]
  }
}

