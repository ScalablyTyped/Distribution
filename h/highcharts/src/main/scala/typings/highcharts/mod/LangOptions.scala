package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangOptions extends StObject {
  
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
  var accessibility: js.UndefOr[LangAccessibilityOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
    * tooltip title for the context menu holding print and export menu items.
    */
  var contextButtonTitle: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
    * in the `Highcharts.numberFormat` method unless otherwise specified in the
    * function arguments.
    */
  var decimalPoint: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var downloadCSV: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the JPEG download menu item.
    */
  var downloadJPEG: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PDF download menu item.
    */
  var downloadPDF: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PNG download menu item.
    */
  var downloadPNG: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the SVG download menu item.
    */
  var downloadSVG: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var downloadXLS: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highmaps) The text for the button that appears when drilling
    * down, linking back to the parent series. The parent series' name is
    * inserted for `{series.name}`.
    */
  var drillUpText: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the menu item to exit the chart from full screen.
    */
  var exitFullscreen: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
    */
  var exportData: js.UndefOr[LangExportDataOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var hideData: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) What to show in a date field for invalid dates.
    * Defaults to an empty string.
    */
  var invalidDate: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
    * when the chart is set into the loading state following a call to
    * `chart.showLoading`.
    */
  var loading: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names. Corresponds to the `%B` format in `Highcharts.dateFormat()`.
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock) Configure the Popup strings in the chart.
    * Requires the `annotations.js` or `annotations-advanced.src.js` module to
    * be loaded.
    */
  var navigation: js.UndefOr[LangNavigationOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The text to display when the chart contains no
    * data.
    */
  var noData: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
    * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
    * which use symbols for 10^4, 10^8 and 10^12.
    */
  var numericSymbolMagnitude: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
    * high numbers in axis labels. Replacing any of the positions with `null`
    * causes the full number to be written. Setting `numericSymbols` to `null`
    * disables shortening altogether.
    */
  var numericSymbols: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the menu item to print the chart.
    */
  var printChart: js.UndefOr[String] = js.native
  
  /**
    * (Highstock, Gantt) The text for the label for the "from" input box in the
    * range selector.
    */
  var rangeSelectorFrom: js.UndefOr[String] = js.native
  
  /**
    * (Highstock, Gantt) The text for the label for the "to" input box in the
    * range selector.
    */
  var rangeSelectorTo: js.UndefOr[String] = js.native
  
  /**
    * (Highstock, Gantt) The text for the label for the range selector buttons.
    */
  var rangeSelectorZoom: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
    * when a chart is zoomed.
    */
  var resetZoom: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
    * appearing when a chart is zoomed.
    */
  var resetZoomTitle: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names in abbreviated form. Corresponds to the `%b` format in
    * `Highcharts.dateFormat()`.
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
    * Sunday. If not specified, Highcharts uses the first three letters of the
    * `lang.weekdays` option.
    */
  var shortWeekdays: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
    * Requires the `stock-tools.js` module to be loaded.
    */
  var stockTools: js.UndefOr[LangStockToolsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
    * used in the `Highcharts.numberFormat` method unless otherwise specified
    * in the function arguments. Defaults to a single space character, which is
    * recommended in ISO 31-0 and works across Anglo-American and continental
    * European languages.
    */
  var thousandsSep: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var viewData: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the menu item to view the chart in full screen.
    */
  var viewFullscreen: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
    * names.
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highmaps) The title appearing on hovering the zoom in button. The text
    * itself defaults to "+" and can be changed in the button options.
    */
  var zoomIn: js.UndefOr[String] = js.native
  
  /**
    * (Highmaps) The title appearing on hovering the zoom out button. The text
    * itself defaults to "-" and can be changed in the button options.
    */
  var zoomOut: js.UndefOr[String] = js.native
}
object LangOptions {
  
  @scala.inline
  def apply(): LangOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangOptions]
  }
  
  @scala.inline
  implicit class LangOptionsMutableBuilder[Self <: LangOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: LangAccessibilityOptions): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setContextButtonTitle(value: String): Self = StObject.set(x, "contextButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextButtonTitleUndefined: Self = StObject.set(x, "contextButtonTitle", js.undefined)
    
    @scala.inline
    def setDecimalPoint(value: String): Self = StObject.set(x, "decimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPointUndefined: Self = StObject.set(x, "decimalPoint", js.undefined)
    
    @scala.inline
    def setDownloadCSV(value: String): Self = StObject.set(x, "downloadCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadCSVUndefined: Self = StObject.set(x, "downloadCSV", js.undefined)
    
    @scala.inline
    def setDownloadJPEG(value: String): Self = StObject.set(x, "downloadJPEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadJPEGUndefined: Self = StObject.set(x, "downloadJPEG", js.undefined)
    
    @scala.inline
    def setDownloadPDF(value: String): Self = StObject.set(x, "downloadPDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPDFUndefined: Self = StObject.set(x, "downloadPDF", js.undefined)
    
    @scala.inline
    def setDownloadPNG(value: String): Self = StObject.set(x, "downloadPNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPNGUndefined: Self = StObject.set(x, "downloadPNG", js.undefined)
    
    @scala.inline
    def setDownloadSVG(value: String): Self = StObject.set(x, "downloadSVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadSVGUndefined: Self = StObject.set(x, "downloadSVG", js.undefined)
    
    @scala.inline
    def setDownloadXLS(value: String): Self = StObject.set(x, "downloadXLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadXLSUndefined: Self = StObject.set(x, "downloadXLS", js.undefined)
    
    @scala.inline
    def setDrillUpText(value: String): Self = StObject.set(x, "drillUpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillUpTextUndefined: Self = StObject.set(x, "drillUpText", js.undefined)
    
    @scala.inline
    def setExitFullscreen(value: String): Self = StObject.set(x, "exitFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitFullscreenUndefined: Self = StObject.set(x, "exitFullscreen", js.undefined)
    
    @scala.inline
    def setExportData(value: LangExportDataOptions): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    @scala.inline
    def setHideData(value: String): Self = StObject.set(x, "hideData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDataUndefined: Self = StObject.set(x, "hideData", js.undefined)
    
    @scala.inline
    def setInvalidDate(value: String): Self = StObject.set(x, "invalidDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidDateUndefined: Self = StObject.set(x, "invalidDate", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    @scala.inline
    def setNavigation(value: LangNavigationOptions): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    @scala.inline
    def setNumericSymbolMagnitude(value: Double): Self = StObject.set(x, "numericSymbolMagnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericSymbolMagnitudeUndefined: Self = StObject.set(x, "numericSymbolMagnitude", js.undefined)
    
    @scala.inline
    def setNumericSymbols(value: js.Array[String]): Self = StObject.set(x, "numericSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericSymbolsUndefined: Self = StObject.set(x, "numericSymbols", js.undefined)
    
    @scala.inline
    def setNumericSymbolsVarargs(value: String*): Self = StObject.set(x, "numericSymbols", js.Array(value :_*))
    
    @scala.inline
    def setPrintChart(value: String): Self = StObject.set(x, "printChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintChartUndefined: Self = StObject.set(x, "printChart", js.undefined)
    
    @scala.inline
    def setRangeSelectorFrom(value: String): Self = StObject.set(x, "rangeSelectorFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSelectorFromUndefined: Self = StObject.set(x, "rangeSelectorFrom", js.undefined)
    
    @scala.inline
    def setRangeSelectorTo(value: String): Self = StObject.set(x, "rangeSelectorTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSelectorToUndefined: Self = StObject.set(x, "rangeSelectorTo", js.undefined)
    
    @scala.inline
    def setRangeSelectorZoom(value: String): Self = StObject.set(x, "rangeSelectorZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSelectorZoomUndefined: Self = StObject.set(x, "rangeSelectorZoom", js.undefined)
    
    @scala.inline
    def setResetZoom(value: String): Self = StObject.set(x, "resetZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetZoomTitle(value: String): Self = StObject.set(x, "resetZoomTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetZoomTitleUndefined: Self = StObject.set(x, "resetZoomTitle", js.undefined)
    
    @scala.inline
    def setResetZoomUndefined: Self = StObject.set(x, "resetZoom", js.undefined)
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setShortWeekdays(value: js.Array[String]): Self = StObject.set(x, "shortWeekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortWeekdaysUndefined: Self = StObject.set(x, "shortWeekdays", js.undefined)
    
    @scala.inline
    def setShortWeekdaysVarargs(value: String*): Self = StObject.set(x, "shortWeekdays", js.Array(value :_*))
    
    @scala.inline
    def setStockTools(value: LangStockToolsOptions): Self = StObject.set(x, "stockTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockToolsUndefined: Self = StObject.set(x, "stockTools", js.undefined)
    
    @scala.inline
    def setThousandsSep(value: String): Self = StObject.set(x, "thousandsSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSepUndefined: Self = StObject.set(x, "thousandsSep", js.undefined)
    
    @scala.inline
    def setViewData(value: String): Self = StObject.set(x, "viewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDataUndefined: Self = StObject.set(x, "viewData", js.undefined)
    
    @scala.inline
    def setViewFullscreen(value: String): Self = StObject.set(x, "viewFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFullscreenUndefined: Self = StObject.set(x, "viewFullscreen", js.undefined)
    
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    
    @scala.inline
    def setZoomIn(value: String): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
    
    @scala.inline
    def setZoomOut(value: String): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
  }
}
