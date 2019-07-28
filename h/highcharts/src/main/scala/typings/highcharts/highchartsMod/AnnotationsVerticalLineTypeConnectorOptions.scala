package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineTypeConnectorOptions extends js.Object {
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  var markerEnd: js.UndefOr[String] = js.undefined
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

object AnnotationsVerticalLineTypeConnectorOptions {
  @scala.inline
  def apply(
    fill: ColorString | GradientColorObject | PatternObject = null,
    markerEnd: String = null,
    snap: Int | Double = null,
    stroke: ColorString = null,
    strokeWidth: Int | Double = null
  ): AnnotationsVerticalLineTypeConnectorOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd)
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineTypeConnectorOptions]
  }
}

