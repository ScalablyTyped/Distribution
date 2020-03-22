package typings.highcharts.exportDataMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Export-data module required. Returns the current chart data as a CSV
    * string.
    *
    * @param useLocalDecimalPoint
    *        Whether to use the local decimal point as detected from the
    *        browser. This makes it easier to export data to Excel in the
    *        same locale as the user is.
    *
    * @return CSV representation of the data
    */
  def getCSV(): String = js.native
  def getCSV(useLocalDecimalPoint: Boolean): String = js.native
  /**
    * Export-data module required. Returns a two-dimensional array
    * containing the current chart data.
    *
    * @param multiLevelHeaders
    *        Use multilevel headers for the rows by default. Adds an extra
    *        row with top level headers. If a custom columnHeaderFormatter
    *        is defined, this can override the behavior.
    *
    * @return The current chart data
    *
    * @fires Highcharts.Chart#exportData
    */
  def getDataRows(): js.Array[js.Array[Double | String]] = js.native
  def getDataRows(multiLevelHeaders: Boolean): js.Array[js.Array[Double | String]] = js.native
  /**
    * Export-data module required. Build a HTML table with the chart's
    * current data.
    *
    * @param useLocalDecimalPoint
    *        Whether to use the local decimal point as detected from the
    *        browser. This makes it easier to export data to Excel in the
    *        same locale as the user is.
    *
    * @return HTML representation of the data.
    *
    * @fires Highcharts.Chart#afterGetTable
    */
  def getTable(): String = js.native
  def getTable(useLocalDecimalPoint: Boolean): String = js.native
  /**
    * Export-data module required. View the data in a table below the
    * chart.
    *
    * @fires Highcharts.Chart#afterViewData
    */
  def viewData(): Unit = js.native
}

