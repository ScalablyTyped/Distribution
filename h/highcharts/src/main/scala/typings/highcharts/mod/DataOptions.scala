package typings.highcharts.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
    * the CSV before parsing it. Return the modified string.
    */
  var beforeParse: js.UndefOr[DataBeforeParseCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
    * representing the input data on tabular form. This input can be used when
    * the data is already parsed, for example from a grid view component. Each
    * cell can be a string or number. If not switchRowsAndColumns is set, the
    * columns are interpreted as series.
    */
  var columns: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a column array. Will be fetched when the chart is created
    * using Ajax.
    */
  var columnsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
    * when the data is finished loading, optionally from an external source,
    * and parsed. The first argument passed is a finished chart options object,
    * containing the series. These options can be extended with additional
    * options and passed directly to the chart constructor.
    */
  var complete: js.UndefOr[DataCompleteCallbackFunction] = js.native
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
  var csv: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
    * Will be fetched when the chart is created using Ajax.
    */
  var csvURL: js.UndefOr[String] = js.native
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
  var dataRefreshRate: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
    * formats in Date.prototype.dateFormats to use to parse date values.
    * Defaults to a best guess based on what format gives valid and ordered
    * dates. Valid options include: `YYYY/mm/dd`, `dd/mm/YYYY`, `mm/dd/YYYY`,
    * `dd/mm/YY`, `mm/dd/YY`.
    */
  var dateFormat: js.UndefOr[OptionsDateFormatValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
    * parsing numbers in the CSV.
    *
    * If both this and data.delimiter is set to `undefined`, the parser will
    * attempt to deduce the decimal point automatically.
    */
  var decimalPoint: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
    * remote datasets every _n_ seconds (defined by setting
    * data.dataRefreshRate).
    *
    * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
    * data.googleSpreadsheetKey.
    */
  var enablePolling: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * column (indexed by 0) to use. Defaults to the last column containing
    * data.
    */
  var endColumn: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * row (indexed by 0) to use. Defaults to the last row containing data.
    */
  var endRow: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
    * set as series names.
    */
  var firstRowAsNames: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
    * to load. See general information on GS.
    */
  var googleSpreadsheetKey: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
    * to use in combination with googleSpreadsheetKey. The available id's from
    * your sheet can be read from
    * `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
    */
  var googleSpreadsheetWorksheet: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
    * parsing CSV. Defaults to the tab character `\t` if a tab character is
    * found in the CSV string, if not it defaults to `,`.
    *
    * If this is set to false or undefined, the parser will attempt to deduce
    * the delimiter automatically.
    */
  var itemDelimiter: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
    */
  var lineDelimiter: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
    * string representations of dates into JavaScript timestamps. Should return
    * an integer timestamp on success.
    */
  var parseDate: js.UndefOr[DataParseDateCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
    * the parsed columns, the two-dimentional input data array directly, before
    * they are interpreted into series data and categories. Return `false` to
    * stop completion, or call `this.complete()` to continue async.
    */
  var parsed: js.UndefOr[DataParsedCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
    * option, but defining rows intead of columns.
    */
  var rows: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a row array. Will be fetched when the chart is created
    * using Ajax.
    */
  var rowsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
    * for each series. A dictionary exists of Point property names as the key
    * and the CSV column index as the value.
    */
  var seriesMapping: js.UndefOr[js.Array[Dictionary[Double]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * column (indexed by 0) to use.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * row (indexed by 0) to use.
    */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
    * input data, so that `this.columns` effectively becomes the rows of the
    * data set, and the rows are interpreted as series.
    */
  var switchRowsAndColumns: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
    * to be parsed as input data. Related options are `startRow`, `endRow`,
    * `startColumn` and `endColumn` to delimit what part of the table is used.
    */
  var table: js.UndefOr[String | HTMLElement] = js.native
}

object DataOptions {
  @scala.inline
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeforeParse(value: /* csv */ String => String): Self = this.set("beforeParse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeParse: Self = this.set("beforeParse", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: js.Array[DataValueType]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[js.Array[DataValueType]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsURL(value: String): Self = this.set("columnsURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsURL: Self = this.set("columnsURL", js.undefined)
    @scala.inline
    def setComplete(value: /* chartOptions */ Options => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCsv(value: String): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    @scala.inline
    def setCsvURL(value: String): Self = this.set("csvURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvURL: Self = this.set("csvURL", js.undefined)
    @scala.inline
    def setDataRefreshRate(value: Double): Self = this.set("dataRefreshRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRefreshRate: Self = this.set("dataRefreshRate", js.undefined)
    @scala.inline
    def setDateFormat(value: OptionsDateFormatValue): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDecimalPoint(value: String): Self = this.set("decimalPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPoint: Self = this.set("decimalPoint", js.undefined)
    @scala.inline
    def setEnablePolling(value: Boolean): Self = this.set("enablePolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePolling: Self = this.set("enablePolling", js.undefined)
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndRow: Self = this.set("endRow", js.undefined)
    @scala.inline
    def setFirstRowAsNames(value: Boolean): Self = this.set("firstRowAsNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstRowAsNames: Self = this.set("firstRowAsNames", js.undefined)
    @scala.inline
    def setGoogleSpreadsheetKey(value: String): Self = this.set("googleSpreadsheetKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleSpreadsheetKey: Self = this.set("googleSpreadsheetKey", js.undefined)
    @scala.inline
    def setGoogleSpreadsheetWorksheet(value: String): Self = this.set("googleSpreadsheetWorksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleSpreadsheetWorksheet: Self = this.set("googleSpreadsheetWorksheet", js.undefined)
    @scala.inline
    def setItemDelimiter(value: String): Self = this.set("itemDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemDelimiter: Self = this.set("itemDelimiter", js.undefined)
    @scala.inline
    def setLineDelimiter(value: String): Self = this.set("lineDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDelimiter: Self = this.set("lineDelimiter", js.undefined)
    @scala.inline
    def setParseDate(value: /* dateValue */ String => Double): Self = this.set("parseDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    @scala.inline
    def setParsed(value: /* columns */ js.Array[js.Array[js.Any]] => js.UndefOr[Boolean]): Self = this.set("parsed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParsed: Self = this.set("parsed", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[DataValueType]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[DataValueType]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsURL(value: String): Self = this.set("rowsURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsURL: Self = this.set("rowsURL", js.undefined)
    @scala.inline
    def setSeriesMappingVarargs(value: Dictionary[Double]*): Self = this.set("seriesMapping", js.Array(value :_*))
    @scala.inline
    def setSeriesMapping(value: js.Array[Dictionary[Double]]): Self = this.set("seriesMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesMapping: Self = this.set("seriesMapping", js.undefined)
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
    @scala.inline
    def setSwitchRowsAndColumns(value: Boolean): Self = this.set("switchRowsAndColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchRowsAndColumns: Self = this.set("switchRowsAndColumns", js.undefined)
    @scala.inline
    def setTable(value: String | HTMLElement): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

