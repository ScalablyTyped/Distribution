package typings.highcharts.modulesOfflineDashExportingMod

import typings.highcharts.highchartsMod.ExportingOptions
import typings.highcharts.highchartsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("highcharts", JSImport.Namespace)
@js.native
object highchartsMod extends js.Object {
  @js.native
  trait Chart extends js.Object {
    /**
      * Exporting and offline-exporting modules required. Export a chart to
      * an image locally in the user's browser.
      *
      * @param exportingOptions
      *        Exporting options, the same as in
      *        Highcharts.Chart#exportChart.
      *
      * @param chartOptions
      *        Additional chart options for the exported chart. For example a
      *        different background color can be added here, or `dataLabels`
      *        for export only.
      */
    def exportChartLocal(): Unit = js.native
    def exportChartLocal(exportingOptions: ExportingOptions): Unit = js.native
    def exportChartLocal(exportingOptions: ExportingOptions, chartOptions: Options): Unit = js.native
  }
  
}

