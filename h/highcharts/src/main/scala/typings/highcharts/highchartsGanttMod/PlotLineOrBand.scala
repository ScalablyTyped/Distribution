package typings.highcharts.highchartsGanttMod

import typings.highcharts.mod.AxisPlotBandsOptions
import typings.highcharts.mod.AxisPlotLinesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "PlotLineOrBand")
@js.native
class PlotLineOrBand protected ()
  extends typings.highcharts.mod.PlotLineOrBand {
  /**
    * The object wrapper for plot lines and plot bands
    */
  def this(axis: typings.highcharts.mod.Axis) = this()
  def this(axis: typings.highcharts.mod.Axis, options: AxisPlotBandsOptions) = this()
  def this(axis: typings.highcharts.mod.Axis, options: AxisPlotLinesOptions) = this()
}

