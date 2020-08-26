package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XrangePointConnectorsOptionsObject extends js.Object {
  /**
    * (Gantt) Set the default dash style for this chart's connecting lines.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * (Gantt) Marker options specific to the end markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var endMarker: js.UndefOr[ConnectorsEndMarkerOptions] = js.native
  /**
    * (Gantt) Set the default color for this chart's Pathfinder connecting
    * lines. Defaults to the color of the point being connected.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  /**
    * (Gantt) Set the default pixel width for this chart's Pathfinder
    * connecting lines.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
    * this option is overridden by the `startMarker` and `endMarker` options.
    */
  var marker: js.UndefOr[ConnectorsMarkerOptions] = js.native
  /**
    * (Gantt) Marker options specific to the start markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var startMarker: js.UndefOr[ConnectorsStartMarkerOptions] = js.native
  /**
    * (Gantt) The ID of the point to connect to.
    */
  var to: js.UndefOr[String] = js.native
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
  var `type`: js.UndefOr[PathfinderTypeValue] = js.native
}

object XrangePointConnectorsOptionsObject {
  @scala.inline
  def apply(): XrangePointConnectorsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XrangePointConnectorsOptionsObject]
  }
  @scala.inline
  implicit class XrangePointConnectorsOptionsObjectOps[Self <: XrangePointConnectorsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setEndMarker(value: ConnectorsEndMarkerOptions): Self = this.set("endMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndMarker: Self = this.set("endMarker", js.undefined)
    @scala.inline
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMarker(value: ConnectorsMarkerOptions): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setStartMarker(value: ConnectorsStartMarkerOptions): Self = this.set("startMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartMarker: Self = this.set("startMarker", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setType(value: PathfinderTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

