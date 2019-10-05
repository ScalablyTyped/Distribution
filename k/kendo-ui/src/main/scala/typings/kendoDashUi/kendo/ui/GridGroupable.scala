package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupable extends js.Object {
  var compare: js.UndefOr[js.Function] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[GridGroupableMessages] = js.undefined
  var showFooter: js.UndefOr[Boolean] = js.undefined
}

object GridGroupable {
  @scala.inline
  def apply(
    compare: js.Function = null,
    dir: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    messages: GridGroupableMessages = null,
    showFooter: js.UndefOr[Boolean] = js.undefined
  ): GridGroupable = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    __obj.asInstanceOf[GridGroupable]
  }
}

