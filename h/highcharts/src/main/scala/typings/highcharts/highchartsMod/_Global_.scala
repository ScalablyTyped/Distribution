package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.Map
import typings.highcharts.highchartsStrings.StockChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  /**
    * Highcharts-extended JQuery.
    */
  @js.native
  trait JQuery extends js.Object {
    /**
      * Helper function to return the chart of the current JQuery selector
      * element.
      *
      * @param className
      *        Name of the factory class in the Highcharts namespace.
      *
      * @param options
      *        The chart options structure.
      *
      * @param callback
      *        Function to run when the chart has loaded and and all external
      *        images are loaded. Defining a chart.events.load handler is
      *        equivalent.
      *
      * @return The current JQuery selector.
      */
    def highcharts(): JQuery = js.native
    def highcharts(className: String): JQuery = js.native
    def highcharts(className: String, options: Options): JQuery = js.native
    def highcharts(className: String, options: Options, callback: ChartCallbackFunction): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Chart(className: typings.highcharts.highchartsStrings.Chart): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Chart(className: typings.highcharts.highchartsStrings.Chart, options: Options): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Chart(
      className: typings.highcharts.highchartsStrings.Chart,
      options: Options,
      callback: ChartCallbackFunction
    ): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Map(className: Map): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Map(className: Map, options: Options): JQuery = js.native
    @JSName("highcharts")
    def highcharts_Map(className: Map, options: Options, callback: ChartCallbackFunction): JQuery = js.native
    @JSName("highcharts")
    def highcharts_StockChart(className: StockChart): JQuery = js.native
    @JSName("highcharts")
    def highcharts_StockChart(className: StockChart, options: Options): JQuery = js.native
    @JSName("highcharts")
    def highcharts_StockChart(className: StockChart, options: Options, callback: ChartCallbackFunction): JQuery = js.native
  }
  
}

