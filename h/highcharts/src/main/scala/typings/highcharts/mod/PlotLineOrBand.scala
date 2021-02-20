package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "PlotLineOrBand")
@js.native
class PlotLineOrBand protected () extends StObject {
  /**
    * The object wrapper for plot lines and plot bands
    */
  def this(axis: Axis) = this()
  def this(axis: Axis, options: AxisPlotBandsOptions) = this()
  def this(axis: Axis, options: AxisPlotLinesOptions) = this()
  
  /**
    * Remove the plot line or band.
    */
  def destroy(): Unit = js.native
  
  /**
    * SVG element of the label.
    */
  var label: SVGElement = js.native
  
  /**
    * SVG element of the plot line or band.
    */
  var svgElement: SVGElement = js.native
}
