package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingCsvOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotations in the
    * export-data table.
    */
  var annotations: js.UndefOr[ExportingCsvAnnotationsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
    * column headers. Parameters are:
    *
    * - `item` - The series or axis object)
    *
    * - `key` - The point key, for example y or z
    *
    * - `keyLength` - The amount of value keys for this item, for example a
    * range series has the keys `low` and `high` so the key length is 2.
    *
    * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
    * an object with columnTitle and topLevelColumnTitle for each key. Columns
    * with the same topLevelColumnTitle have their titles merged into a single
    * cell with colspan for table/Excel export.
    *
    * If `useMultiLevelHeaders` is false, or for CSV export, it returns the
    * series name, followed by the key if there is more than one key.
    *
    * For the axis it returns the axis title or "Category" or "DateTime" by
    * default.
    *
    * Return `false` to use Highcharts' proposed header.
    */
  var columnHeaderFormatter: js.UndefOr[js.Function | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
    * exported dates on a datetime X axis. See `Highcharts.dateFormat`.
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
    * exported CSV. Defaults to the same as the browser locale, typically `.`
    * (English) or `,` (German, French etc).
    */
  var decimalPoint: js.UndefOr[String | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
    * exported data. Use `;` for direct exporting to Excel. Defaults to a best
    * guess based on the browser locale. If the locale _decimal point_ is `,`,
    * the `itemDelimiter` defaults to `;`, otherwise the `itemDelimiter`
    * defaults to `,`.
    */
  var itemDelimiter: js.UndefOr[String | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
    * exported data, defaults to a newline.
    */
  var lineDelimiter: js.UndefOr[String] = js.native
}
object ExportingCsvOptions {
  
  @scala.inline
  def apply(): ExportingCsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingCsvOptions]
  }
  
  @scala.inline
  implicit class ExportingCsvOptionsOps[Self <: ExportingCsvOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(value: ExportingCsvAnnotationsOptions): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setColumnHeaderFormatter(value: js.Function): Self = this.set("columnHeaderFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaderFormatter: Self = this.set("columnHeaderFormatter", js.undefined)
    
    @scala.inline
    def setColumnHeaderFormatterNull: Self = this.set("columnHeaderFormatter", null)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDecimalPoint(value: String): Self = this.set("decimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPoint: Self = this.set("decimalPoint", js.undefined)
    
    @scala.inline
    def setDecimalPointNull: Self = this.set("decimalPoint", null)
    
    @scala.inline
    def setItemDelimiter(value: String): Self = this.set("itemDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemDelimiter: Self = this.set("itemDelimiter", js.undefined)
    
    @scala.inline
    def setItemDelimiterNull: Self = this.set("itemDelimiter", null)
    
    @scala.inline
    def setLineDelimiter(value: String): Self = this.set("lineDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDelimiter: Self = this.set("lineDelimiter", js.undefined)
  }
}
