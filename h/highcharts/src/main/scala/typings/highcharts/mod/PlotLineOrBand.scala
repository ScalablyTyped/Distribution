package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "PlotLineOrBand")
@js.native
class PlotLineOrBand protected () extends js.Object {
  /**
    * The object wrapper for plot lines and plot bands
    */
  def this(axis: Axis) = this()
  def this(axis: Axis, options: AxisPlotBandsOptions) = this()
  def this(axis: Axis, options: AxisPlotLinesOptions) = this()
  /**
    * SVG element of the label.
    */
  var label: SVGElement = js.native
  /**
    * SVG element of the plot line or band.
    */
  var svgElement: SVGElement = js.native
  /**
    * Remove the plot line or band.
    */
  def destroy(): Unit = js.native
}

