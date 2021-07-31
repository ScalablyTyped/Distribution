package typings.highcharts.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataOptions extends StObject {
  
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
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  
  @scala.inline
  implicit class DataOptionsMutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeParse(value: /* csv */ String => String): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[js.Array[DataValueType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsURL(value: String): Self = StObject.set(x, "columnsURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsURLUndefined: Self = StObject.set(x, "columnsURL", js.undefined)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Array[DataValueType]*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: /* chartOptions */ Options => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvURL(value: String): Self = StObject.set(x, "csvURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvURLUndefined: Self = StObject.set(x, "csvURL", js.undefined)
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    @scala.inline
    def setDataRefreshRate(value: Double): Self = StObject.set(x, "dataRefreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRefreshRateUndefined: Self = StObject.set(x, "dataRefreshRate", js.undefined)
    
    @scala.inline
    def setDateFormat(value: OptionsDateFormatValue): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDecimalPoint(value: String): Self = StObject.set(x, "decimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPointUndefined: Self = StObject.set(x, "decimalPoint", js.undefined)
    
    @scala.inline
    def setEnablePolling(value: Boolean): Self = StObject.set(x, "enablePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePollingUndefined: Self = StObject.set(x, "enablePolling", js.undefined)
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
    
    @scala.inline
    def setFirstRowAsNames(value: Boolean): Self = StObject.set(x, "firstRowAsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRowAsNamesUndefined: Self = StObject.set(x, "firstRowAsNames", js.undefined)
    
    @scala.inline
    def setGoogleSpreadsheetKey(value: String): Self = StObject.set(x, "googleSpreadsheetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleSpreadsheetKeyUndefined: Self = StObject.set(x, "googleSpreadsheetKey", js.undefined)
    
    @scala.inline
    def setGoogleSpreadsheetWorksheet(value: String): Self = StObject.set(x, "googleSpreadsheetWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleSpreadsheetWorksheetUndefined: Self = StObject.set(x, "googleSpreadsheetWorksheet", js.undefined)
    
    @scala.inline
    def setItemDelimiter(value: String): Self = StObject.set(x, "itemDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDelimiterUndefined: Self = StObject.set(x, "itemDelimiter", js.undefined)
    
    @scala.inline
    def setLineDelimiter(value: String): Self = StObject.set(x, "lineDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDelimiterUndefined: Self = StObject.set(x, "lineDelimiter", js.undefined)
    
    @scala.inline
    def setParseDate(value: /* dateValue */ String => Double): Self = StObject.set(x, "parseDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
    
    @scala.inline
    def setParsed(value: /* columns */ js.Array[js.Array[js.Any]] => js.UndefOr[Boolean]): Self = StObject.set(x, "parsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[DataValueType]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsURL(value: String): Self = StObject.set(x, "rowsURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsURLUndefined: Self = StObject.set(x, "rowsURL", js.undefined)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[DataValueType]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSeriesMapping(value: js.Array[Dictionary[Double]]): Self = StObject.set(x, "seriesMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesMappingUndefined: Self = StObject.set(x, "seriesMapping", js.undefined)
    
    @scala.inline
    def setSeriesMappingVarargs(value: Dictionary[Double]*): Self = StObject.set(x, "seriesMapping", js.Array(value :_*))
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    @scala.inline
    def setSwitchRowsAndColumns(value: Boolean): Self = StObject.set(x, "switchRowsAndColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchRowsAndColumnsUndefined: Self = StObject.set(x, "switchRowsAndColumns", js.undefined)
    
    @scala.inline
    def setTable(value: String | HTMLElement): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
