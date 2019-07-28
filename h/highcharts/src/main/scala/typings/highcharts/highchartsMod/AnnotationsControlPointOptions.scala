package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsControlPointOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var positioner: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[AnnotationsControlPointStyleOptions] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnnotationsControlPointOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    positioner: js.Any = null,
    style: AnnotationsControlPointStyleOptions = null,
    symbol: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnnotationsControlPointOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (positioner != null) __obj.updateDynamic("positioner")(positioner)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsControlPointOptions]
  }
}

