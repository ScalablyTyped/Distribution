package typings.highcharts.exportDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("highcharts", JSImport.Namespace)
@js.native
object highchartsAugmentingMod extends js.Object {
  
  @js.native
  trait Chart extends js.Object {
    
    /**
      * Generates a data URL of CSV for local download in the browser. This
      * is the default action for a click on the 'Download CSV' button.
      *
      * See Highcharts.Chart#getCSV to get the CSV data itself.
      */
    def downloadCSV(): Unit = js.native
    
    /**
      * Generates a data URL of an XLS document for local download in the
      * browser. This is the default action for a click on the 'Download XLS'
      * button.
      *
      * See Highcharts.Chart#getTable to get the table data itself.
      */
    def downloadXLS(): Unit = js.native
    
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
      * Export-data module required. Hide the data table when visible.
      */
    def hideData(): Unit = js.native
    
    /**
      * Export-data module required. View the data in a table below the
      * chart.
      *
      * @fires Highcharts.Chart#afterViewData
      */
    def viewData(): Unit = js.native
  }
}
