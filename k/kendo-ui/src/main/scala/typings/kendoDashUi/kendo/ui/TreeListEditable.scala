package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListEditable extends js.Object {
  var mode: js.UndefOr[String] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object TreeListEditable {
  @scala.inline
  def apply(
    mode: String = null,
    move: js.UndefOr[Boolean] = js.undefined,
    template: String | js.Function = null,
    window: js.Any = null
  ): TreeListEditable = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListEditable]
  }
}

