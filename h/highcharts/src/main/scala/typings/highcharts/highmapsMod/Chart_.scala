package typings.highcharts.highmapsMod

import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.HTMLDOMElement
import typings.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Chart")
@js.native
class Chart_ protected ()
  extends typings.highcharts.mod.Chart_ {
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(options: Options) = this()
  def this(options: Options, callback: ChartCallbackFunction) = this()
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param renderTo
    *        The DOM element to render to, or its id.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(renderTo: String, options: Options) = this()
  def this(renderTo: HTMLDOMElement, options: Options) = this()
  def this(renderTo: String, options: Options, callback: ChartCallbackFunction) = this()
  def this(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction) = this()
}

