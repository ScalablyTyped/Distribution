package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingCsvOptions extends js.Object {
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
  var columnHeaderFormatter: js.UndefOr[js.Function | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
    * exported dates on a datetime X axis. See `Highcharts.dateFormat`.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
    * exported CSV. Defaults to the same as the browser locale, typically `.`
    * (English) or `,` (German, French etc).
    */
  var decimalPoint: js.UndefOr[String | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
    * exported data. Use `;` for direct exporting to Excel. Defaults to a best
    * guess based on the browser locale. If the locale _decimal point_ is `,`,
    * the `itemDelimiter` defaults to `;`, otherwise the `itemDelimiter`
    * defaults to `,`.
    */
  var itemDelimiter: js.UndefOr[String | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
    * exported data, defaults to a newline.
    */
  var lineDelimiter: js.UndefOr[String] = js.undefined
}

object ExportingCsvOptions {
  @scala.inline
  def apply(
    columnHeaderFormatter: js.Function = null,
    dateFormat: String = null,
    decimalPoint: String = null,
    itemDelimiter: String = null,
    lineDelimiter: String = null
  ): ExportingCsvOptions = {
    val __obj = js.Dynamic.literal()
    if (columnHeaderFormatter != null) __obj.updateDynamic("columnHeaderFormatter")(columnHeaderFormatter)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint)
    if (itemDelimiter != null) __obj.updateDynamic("itemDelimiter")(itemDelimiter)
    if (lineDelimiter != null) __obj.updateDynamic("lineDelimiter")(lineDelimiter)
    __obj.asInstanceOf[ExportingCsvOptions]
  }
}

