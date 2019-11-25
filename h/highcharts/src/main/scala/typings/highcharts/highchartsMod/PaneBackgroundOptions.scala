package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneBackgroundOptions extends js.Object {
  /**
    * (Highcharts) The background color or gradient for the pane.
    */
  var backgroundColor: js.UndefOr[GradientColorObject] = js.undefined
  /**
    * (Highcharts) The pane background border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The pixel border width of the pane background.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The class name for this background.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The inner radius of the pane background. Can be either
    * numeric (pixels) or a percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The outer radius of the circular pane background. Can be
    * either numeric (pixels) or a percentage string.
    */
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The shape of the pane background. When `solid`, the
    * background is circular. When `arc`, the background extends only from the
    * min to the max of the value axis.
    */
  var shape: js.UndefOr[PaneBackgroundShapeValue] = js.undefined
}

object PaneBackgroundOptions {
  @scala.inline
  def apply(
    backgroundColor: GradientColorObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    className: String = null,
    innerRadius: Double | String = null,
    outerRadius: Double | String = null,
    shape: PaneBackgroundShapeValue = null
  ): PaneBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneBackgroundOptions]
  }
}

