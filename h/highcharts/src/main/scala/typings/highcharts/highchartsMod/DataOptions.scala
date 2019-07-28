package typings.highcharts.highchartsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
    * the CSV before parsing it. Return the modified string.
    */
  var beforeParse: js.UndefOr[DataBeforeParseCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
    * representing the input data on tabular form. This input can be used when
    * the data is already parsed, for example from a grid view component. Each
    * cell can be a string or number. If not switchRowsAndColumns is set, the
    * columns are interpreted as series.
    */
  var columns: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a column array. Will be fetched when the chart is created
    * using Ajax.
    */
  var columnsURL: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
    * when the data is finished loading, optionally from an external source,
    * and parsed. The first argument passed is a finished chart options object,
    * containing the series. These options can be extended with additional
    * options and passed directly to the chart constructor.
    */
  var complete: js.UndefOr[DataCompleteCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
    * parsed. Related options are startRow, endRow, startColumn and endColumn
    * to delimit what part of the table is used. The lineDelimiter and
    * itemDelimiter options define the CSV delimiter formats.
    *
    * The built-in CSV parser doesn't support all flavours of CSV, so in some
    * cases it may be necessary to use an external CSV parser. See this example
    * of parsing CSV through the MIT licensed Papa Parse library.
    */
  var csv: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
    * Will be fetched when the chart is created using Ajax.
    */
  var csvURL: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
    * polling when importing remote dataset by setting data.csvURL,
    * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
    *
    * Note that polling must be enabled by setting data.enablePolling to true.
    *
    * The value is the number of seconds between pollings. It cannot be set to
    * less than 1 second.
    */
  var dataRefreshRate: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
    * formats in Date.prototype.dateFormats to use to parse date values.
    * Defaults to a best guess based on what format gives valid and ordered
    * dates. Valid options include: `YYYY/mm/dd`, `dd/mm/YYYY`, `mm/dd/YYYY`,
    * `dd/mm/YY`, `mm/dd/YY`.
    */
  var dateFormat: js.UndefOr[OptionsDateFormatValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
    * parsing numbers in the CSV.
    *
    * If both this and data.delimiter is set to `undefined`, the parser will
    * attempt to deduce the decimal point automatically.
    */
  var decimalPoint: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
    * remote datasets every _n_ seconds (defined by setting
    * data.dataRefreshRate).
    *
    * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
    * data.googleSpreadsheetKey.
    */
  var enablePolling: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * column (indexed by 0) to use. Defaults to the last column containing
    * data.
    */
  var endColumn: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * row (indexed by 0) to use. Defaults to the last row containing data.
    */
  var endRow: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
    * set as series names.
    */
  var firstRowAsNames: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
    * to load. See general information on GS.
    */
  var googleSpreadsheetKey: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
    * to use in combination with googleSpreadsheetKey. The available id's from
    * your sheet can be read from
    * `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
    */
  var googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
    * parsing CSV. Defaults to the tab character `\t` if a tab character is
    * found in the CSV string, if not it defaults to `,`.
    *
    * If this is set to false or undefined, the parser will attempt to deduce
    * the delimiter automatically.
    */
  var itemDelimiter: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
    */
  var lineDelimiter: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
    * string representations of dates into JavaScript timestamps. Should return
    * an integer timestamp on success.
    */
  var parseDate: js.UndefOr[DataParseDateCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
    * the parsed columns, the two-dimentional input data array directly, before
    * they are interpreted into series data and categories. Return `false` to
    * stop completion, or call `this.complete()` to continue async.
    */
  var parsed: js.UndefOr[DataParsedCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
    * option, but defining rows intead of columns.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a row array. Will be fetched when the chart is created
    * using Ajax.
    */
  var rowsURL: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
    * for each series. A dictionary exists of Point property names as the key
    * and the CSV column index as the value.
    */
  var seriesMapping: js.UndefOr[js.Array[Dictionary[Double]]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * column (indexed by 0) to use.
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * row (indexed by 0) to use.
    */
  var startRow: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
    * input data, so that `this.columns` effectively becomes the rows of the
    * data set, and the rows are interpreted as series.
    */
  var switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
    * to be parsed as input data. Related options are `startRow`, `endRow`,
    * `startColumn` and `endColumn` to delimit what part of the table is used.
    */
  var table: js.UndefOr[String | HTMLElement] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    beforeParse: DataBeforeParseCallbackFunction = null,
    columns: js.Array[js.Array[_]] = null,
    columnsURL: String = null,
    complete: DataCompleteCallbackFunction = null,
    csv: String = null,
    csvURL: String = null,
    dataRefreshRate: Int | Double = null,
    dateFormat: OptionsDateFormatValue = null,
    decimalPoint: String = null,
    enablePolling: js.UndefOr[Boolean] = js.undefined,
    endColumn: Int | Double = null,
    endRow: Int | Double = null,
    firstRowAsNames: js.UndefOr[Boolean] = js.undefined,
    googleSpreadsheetKey: String = null,
    googleSpreadsheetWorksheet: String = null,
    itemDelimiter: String = null,
    lineDelimiter: String = null,
    parseDate: DataParseDateCallbackFunction = null,
    parsed: DataParsedCallbackFunction = null,
    rows: js.Array[js.Array[_]] = null,
    rowsURL: String = null,
    seriesMapping: js.Array[Dictionary[Double]] = null,
    startColumn: Int | Double = null,
    startRow: Int | Double = null,
    switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined,
    table: String | HTMLElement = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(beforeParse)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (columnsURL != null) __obj.updateDynamic("columnsURL")(columnsURL)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (csvURL != null) __obj.updateDynamic("csvURL")(csvURL)
    if (dataRefreshRate != null) __obj.updateDynamic("dataRefreshRate")(dataRefreshRate.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint)
    if (!js.isUndefined(enablePolling)) __obj.updateDynamic("enablePolling")(enablePolling)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRowAsNames)) __obj.updateDynamic("firstRowAsNames")(firstRowAsNames)
    if (googleSpreadsheetKey != null) __obj.updateDynamic("googleSpreadsheetKey")(googleSpreadsheetKey)
    if (googleSpreadsheetWorksheet != null) __obj.updateDynamic("googleSpreadsheetWorksheet")(googleSpreadsheetWorksheet)
    if (itemDelimiter != null) __obj.updateDynamic("itemDelimiter")(itemDelimiter)
    if (lineDelimiter != null) __obj.updateDynamic("lineDelimiter")(lineDelimiter)
    if (parseDate != null) __obj.updateDynamic("parseDate")(parseDate)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (rowsURL != null) __obj.updateDynamic("rowsURL")(rowsURL)
    if (seriesMapping != null) __obj.updateDynamic("seriesMapping")(seriesMapping)
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (!js.isUndefined(switchRowsAndColumns)) __obj.updateDynamic("switchRowsAndColumns")(switchRowsAndColumns)
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

