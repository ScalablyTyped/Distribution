package typings.highcharts.dataMod.highchartsAugmentingMod

import typings.highcharts.mod.DataOptions
import typings.highcharts.mod.DataValueType
import typings.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Data class
  */
@js.native
trait Data extends js.Object {
  /**
    * A collection of available date formats, extendable from the outside
    * to support custom date formats.
    */
  var dateFormats: Dictionary[DataDateFormatObject] = js.native
  /**
    * If a complete callback function is provided in the options, interpret
    * the columns into a Highcharts options object.
    */
  def complete(): Unit = js.native
  /**
    * Fetch or refetch live data
    *
    * @return The URLs that were tried can be found in the options
    */
  def fetchLiveData(): Boolean = js.native
  /**
    * Get the column distribution. For example, a line series takes a
    * single column for Y values. A range series takes two columns for low
    * and high values respectively, and an OHLC series takes four columns.
    */
  def getColumnDistribution(): Unit = js.native
  /**
    * Get the parsed data in a form that we can apply directly to the
    * `series.data` config. Array positions can be mapped using the
    * `series.keys` option.
    *
    * @return Data rows
    */
  def getData(): js.UndefOr[js.Array[js.Array[Double | String]]] = js.native
  /**
    * Parse a CSV input string
    */
  def parseCSV(): js.Array[js.Array[DataValueType]] = js.native
  def parseCSV(inOptions: DataOptions): js.Array[js.Array[DataValueType]] = js.native
  /**
    * Parse a single column. Set properties like .isDatetime and
    * .isNumeric.
    *
    * @param column
    *        Column to parse
    *
    * @param col
    *        Column index
    */
  def parseColumn(column: js.Array[DataValueType], col: Double): Unit = js.native
  /**
    * Parse a date and return it as a number. Overridable through
    * `options.parseDate`.
    */
  def parseDate(`val`: String): Double = js.native
  /**
    * Parse a Google spreadsheet.
    *
    * @return Always returns false, because it is an intermediate fetch.
    */
  def parseGoogleSpreadsheet(): Boolean = js.native
  /**
    * Parse a HTML table
    */
  def parseTable(): js.UndefOr[js.Array[js.Array[DataValueType]]] = js.native
  /**
    * Parse numeric cells in to number types and date types in to true
    * dates.
    */
  def parseTypes(): Unit = js.native
  /**
    * A hook for working directly on the parsed columns
    */
  def parsed(): js.UndefOr[Boolean] = js.native
  /**
    * Reorganize rows into columns.
    */
  def rowsToColumns(rows: js.Array[js.Array[Double | String]]): js.Array[js.Array[Double | String]] = js.native
  /**
    * Trim a string from whitespaces.
    *
    * @param str
    *        String to trim
    *
    * @param inside
    *        Remove all spaces between numbers.
    *
    * @return Trimed string
    */
  def trim(str: String): String = js.native
  def trim(str: String, inside: Boolean): String = js.native
  /**
    * Updates the chart with new data options.
    */
  def update(options: DataOptions): Unit = js.native
  def update(options: DataOptions, redraw: Boolean): Unit = js.native
}

