package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationControlPointOptionsObject extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.undefined
  var style: js.UndefOr[
    AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions
  ] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnnotationControlPointOptionsObject {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    positioner: AnnotationControlPointPositionerFunction = null,
    style: AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions = null,
    symbol: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AnnotationControlPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (positioner != null) __obj.updateDynamic("positioner")(positioner.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationControlPointOptionsObject]
  }
}

