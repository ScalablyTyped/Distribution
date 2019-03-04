package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshIndicatorProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var left: scala.Double
  var loadingColor: js.UndefOr[java.lang.String] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var status: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.ready | materialDashUiLib.materialDashUiLibStrings.loading | materialDashUiLib.materialDashUiLibStrings.hide
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var top: scala.Double
}

object RefreshIndicatorProps {
  @scala.inline
  def apply(
    left: scala.Double,
    top: scala.Double,
    color: java.lang.String = null,
    loadingColor: java.lang.String = null,
    percentage: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    status: materialDashUiLib.materialDashUiLibStrings.ready | materialDashUiLib.materialDashUiLibStrings.loading | materialDashUiLib.materialDashUiLibStrings.hide = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): RefreshIndicatorProps = {
    val __obj = js.Dynamic.literal(left = left, top = top)
    if (color != null) __obj.updateDynamic("color")(color)
    if (loadingColor != null) __obj.updateDynamic("loadingColor")(loadingColor)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RefreshIndicatorProps]
  }
}

