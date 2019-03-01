package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTextProps extends js.Object {
  var actAsExpander: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CardTextProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: java.lang.String = null,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardTextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardTextProps]
  }
}

