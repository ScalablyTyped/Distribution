package typings
package materialDashUiLib.internalTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends reactLib.reactMod.ReactNs.Props[Tooltip] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var horizontalPosition: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.tooltipHorizontal] = js.undefined
  var label: js.Any
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var verticalPosition: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.vertical] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    label: js.Any,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    horizontalPosition: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.tooltipHorizontal = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[Tooltip] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    verticalPosition: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.vertical = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition)
    __obj.asInstanceOf[TooltipProps]
  }
}

