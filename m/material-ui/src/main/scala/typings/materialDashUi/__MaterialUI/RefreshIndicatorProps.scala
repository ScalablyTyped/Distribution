package typings.materialDashUi.__MaterialUI

import typings.materialDashUi.materialDashUiStrings.hide
import typings.materialDashUi.materialDashUiStrings.loading
import typings.materialDashUi.materialDashUiStrings.ready
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshIndicatorProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var left: Double
  var loadingColor: js.UndefOr[String] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[ready | loading | hide] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var top: Double
}

object RefreshIndicatorProps {
  @scala.inline
  def apply(
    left: Double,
    top: Double,
    color: String = null,
    loadingColor: String = null,
    percentage: Int | Double = null,
    size: Int | Double = null,
    status: ready | loading | hide = null,
    style: CSSProperties = null
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

