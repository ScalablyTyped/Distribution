package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesConnectorsOptionsObject extends js.Object {
  var animation: js.UndefOr[ConnectorsAnimationOptionsObject] = js.undefined
  /**
    * (Gantt) Set the default dash style for this chart's connecting lines.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Marker options specific to the end markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var endMarker: js.UndefOr[ConnectorsEndMarkerOptions] = js.undefined
  /**
    * (Gantt) Set the default color for this chart's Pathfinder connecting
    * lines. Defaults to the color of the point being connected.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Gantt) Set the default pixel width for this chart's Pathfinder
    * connecting lines.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
    * this option is overridden by the `startMarker` and `endMarker` options.
    */
  var marker: js.UndefOr[ConnectorsMarkerOptions] = js.undefined
  /**
    * (Gantt) Marker options specific to the start markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var startMarker: js.UndefOr[ConnectorsStartMarkerOptions] = js.undefined
  /**
    * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
    * possible to define your own algorithms by adding them to the
    * Highcharts.Pathfinder.prototype.algorithms object before the chart has
    * been created.
    *
    * The default algorithms are as follows:
    *
    * `straight`: Draws a straight line between the connecting points. Does not
    * avoid other points when drawing.
    *
    * `simpleConnect`: Finds a path between the points using right angles only.
    * Takes only starting/ending points into account, and will not avoid other
    * points.
    *
    * `fastAvoid`: Finds a path between the points using right angles only.
    * Will attempt to avoid other points, but its focus is performance over
    * accuracy. Works well with less dense datasets.
    *
    * Default value: `straight` is used as default for most series types, while
    * `simpleConnect` is used as default for Gantt series, to show dependencies
    * between points.
    */
  var `type`: js.UndefOr[String | PathfinderTypeValue] = js.undefined
}

object SeriesConnectorsOptionsObject {
  @scala.inline
  def apply(
    animation: ConnectorsAnimationOptionsObject = null,
    dashStyle: String = null,
    endMarker: ConnectorsEndMarkerOptions = null,
    lineColor: ColorString = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    marker: ConnectorsMarkerOptions = null,
    startMarker: ConnectorsStartMarkerOptions = null,
    `type`: String | PathfinderTypeValue = null
  ): SeriesConnectorsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (endMarker != null) __obj.updateDynamic("endMarker")(endMarker.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (startMarker != null) __obj.updateDynamic("startMarker")(startMarker.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesConnectorsOptionsObject]
  }
}

