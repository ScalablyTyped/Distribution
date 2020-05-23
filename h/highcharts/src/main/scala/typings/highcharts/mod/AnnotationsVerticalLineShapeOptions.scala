package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineShapeOptions extends js.Object {
  /**
    * (Highstock) Name of the dash style to use for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The height of the shape.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The radius of the shape.
    */
  var r: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Defines additional snapping area around an annotation making
    * this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The URL for an image to use as the annotation shape. Note,
    * type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) The pixel stroke width of the shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The type of the shape, e.g. circle or rectangle.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The width of the shape.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnnotationsVerticalLineShapeOptions {
  @scala.inline
  def apply(
    dashStyle: DashStyleValue = null,
    fill: ColorString | GradientColorObject | PatternObject = null,
    height: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined,
    snap: js.UndefOr[Double] = js.undefined,
    src: String = null,
    stroke: ColorString = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): AnnotationsVerticalLineShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineShapeOptions]
  }
}

