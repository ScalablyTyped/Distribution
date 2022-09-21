package typings.highcharts.mod

import typings.highcharts.highchartsStrings.Chart
import typings.highcharts.highchartsStrings.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Highcharts-extended JQuery.
    */
  @js.native
  trait JQuery extends StObject {
    
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
    def highcharts(className: Chart | Map | typings.highcharts.highchartsStrings.StockChart): JQuery = js.native
    def highcharts(
      className: Chart | Map | typings.highcharts.highchartsStrings.StockChart,
      options: Unit,
      callback: ChartCallbackFunction
    ): JQuery = js.native
    def highcharts(className: Chart | Map | typings.highcharts.highchartsStrings.StockChart, options: Options): JQuery = js.native
    def highcharts(
      className: Chart | Map | typings.highcharts.highchartsStrings.StockChart,
      options: Options,
      callback: ChartCallbackFunction
    ): JQuery = js.native
    def highcharts(className: String): JQuery = js.native
    def highcharts(className: String, options: Unit, callback: ChartCallbackFunction): JQuery = js.native
    def highcharts(className: String, options: Options): JQuery = js.native
    def highcharts(className: String, options: Options, callback: ChartCallbackFunction): JQuery = js.native
    def highcharts(className: Unit, options: Unit, callback: ChartCallbackFunction): JQuery = js.native
    def highcharts(className: Unit, options: Options): JQuery = js.native
    def highcharts(className: Unit, options: Options, callback: ChartCallbackFunction): JQuery = js.native
  }
}
