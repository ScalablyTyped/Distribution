package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
    * strings in the chart. Requires the accessibility module to be loaded. For
    * a description of the module and information on its features, see
    * Highcharts Accessibility.
    *
    * For more dynamic control over the accessibility functionality, see
    * accessibility.pointDescriptionFormatter,
    * accessibility.seriesDescriptionFormatter, and
    * accessibility.screenReaderSectionFormatter.
    */
  var accessibility: js.UndefOr[LangAccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
    * tooltip title for the context menu holding print and export menu items.
    */
  var contextButtonTitle: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
    * in the `Highcharts.numberFormat` method unless otherwise specified in the
    * function arguments.
    */
  var decimalPoint: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Export-data module only. The
    * text for the menu item.
    */
  var downloadCSV: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the JPEG download menu item.
    */
  var downloadJPEG: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PDF download menu item.
    */
  var downloadPDF: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PNG download menu item.
    */
  var downloadPNG: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the SVG download menu item.
    */
  var downloadSVG: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Export-data module only. The
    * text for the menu item.
    */
  var downloadXLS: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) The text for the button that appears when drilling
    * down, linking back to the parent series. The parent series' name is
    * inserted for `{series.name}`.
    */
  var drillUpText: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) What to show in a date field for invalid dates.
    * Defaults to an empty string.
    */
  var invalidDate: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
    * when the chart is set into the loading state following a call to
    * `chart.showLoading`.
    */
  var loading: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names. Corresponds to the `%B` format in `Highcharts.dateFormat()`.
    */
  var months: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock) Configure the Popup strings in the chart.
    * Requires the `annotations.js` or `annotations-advanced.src.js` module to
    * be loaded.
    */
  var navigation: js.UndefOr[js.Object | LangNavigationOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The text to display when the chart contains no
    * data. Requires the no-data module, see noData.
    */
  var noData: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
    * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
    * which use symbols for 10^4, 10^8 and 10^12.
    */
  var numericSymbolMagnitude: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
    * high numbers in axis labels. Replacing any of the positions with `null`
    * causes the full number to be written. Setting `numericSymbols` to `null`
    * disables shortening altogether.
    */
  var numericSymbols: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Export-data module only. The
    * text for the menu item.
    */
  var openInCloud: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the menu item to print the chart.
    */
  var printChart: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) The text for the label for the "from" input box in the
    * range selector.
    */
  var rangeSelectorFrom: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) The text for the label for the "to" input box in the
    * range selector.
    */
  var rangeSelectorTo: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) The text for the label for the range selector buttons.
    */
  var rangeSelectorZoom: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
    * when a chart is zoomed.
    */
  var resetZoom: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
    * appearing when a chart is zoomed.
    */
  var resetZoomTitle: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names in abbreviated form. Corresponds to the `%b` format in
    * `Highcharts.dateFormat()`.
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
    * Sunday. If not specified, Highcharts uses the first three letters of the
    * `lang.weekdays` option.
    */
  var shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
    * Requires the `stock-tools.js` module to be loaded.
    */
  var stockTools: js.UndefOr[js.Object | LangStockToolsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
    * used in the `Highcharts.numberFormat` method unless otherwise specified
    * in the function arguments. Defaults to a single space character, which is
    * recommended in ISO 31-0 and works across Anglo-American and continental
    * European languages.
    */
  var thousandsSep: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Export-data module only. The
    * text for the menu item.
    */
  var viewData: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. View the
    * chart in full screen.
    */
  var viewFullscreen: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
    * names.
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highmaps) The title appearing on hovering the zoom in button. The text
    * itself defaults to "+" and can be changed in the button options.
    */
  var zoomIn: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) The title appearing on hovering the zoom out button. The text
    * itself defaults to "-" and can be changed in the button options.
    */
  var zoomOut: js.UndefOr[String] = js.undefined
}

object LangOptions {
  @scala.inline
  def apply(
    accessibility: LangAccessibilityOptions = null,
    contextButtonTitle: String = null,
    decimalPoint: String = null,
    downloadCSV: String = null,
    downloadJPEG: String = null,
    downloadPDF: String = null,
    downloadPNG: String = null,
    downloadSVG: String = null,
    downloadXLS: String = null,
    drillUpText: String = null,
    invalidDate: String = null,
    loading: String = null,
    months: js.Array[String] = null,
    navigation: js.Object | LangNavigationOptions = null,
    noData: String = null,
    numericSymbolMagnitude: Int | Double = null,
    numericSymbols: js.Array[String] = null,
    openInCloud: String = null,
    printChart: String = null,
    rangeSelectorFrom: String = null,
    rangeSelectorTo: String = null,
    rangeSelectorZoom: String = null,
    resetZoom: String = null,
    resetZoomTitle: String = null,
    shortMonths: js.Array[String] = null,
    shortWeekdays: js.Array[String] = null,
    stockTools: js.Object | LangStockToolsOptions = null,
    thousandsSep: String = null,
    viewData: String = null,
    viewFullscreen: String = null,
    weekdays: js.Array[String] = null,
    zoomIn: String = null,
    zoomOut: String = null
  ): LangOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (contextButtonTitle != null) __obj.updateDynamic("contextButtonTitle")(contextButtonTitle)
    if (decimalPoint != null) __obj.updateDynamic("decimalPoint")(decimalPoint)
    if (downloadCSV != null) __obj.updateDynamic("downloadCSV")(downloadCSV)
    if (downloadJPEG != null) __obj.updateDynamic("downloadJPEG")(downloadJPEG)
    if (downloadPDF != null) __obj.updateDynamic("downloadPDF")(downloadPDF)
    if (downloadPNG != null) __obj.updateDynamic("downloadPNG")(downloadPNG)
    if (downloadSVG != null) __obj.updateDynamic("downloadSVG")(downloadSVG)
    if (downloadXLS != null) __obj.updateDynamic("downloadXLS")(downloadXLS)
    if (drillUpText != null) __obj.updateDynamic("drillUpText")(drillUpText)
    if (invalidDate != null) __obj.updateDynamic("invalidDate")(invalidDate)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (months != null) __obj.updateDynamic("months")(months)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (numericSymbolMagnitude != null) __obj.updateDynamic("numericSymbolMagnitude")(numericSymbolMagnitude.asInstanceOf[js.Any])
    if (numericSymbols != null) __obj.updateDynamic("numericSymbols")(numericSymbols)
    if (openInCloud != null) __obj.updateDynamic("openInCloud")(openInCloud)
    if (printChart != null) __obj.updateDynamic("printChart")(printChart)
    if (rangeSelectorFrom != null) __obj.updateDynamic("rangeSelectorFrom")(rangeSelectorFrom)
    if (rangeSelectorTo != null) __obj.updateDynamic("rangeSelectorTo")(rangeSelectorTo)
    if (rangeSelectorZoom != null) __obj.updateDynamic("rangeSelectorZoom")(rangeSelectorZoom)
    if (resetZoom != null) __obj.updateDynamic("resetZoom")(resetZoom)
    if (resetZoomTitle != null) __obj.updateDynamic("resetZoomTitle")(resetZoomTitle)
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths)
    if (shortWeekdays != null) __obj.updateDynamic("shortWeekdays")(shortWeekdays)
    if (stockTools != null) __obj.updateDynamic("stockTools")(stockTools.asInstanceOf[js.Any])
    if (thousandsSep != null) __obj.updateDynamic("thousandsSep")(thousandsSep)
    if (viewData != null) __obj.updateDynamic("viewData")(viewData)
    if (viewFullscreen != null) __obj.updateDynamic("viewFullscreen")(viewFullscreen)
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays)
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn)
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut)
    __obj.asInstanceOf[LangOptions]
  }
}

