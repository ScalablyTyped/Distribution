package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterable extends js.Object {
  var extra: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[TreeListFilterableMessages] = js.undefined
  var operators: js.UndefOr[TreeListFilterableOperators] = js.undefined
}

object TreeListFilterable {
  @scala.inline
  def apply(
    extra: js.UndefOr[Boolean] = js.undefined,
    messages: TreeListFilterableMessages = null,
    operators: TreeListFilterableOperators = null
  ): TreeListFilterable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[TreeListFilterable]
  }
}

