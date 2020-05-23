package typings.highcharts.mod

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
  var columns: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.undefined
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
  var rows: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.undefined
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
    beforeParse: /* csv */ String => String = null,
    columns: js.Array[js.Array[DataValueType]] = null,
    columnsURL: String = null,
    complete: /* chartOptions */ Options => Unit = null,
    csv: String = null,
    csvURL: String = null,
    dataRefreshRate: js.UndefOr[Double] = js.undefined,
    dateFormat: OptionsDateFormatValue = null,
    decimalPoint: String = null,
    enablePolling: js.UndefOr[Boolean] = js.undefined,
    endColumn: js.UndefOr[Double] = js.undefined,
    endRow: js.UndefOr[Double] = js.undefined,
    firstRowAsNames: js.UndefOr[Boolean] = js.undefined,
    googleSpreadsheetKey: String = null,
    googleSpreadsheetWorksheet: String = null,
    itemDelimiter: String = null,
    lineDelimiter: String = null,
    parseDate: /* dateValue */ String => Double = null,
    parsed: /* columns */ js.Array[js.Array[js.Any]] => js.UndefOr[Boolean] = null,
    rows: js.Array[js.Array[DataValueType]] = null,
    rowsURL: String = null,
    seriesMapping: js.Array[Dictionary[Double]] = null,
    startColumn: js.UndefOr[Double] = js.undefined,
    startRow: js.UndefOr[Double] = js.undefined,
    switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined,
    table: String | HTMLElement = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(js.Any.fromFunction1(beforeParse))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (columnsURL != null) __obj.updateDynamic("columnsURL")(columnsURL.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (csvURL != null) __obj.updateDynamic("csvURL")(csvURL.asInstanceOf[js.Any])
    if (!js.isUndefined(dataRefreshRate)) __obj.updateDynamic("dataRefreshRate")(dataRefreshRate.get.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePolling)) __obj.updateDynamic("enablePolling")(enablePolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endColumn)) __obj.updateDynamic("endColumn")(endColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endRow)) __obj.updateDynamic("endRow")(endRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRowAsNames)) __obj.updateDynamic("firstRowAsNames")(firstRowAsNames.get.asInstanceOf[js.Any])
    if (googleSpreadsheetKey != null) __obj.updateDynamic("googleSpreadsheetKey")(googleSpreadsheetKey.asInstanceOf[js.Any])
    if (googleSpreadsheetWorksheet != null) __obj.updateDynamic("googleSpreadsheetWorksheet")(googleSpreadsheetWorksheet.asInstanceOf[js.Any])
    if (itemDelimiter != null) __obj.updateDynamic("itemDelimiter")(itemDelimiter.asInstanceOf[js.Any])
    if (lineDelimiter != null) __obj.updateDynamic("lineDelimiter")(lineDelimiter.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction1(parseDate))
    if (parsed != null) __obj.updateDynamic("parsed")(js.Any.fromFunction1(parsed))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsURL != null) __obj.updateDynamic("rowsURL")(rowsURL.asInstanceOf[js.Any])
    if (seriesMapping != null) __obj.updateDynamic("seriesMapping")(seriesMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(startColumn)) __obj.updateDynamic("startColumn")(startColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRow)) __obj.updateDynamic("startRow")(startRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(switchRowsAndColumns)) __obj.updateDynamic("switchRowsAndColumns")(switchRowsAndColumns.get.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

