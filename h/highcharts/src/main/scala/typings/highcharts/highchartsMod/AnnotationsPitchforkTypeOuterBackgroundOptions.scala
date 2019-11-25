package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsPitchforkTypeOuterBackgroundOptions extends js.Object {
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[String] = js.undefined
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
}

object AnnotationsPitchforkTypeOuterBackgroundOptions {
  @scala.inline
  def apply(
    fill: String = null,
    snap: Int | Double = null,
    stroke: ColorString = null,
    strokeWidth: Int | Double = null
  ): AnnotationsPitchforkTypeOuterBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsPitchforkTypeOuterBackgroundOptions]
  }
}

