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
  var dateFormat: js.UndefOr[String] = js.undefined
  
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
    * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet API key
    * required for access generated at API Services / Credentials. See a
    * comprehensive tutorial for setting up the key at the Hands-On Data
    * Visualization book website.
    */
  var googleAPIKey: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key or `spreadsheetId` value
    * for a Google Spreadsheet to load. See developers.google.com for how to
    * find the `spreadsheetId`.
    *
    * In order for Google Sheets to load, a valid googleAPIKey must also be
    * given.
    */
  var googleSpreadsheetKey: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet `range`
    * to use in combination with googleSpreadsheetKey. See
    * developers.google.com for details.
    *
    * If given, it takes precedence over `startColumn`, `endColumn`, `startRow`
    * and `endRow`.
    */
  var googleSpreadsheetRange: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeParse(value: /* csv */ String => String): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
    
    inline def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
    
    inline def setColumns(value: js.Array[js.Array[DataValueType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsURL(value: String): Self = StObject.set(x, "columnsURL", value.asInstanceOf[js.Any])
    
    inline def setColumnsURLUndefined: Self = StObject.set(x, "columnsURL", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: js.Array[DataValueType]*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setComplete(value: /* chartOptions */ Options => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvURL(value: String): Self = StObject.set(x, "csvURL", value.asInstanceOf[js.Any])
    
    inline def setCsvURLUndefined: Self = StObject.set(x, "csvURL", js.undefined)
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setDataRefreshRate(value: Double): Self = StObject.set(x, "dataRefreshRate", value.asInstanceOf[js.Any])
    
    inline def setDataRefreshRateUndefined: Self = StObject.set(x, "dataRefreshRate", js.undefined)
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDecimalPoint(value: String): Self = StObject.set(x, "decimalPoint", value.asInstanceOf[js.Any])
    
    inline def setDecimalPointUndefined: Self = StObject.set(x, "decimalPoint", js.undefined)
    
    inline def setEnablePolling(value: Boolean): Self = StObject.set(x, "enablePolling", value.asInstanceOf[js.Any])
    
    inline def setEnablePollingUndefined: Self = StObject.set(x, "enablePolling", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    inline def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
    
    inline def setFirstRowAsNames(value: Boolean): Self = StObject.set(x, "firstRowAsNames", value.asInstanceOf[js.Any])
    
    inline def setFirstRowAsNamesUndefined: Self = StObject.set(x, "firstRowAsNames", js.undefined)
    
    inline def setGoogleAPIKey(value: String): Self = StObject.set(x, "googleAPIKey", value.asInstanceOf[js.Any])
    
    inline def setGoogleAPIKeyUndefined: Self = StObject.set(x, "googleAPIKey", js.undefined)
    
    inline def setGoogleSpreadsheetKey(value: String): Self = StObject.set(x, "googleSpreadsheetKey", value.asInstanceOf[js.Any])
    
    inline def setGoogleSpreadsheetKeyUndefined: Self = StObject.set(x, "googleSpreadsheetKey", js.undefined)
    
    inline def setGoogleSpreadsheetRange(value: String): Self = StObject.set(x, "googleSpreadsheetRange", value.asInstanceOf[js.Any])
    
    inline def setGoogleSpreadsheetRangeUndefined: Self = StObject.set(x, "googleSpreadsheetRange", js.undefined)
    
    inline def setItemDelimiter(value: String): Self = StObject.set(x, "itemDelimiter", value.asInstanceOf[js.Any])
    
    inline def setItemDelimiterUndefined: Self = StObject.set(x, "itemDelimiter", js.undefined)
    
    inline def setLineDelimiter(value: String): Self = StObject.set(x, "lineDelimiter", value.asInstanceOf[js.Any])
    
    inline def setLineDelimiterUndefined: Self = StObject.set(x, "lineDelimiter", js.undefined)
    
    inline def setParseDate(value: /* dateValue */ String => Double): Self = StObject.set(x, "parseDate", js.Any.fromFunction1(value))
    
    inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
    
    inline def setParsed(value: /* columns */ js.Array[js.Array[Any]] => js.UndefOr[Boolean]): Self = StObject.set(x, "parsed", js.Any.fromFunction1(value))
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[DataValueType]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsURL(value: String): Self = StObject.set(x, "rowsURL", value.asInstanceOf[js.Any])
    
    inline def setRowsURLUndefined: Self = StObject.set(x, "rowsURL", js.undefined)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[DataValueType]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSeriesMapping(value: js.Array[Dictionary[Double]]): Self = StObject.set(x, "seriesMapping", value.asInstanceOf[js.Any])
    
    inline def setSeriesMappingUndefined: Self = StObject.set(x, "seriesMapping", js.undefined)
    
    inline def setSeriesMappingVarargs(value: Dictionary[Double]*): Self = StObject.set(x, "seriesMapping", js.Array(value*))
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    inline def setSwitchRowsAndColumns(value: Boolean): Self = StObject.set(x, "switchRowsAndColumns", value.asInstanceOf[js.Any])
    
    inline def setSwitchRowsAndColumnsUndefined: Self = StObject.set(x, "switchRowsAndColumns", js.undefined)
    
    inline def setTable(value: String | HTMLElement): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
