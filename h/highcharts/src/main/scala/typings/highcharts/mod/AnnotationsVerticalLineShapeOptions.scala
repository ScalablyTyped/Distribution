package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineShapeOptions extends js.Object {
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
    fill: ColorString | GradientColorObject | PatternObject = null,
    height: Int | Double = null,
    r: Int | Double = null,
    snap: Int | Double = null,
    stroke: ColorString = null,
    strokeWidth: Int | Double = null,
    `type`: String = null,
    width: Int | Double = null
  ): AnnotationsVerticalLineShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineShapeOptions]
  }
}

