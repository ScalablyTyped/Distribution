package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangObject extends js.Object {
  /**
    * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
    * @default 'Chart context menu'
    * @since 3.0
    */
  var contextButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default decimal point used in the Highcharts.numberFormat method unless otherwise specified in the function
    * arguments.
    * @default '.'
    * @since 1.2.2
    */
  var decimalPoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exporting module only. The text for the JPEG download menu item.
    * @default 'Download JPEG image'
    * @since 2.0
    */
  var downloadJPEG: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exporting module only. The text for the PDF download menu item.
    * @default 'Download PDF document'
    * @since 2.0
    */
  var downloadPDF: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exporting module only. The text for the PNG download menu item.
    * @default 'Download PNG image'
    * @since 2.0
    */
  var downloadPNG: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exporting module only. The text for the SVG download menu item.
    * @default 'Download SVG vector image'
    * @since 2.0
    */
  var downloadSVG: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the button that appears when drilling down, linking back to the parent series. The parent series'
    * name is inserted for {series.name}
    * @default 'Back to {series.name}'
    * @since 3.0.8
    */
  var drillUpText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What to show in a date field for invalid dates.
    * @default ''
    * @since 4.1.8
    */
  var invalidDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The loading text that appears when the chart is set into the loading state following a call to chart.showLoading.
    * @default 'Loading...'
    */
  var loading: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array containing the months names. Corresponds to the %B format in Highcharts.dateFormat().
    * @default ['January' , 'February' , 'March' , 'April' , 'May' , 'June' , 'July' , 'August' , 'September' , 'October' , 'November' , 'December']
    */
  var months: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The text to display when the chart contains no data. Requires the no-data module, see noData.
    * @default 'No data to display'
    * @since 3.0.8
    */
  var noData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The magnitude of numericSymbols replacements.
    * Use 10000 for Japanese, Korean and various Chinese locales, which use symbols for 10^4, 10^8 and 10^12.
    * @since 5.0.3
    * @default 1000
    */
  var numericSymbolMagnitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * Metric prefixes used to shorten high numbers in axis labels. Replacing any of the positions with null causes the
    * full number to be written. Setting numericSymbols to null disables shortening altogether.
    * @default ['k', 'M', 'G', 'T', 'P', 'E']
    * @since 2.3.0
    */
  var numericSymbols: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * Exporting module only. The text for the menu item to print the chart.
    * @default 'Print chart'
    * @since 3.0.1
    */
  var printChart: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the label for the "from" input box in the range selector.
    * @default 'From'
    */
  var rangeSelectorFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the label for the "to" input box in the range selector.
    * @default 'To'
    */
  var rangeSelectorTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the label for the range selector buttons.
    * @default 'Zoom'
    */
  var rangeSelectorZoom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the label appearing when a chart is zoomed.
    * @default 'Reset zoom'
    * @since 1.2.4
    */
  var resetZoom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tooltip title for the label appearing when a chart is zoomed.
    * @default 'Reset zoom level 1:1'
    * @since 1.2.4
    */
  var resetZoomTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array containing the months names in abbreviated form. Corresponds to the %b format in
    * Highcharts.dateFormat().
    * @default ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    */
  var shortMonths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Short week days, starting Sunday. If not specified, Highcharts uses the first three letters of the lang.weekdays option.
    * @default undefined
    * @since 4.2.4
    */
  var shortWeekdays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The default thousands separator used in the Highcharts.numberFormat method unless otherwise specified in the
    * function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO
    * and works across Anglo-American and continental European languages.
    * @default ' '
    * @since 1.2.2
    */
  var thousandsSep: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array containing the weekday names.
    * @default ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
    */
  var weekdays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LangObject {
  @scala.inline
  def apply(
    contextButtonTitle: java.lang.String = null,
    decimalPoint: java.lang.String = null,
    downloadJPEG: java.lang.String = null,
    downloadPDF: java.lang.String = null,
    downloadPNG: java.lang.String = null,
    downloadSVG: java.lang.String = null,
    drillUpText: java.lang.String = null,
    invalidDate: java.lang.String = null,
    loading: java.lang.String = null,
    months: js.Array[java.lang.String] = null,
    noData: java.lang.String = null,
    numericSymbolMagnitude: scala.Int | scala.Double = null,
    numericSymbols: js.Array[java.lang.String] = null,
    printChart: java.lang.String = null,
    rangeSelectorFrom: java.lang.String = null,
    rangeSelectorTo: java.lang.String = null,
    rangeSelectorZoom: java.lang.String = null,
    resetZoom: java.lang.String = null,
    resetZoomTitle: java.lang.String = null,
    shortMonths: js.Array[java.lang.String] = null,
    shortWeekdays: js.Array[java.lang.String] = null,
    thousandsSep: java.lang.String = null,
    weekdays: js.Array[java.lang.String] = null
  ): LangObject = {
    val __obj = js.Dynamic.literal()
    if (contextButtonTitle != null) __obj.updateDynamic("contextButtonTitle")(contextButtonTitle)
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint)
    if (downloadJPEG != null) __obj.updateDynamic("downloadJPEG")(downloadJPEG)
    if (downloadPDF != null) __obj.updateDynamic("downloadPDF")(downloadPDF)
    if (downloadPNG != null) __obj.updateDynamic("downloadPNG")(downloadPNG)
    if (downloadSVG != null) __obj.updateDynamic("downloadSVG")(downloadSVG)
    if (drillUpText != null) __obj.updateDynamic("drillUpText")(drillUpText)
    if (invalidDate != null) __obj.updateDynamic("invalidDate")(invalidDate)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (months != null) __obj.updateDynamic("months")(months)
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (numericSymbolMagnitude != null) __obj.updateDynamic("numericSymbolMagnitude")(numericSymbolMagnitude.asInstanceOf[js.Any])
    if (numericSymbols != null) __obj.updateDynamic("numericSymbols")(numericSymbols)
    if (printChart != null) __obj.updateDynamic("printChart")(printChart)
    if (rangeSelectorFrom != null) __obj.updateDynamic("rangeSelectorFrom")(rangeSelectorFrom)
    if (rangeSelectorTo != null) __obj.updateDynamic("rangeSelectorTo")(rangeSelectorTo)
    if (rangeSelectorZoom != null) __obj.updateDynamic("rangeSelectorZoom")(rangeSelectorZoom)
    if (resetZoom != null) __obj.updateDynamic("resetZoom")(resetZoom)
    if (resetZoomTitle != null) __obj.updateDynamic("resetZoomTitle")(resetZoomTitle)
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths)
    if (shortWeekdays != null) __obj.updateDynamic("shortWeekdays")(shortWeekdays)
    if (thousandsSep != null) __obj.updateDynamic("thousandsSep")(thousandsSep)
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays)
    __obj.asInstanceOf[LangObject]
  }
}

