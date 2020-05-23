package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttributes
  extends /* key */ StringDictionary[js.Any] {
  var d: js.UndefOr[String | SVGPathArray] = js.undefined
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var rotationOriginX: js.UndefOr[Double] = js.undefined
  var rotationOriginY: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  var style: js.UndefOr[String | CSSObject] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SVGAttributes {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    d: String | SVGPathArray = null,
    fill: ColorString | GradientColorObject | PatternObject = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    matrix: js.Array[Double] = null,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationOriginX: js.UndefOr[Double] = js.undefined,
    rotationOriginY: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    stroke: ColorString | GradientColorObject | PatternObject = null,
    style: String | CSSObject = null,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SVGAttributes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationOriginX)) __obj.updateDynamic("rotationOriginX")(rotationOriginX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationOriginY)) __obj.updateDynamic("rotationOriginY")(rotationOriginY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributes]
  }
}

