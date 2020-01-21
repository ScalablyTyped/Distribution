package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTimelineDataLabelsOptions extends js.Object {
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to position data labels alternately. For example, if
    * distance is set equal to `100`, then data labels will be positioned
    * alternately (on both sides of the point) at a distance of 100px.
    */
  var alternate: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color of the line connecting the data label to the
    * point. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The width of the line connecting the data label to the
    * point.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A pixel value defining the distance between the data label
    * and the point. Negative numbers puts the label on top of the point.
    */
  var distance: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[FormatterCallbackFunction[js.Object]] = js.undefined
  /**
    * (Highcharts) Shadow options for the data label.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.undefined
  var style: js.UndefOr[PlotTimelineDataLabelsStyleOptions] = js.undefined
  var verticalAlign: js.UndefOr[String] = js.undefined
}

object PlotTimelineDataLabelsOptions {
  @scala.inline
  def apply(
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    alternate: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    color: String = null,
    connectorColor: String = null,
    connectorWidth: Int | Double = null,
    distance: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatter: FormatterCallbackFunction[js.Object] = null,
    shadow: Boolean | CSSObject = null,
    style: PlotTimelineDataLabelsStyleOptions = null,
    verticalAlign: String = null
  ): PlotTimelineDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (!js.isUndefined(alternate)) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (connectorWidth != null) __obj.updateDynamic("connectorWidth")(connectorWidth.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTimelineDataLabelsOptions]
  }
}

