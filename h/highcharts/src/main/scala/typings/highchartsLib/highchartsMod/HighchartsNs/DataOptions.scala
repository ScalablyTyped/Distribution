package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid
  * views. See also the tutorial article on the Data module.
  *
  * It requires the modules/data.js file to be loaded.
  *
  * Please note that the default way of adding data in Highcharts, without the need of a module, is through the
  * series.data option.
  */
trait DataOptions extends js.Object {
  /**
    * A two-dimensional array representing the input data on tabular form. This input can be used when the data is
    * already parsed, for example from a grid view component. Each cell can be a string or number. If not
    * switchRowsAndColumns is set, the columns are interpreted as series.
    * @since 4.0
    */
  var columns: js.UndefOr[js.Array[js.Array[java.lang.String | scala.Double]]] = js.undefined
  /**
    * The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed.
    * The first argument passed is a finished chart options object, containing the series. These options can be
    * extended with additional options and passed directly to the chart constructor.
    * @since 4.0
    */
  var complete: js.UndefOr[js.Function1[/* options */ Options, scala.Unit]] = js.undefined
  /**
    * A comma delimited string to be parsed. Related options are startRow, endRow, startColumn and endColumn to delimit
    * what part of the table is used. The lineDelimiter and itemDelimiter options define the CSV delimiter formats.
    * @since 4.0
    */
  var csv: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a
    * best guess based on what format gives valid and ordered dates.
    *
    * Valid options include:
    * 'YYYY-mm-dd'
    * 'dd/mm/YYYY'
    * 'mm/dd/YYYY'
    * 'dd/mm/YY'
    * 'mm/dd/YY'
    * @since 4.0
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The decimal point used for parsing numbers in the CSV.
    * @default '.'
    */
  var decimalPoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
    * @since 4.0
    */
  var endColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
    * @since 4.0.4
    */
  var endRow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to use the first row in the data set as series names.
    * @default true
    * @since 4.1.0
    */
  var firstRowAsNames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The key for a Google Spreadsheet to load. See {@link https://developers.google.com/gdata/samples/spreadsheet_sample|general information on GS}.
    * @since 4.0
    */
  var googleSpreadsheetKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Google Spreadsheet worksheet to use in combination with googleSpreadsheetKey. The available id's from your
    * sheet can be read from https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic
    * @since 4.0
    */
  var googleSpreadsheetWorksheet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Item or cell delimiter for parsing CSV. Defaults to the tab character \t if a tab character is found in the CSV
    * string, if not it defaults to ,.
    * @since 4.0
    */
  var itemDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Line delimiter for parsing CSV.
    * @default '\n'
    * @since 4.0
    */
  var lineDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer
    * timestamp on success.
    * @since 4.0
    */
  var parseDate: js.UndefOr[js.Function1[/* val */ js.Any, scala.Double]] = js.undefined
  /**
    * A callback function to access the parsed columns, the two-dimentional input data array directly, before they are
    * interpreted into series data and categories. Return false to stop completion, or call this.complete() to continue
    * async.
    * @since 4.0
    */
  var parsed: js.UndefOr[
    js.Function1[
      /* columns */ js.Array[js.Array[java.lang.String | scala.Double]], 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
    * The same as the columns input option, but defining rows intead of columns.
    * @since 4.0
    */
  var rows: js.UndefOr[js.Array[js.Array[java.lang.String | scala.Double]]] = js.undefined
  /**
    * An array containing object with Point property names along with what column id the property should be taken from.
    * @since 4.0.4
    */
  var seriesMapping: js.UndefOr[js.Array[DataSeriesMapping]] = js.undefined
  /**
    * In tabular input data, the first column (indexed by 0) to use.
    * @default 0
    * @since 4.0
    */
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * In tabular input data, the first row (indexed by 0) to use.
    * @default 0
    * @since 4.0
    */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Switch rows and columns of the input data, so that this.columns effectively becomes the rows of the data set, and
    * the rows are interpreted as series.
    * @default false
    * @since 4.0
    */
  var switchRowsAndColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A HTML table or the id of such to be parsed as input data. Related options are startRow, endRow, startColumn and
    * endColumn to delimit what part of the table is used.
    */
  var table: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    columns: js.Array[js.Array[java.lang.String | scala.Double]] = null,
    complete: /* options */ Options => scala.Unit = null,
    csv: java.lang.String = null,
    dateFormat: java.lang.String = null,
    decimalPoint: java.lang.String = null,
    endColumn: scala.Int | scala.Double = null,
    endRow: scala.Int | scala.Double = null,
    firstRowAsNames: js.UndefOr[scala.Boolean] = js.undefined,
    googleSpreadsheetKey: java.lang.String = null,
    googleSpreadsheetWorksheet: java.lang.String = null,
    itemDelimiter: java.lang.String = null,
    lineDelimiter: java.lang.String = null,
    parseDate: /* val */ js.Any => scala.Double = null,
    parsed: /* columns */ js.Array[js.Array[java.lang.String | scala.Double]] => scala.Boolean | scala.Unit = null,
    rows: js.Array[js.Array[java.lang.String | scala.Double]] = null,
    seriesMapping: js.Array[DataSeriesMapping] = null,
    startColumn: scala.Int | scala.Double = null,
    startRow: scala.Int | scala.Double = null,
    switchRowsAndColumns: js.UndefOr[scala.Boolean] = js.undefined,
    table: java.lang.String | stdLib.HTMLElement = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRowAsNames)) __obj.updateDynamic("firstRowAsNames")(firstRowAsNames)
    if (googleSpreadsheetKey != null) __obj.updateDynamic("googleSpreadsheetKey")(googleSpreadsheetKey)
    if (googleSpreadsheetWorksheet != null) __obj.updateDynamic("googleSpreadsheetWorksheet")(googleSpreadsheetWorksheet)
    if (itemDelimiter != null) __obj.updateDynamic("itemDelimiter")(itemDelimiter)
    if (lineDelimiter != null) __obj.updateDynamic("lineDelimiter")(lineDelimiter)
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction1(parseDate))
    if (parsed != null) __obj.updateDynamic("parsed")(js.Any.fromFunction1(parsed))
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (seriesMapping != null) __obj.updateDynamic("seriesMapping")(seriesMapping)
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (!js.isUndefined(switchRowsAndColumns)) __obj.updateDynamic("switchRowsAndColumns")(switchRowsAndColumns)
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

