package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsStartMarkerOptions extends js.Object {
  /**
    * (Gantt) Horizontal alignment of the markers relative to the points.
    */
  var align: js.UndefOr[String | AlignValue] = js.native
  /**
    * (Gantt) Set the color of the connector markers. By default this is the
    * same as the connector color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Gantt) Enable markers for the connectors.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[String] = js.native
  /**
    * (Gantt) Set the height of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Whether or not to draw the markers inside the points.
    */
  var inside: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Set the line/border color of the connector markers. By default
    * this is the same as the marker color.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  /**
    * (Gantt) Set the line/border width of the pathfinder markers.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set the radius of the connector markers. The default is
    * automatically computed based on the algorithmMargin setting.
    *
    * Setting marker.width and marker.height will override this setting.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set the symbol of the connector start markers.
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * (Gantt) Vertical alignment of the markers relative to the points.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Gantt) Set the width of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var width: js.UndefOr[Double] = js.native
}

object ConnectorsStartMarkerOptions {
  @scala.inline
  def apply(): ConnectorsStartMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsStartMarkerOptions]
  }
  @scala.inline
  implicit class ConnectorsStartMarkerOptionsOps[Self <: ConnectorsStartMarkerOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String | AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInside: Self = this.set("inside", js.undefined)
    @scala.inline
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

