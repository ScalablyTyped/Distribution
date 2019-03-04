package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneBackground extends js.Object {
  /**
    * @default {linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 }, stops: [[0, '#FFF'],[1, '#DDD']]}
    */
  var backgroundColor: java.lang.String | Gradient
  /**
    * @default 'silver'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The class name for this background.
    * @since 5.0.0
    * @default 'highcharts-pane'
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 0
    */
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default '105%'
    */
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default 'circle'
    */
  var shape: js.UndefOr[java.lang.String] = js.undefined
}

object PaneBackground {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String | Gradient,
    borderColor: java.lang.String | Gradient = null,
    borderWidth: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    innerRadius: scala.Double | java.lang.String = null,
    outerRadius: scala.Double | java.lang.String = null,
    shape: java.lang.String = null
  ): PaneBackground = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[PaneBackground]
  }
}

