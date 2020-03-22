package typings.materializeCss

import typings.materializeCss.materializeCssStrings.buttom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.FloatingActionButtonOptions> */
trait PartialFloatingActionButt extends js.Object {
  var direction: js.UndefOr[top | right | buttom | left] = js.undefined
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
}

object PartialFloatingActionButt {
  @scala.inline
  def apply(
    direction: top | right | buttom | left = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    toolbarEnabled: js.UndefOr[Boolean] = js.undefined
  ): PartialFloatingActionButt = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarEnabled)) __obj.updateDynamic("toolbarEnabled")(toolbarEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFloatingActionButt]
  }
}

