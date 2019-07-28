package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleConnectorsEndMarkerOptions extends js.Object {
  /**
    * (Gantt) Horizontal alignment of the markers relative to the points.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Gantt) Set the color of the connector markers. By default this is the
    * same as the connector color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Gantt) Enable markers for the connectors.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Set the height of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Whether or not to draw the markers inside the points.
    */
  var inside: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Set the line/border color of the connector markers. By default
    * this is the same as the marker color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Gantt) Set the line/border width of the pathfinder markers.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set the radius of the connector markers. The default is
    * automatically computed based on the algorithmMargin setting.
    *
    * Setting marker.width and marker.height will override this setting.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set the symbol of the connector end markers.
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Vertical alignment of the markers relative to the points.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Gantt) Set the width of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PlotPackedbubbleConnectorsEndMarkerOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    radius: Int | Double = null,
    symbol: String = null,
    verticalAlign: VerticalAlignValue = null,
    width: Int | Double = null
  ): PlotPackedbubbleConnectorsEndMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleConnectorsEndMarkerOptions]
  }
}

