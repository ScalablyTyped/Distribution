package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  implicit class LangOptionsOps[Self <: LangOptions] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: LangAccessibilityOptions): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setContextButtonTitle(value: String): Self = this.set("contextButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextButtonTitle: Self = this.set("contextButtonTitle", js.undefined)
    @scala.inline
    def setDecimalPoint(value: String): Self = this.set("decimalPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPoint: Self = this.set("decimalPoint", js.undefined)
    @scala.inline
    def setDownloadCSV(value: String): Self = this.set("downloadCSV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadCSV: Self = this.set("downloadCSV", js.undefined)
    @scala.inline
    def setDownloadJPEG(value: String): Self = this.set("downloadJPEG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadJPEG: Self = this.set("downloadJPEG", js.undefined)
    @scala.inline
    def setDownloadPDF(value: String): Self = this.set("downloadPDF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadPDF: Self = this.set("downloadPDF", js.undefined)
    @scala.inline
    def setDownloadPNG(value: String): Self = this.set("downloadPNG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadPNG: Self = this.set("downloadPNG", js.undefined)
    @scala.inline
    def setDownloadSVG(value: String): Self = this.set("downloadSVG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadSVG: Self = this.set("downloadSVG", js.undefined)
    @scala.inline
    def setDownloadXLS(value: String): Self = this.set("downloadXLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadXLS: Self = this.set("downloadXLS", js.undefined)
    @scala.inline
    def setDrillUpText(value: String): Self = this.set("drillUpText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillUpText: Self = this.set("drillUpText", js.undefined)
    @scala.inline
    def setExitFullscreen(value: String): Self = this.set("exitFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitFullscreen: Self = this.set("exitFullscreen", js.undefined)
    @scala.inline
    def setExportData(value: LangExportDataOptions): Self = this.set("exportData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportData: Self = this.set("exportData", js.undefined)
    @scala.inline
    def setInvalidDate(value: String): Self = this.set("invalidDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidDate: Self = this.set("invalidDate", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setNavigation(value: LangNavigationOptions): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
    @scala.inline
    def setNumericSymbolMagnitude(value: Double): Self = this.set("numericSymbolMagnitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericSymbolMagnitude: Self = this.set("numericSymbolMagnitude", js.undefined)
    @scala.inline
    def setNumericSymbolsVarargs(value: String*): Self = this.set("numericSymbols", js.Array(value :_*))
    @scala.inline
    def setNumericSymbols(value: js.Array[String]): Self = this.set("numericSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericSymbols: Self = this.set("numericSymbols", js.undefined)
    @scala.inline
    def setPrintChart(value: String): Self = this.set("printChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintChart: Self = this.set("printChart", js.undefined)
    @scala.inline
    def setRangeSelectorFrom(value: String): Self = this.set("rangeSelectorFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorFrom: Self = this.set("rangeSelectorFrom", js.undefined)
    @scala.inline
    def setRangeSelectorTo(value: String): Self = this.set("rangeSelectorTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorTo: Self = this.set("rangeSelectorTo", js.undefined)
    @scala.inline
    def setRangeSelectorZoom(value: String): Self = this.set("rangeSelectorZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorZoom: Self = this.set("rangeSelectorZoom", js.undefined)
    @scala.inline
    def setResetZoom(value: String): Self = this.set("resetZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetZoom: Self = this.set("resetZoom", js.undefined)
    @scala.inline
    def setResetZoomTitle(value: String): Self = this.set("resetZoomTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetZoomTitle: Self = this.set("resetZoomTitle", js.undefined)
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortMonths: Self = this.set("shortMonths", js.undefined)
    @scala.inline
    def setShortWeekdaysVarargs(value: String*): Self = this.set("shortWeekdays", js.Array(value :_*))
    @scala.inline
    def setShortWeekdays(value: js.Array[String]): Self = this.set("shortWeekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortWeekdays: Self = this.set("shortWeekdays", js.undefined)
    @scala.inline
    def setStockTools(value: LangStockToolsOptions): Self = this.set("stockTools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStockTools: Self = this.set("stockTools", js.undefined)
    @scala.inline
    def setThousandsSep(value: String): Self = this.set("thousandsSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSep: Self = this.set("thousandsSep", js.undefined)
    @scala.inline
    def setViewData(value: String): Self = this.set("viewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewData: Self = this.set("viewData", js.undefined)
    @scala.inline
    def setViewFullscreen(value: String): Self = this.set("viewFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewFullscreen: Self = this.set("viewFullscreen", js.undefined)
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    @scala.inline
    def setZoomIn(value: String): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    @scala.inline
    def setZoomOut(value: String): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
  }
  
}

