package typings.highcharts.highchartsMod

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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    d: String | SVGPathArray = null,
    fill: ColorString | GradientColorObject | PatternObject = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    matrix: js.Array[Double] = null,
    rotation: Int | Double = null,
    rotationOriginX: Int | Double = null,
    rotationOriginY: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    stroke: ColorString | GradientColorObject | PatternObject = null,
    style: String | CSSObject = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    zIndex: Int | Double = null
  ): SVGAttributes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationOriginX != null) __obj.updateDynamic("rotationOriginX")(rotationOriginX.asInstanceOf[js.Any])
    if (rotationOriginY != null) __obj.updateDynamic("rotationOriginY")(rotationOriginY.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributes]
  }
}

