package typings.highcharts.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * exporting menu. Requires the Accessibility module.
    */
  var accessibility: js.UndefOr[ExportingAccessibilityOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Experimental setting to allow
    * HTML inside the chart (added through the `useHTML` options), directly in
    * the exported image. This allows you to preserve complicated HTML
    * structures like tables or bi-directional text in exported charts.
    *
    * Disclaimer: The HTML is rendered in a `foreignObject` tag in the
    * generated SVG. The official export server is based on PhantomJS, which
    * supports this, but other SVG clients, like Batik, does not support it.
    * This also applies to downloaded SVG that you want to open in a desktop
    * client.
    */
  var allowHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
    * buttons, print and export. In addition to the default buttons listed
    * here, custom buttons can be added. See navigation.buttonOptions for
    * general options.
    */
  var buttons: js.UndefOr[ExportingButtonsOptions | Dictionary[ExportingButtonsOptionsObject]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional chart options to be
    * merged into the chart before exporting to an image format. This does not
    * apply to printing the chart via the export menu.
    *
    * For example, a common use case is to add data labels to improve
    * readability of the exported chart, or to add a printer-friendly color
    * scheme to exported PDFs.
    */
  var chartOptions: js.UndefOr[Options] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to
    * CSV or ExCel, or displaying the data in a HTML table or a JavaScript
    * structure.
    *
    * This module adds data export options to the export menu and provides
    * functions like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows` and
    * `Chart.viewData`.
    *
    * The XLS converter is limited and only creates a HTML string that is
    * passed for download, which works but creates a warning before opening.
    * The workaround for this is to use a third party XLSX converter, as
    * demonstrated in the sample below.
    */
  var csv: js.UndefOr[ExportingCsvOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the exporting
    * module. Disabling the module will hide the context button, but API
    * methods will still be available.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to call if the
    * offline-exporting module fails to export a chart on the client side, and
    * fallbackToExportServer is disabled. If left undefined, an exception is
    * thrown instead. Receives two parameters, the exporting options, and the
    * error from the module.
    */
  var error: js.UndefOr[ExportingErrorCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to fall back to
    * the export server if the offline-exporting module is unable to export the
    * chart on the client side. This happens for certain browsers, and certain
    * features (e.g. allowHTML), depending on the image type exporting to. For
    * very complex charts, it is possible that export can fail in browsers that
    * don't support Blob objects, due to data URL length limits. It is
    * recommended to define the exporting.error handler if disabling fallback,
    * in order to notify users in case export fails.
    */
  var fallbackToExportServer: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The filename, without extension,
    * to use for the exported chart.
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An object containing additional
    * key value data for the POST form that sends the SVG to the export server.
    * For example, a `target` can be set to make sure the generated image is
    * received in another frame, or a custom `enctype` or `encoding` can be
    * set.
    */
  var formAttributes: js.UndefOr[HTMLAttributes] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
    * for export module dependencies to load on demand if they don't already
    * exist on `window`. Should currently point to location of CanVG library,
    * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
    * certain browsers.
    */
  var libURL: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An object consisting of
    * definitions for the menu items in the context menu. Each key value pair
    * has a `key` that is referenced in the menuItems setting, and a `value`,
    * which is an object with the following properties:
    *
    * - **onclick:** The click handler for the menu item
    *
    * - **text:** The text for the menu item
    *
    * - **textKey:** If internationalization is required, the key to a language
    * string
    *
    * Custom text for the "exitFullScreen" can be set only in lang options (it
    * is not a separate button).
    */
  var menuItemDefinitions: js.UndefOr[Dictionary[ExportingMenuObject]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When printing the chart from the
    * menu item in the burger menu, if the on-screen chart exceeds this width,
    * it is resized. After printing or cancelled, it is restored. The default
    * width makes the chart fit into typical paper format. Note that this does
    * not affect the chart when printing the web page as a whole.
    */
  var printMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Defines the scale or zoom factor
    * for the exported image compared to the on-screen display. While for
    * instance a 600px wide chart may look good on a website, it will look bad
    * in print. The default scale of 2 makes this chart export to a 1200px PNG
    * or JPG.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show a HTML table below the
    * chart with the chart's current data.
    */
  var showTable: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Analogous to sourceWidth.
    */
  var sourceHeight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the original chart
    * when exported, unless an explicit chart.width is set, or a pixel width is
    * set on the container. The width exported raster image is then multiplied
    * by scale.
    */
  var sourceWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
    * as chart title by default. Set to `false` to disable.
    */
  var tableCaption: js.UndefOr[Boolean | String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default MIME type for exporting
    * if `chart.exportChart()` is called without specifying a `type` option.
    * Possible values are `image/png`, `image/jpeg`, `application/pdf` and
    * `image/svg+xml`.
    */
  var `type`: js.UndefOr[ExportingMimeTypeValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for the server module
    * converting the SVG string to an image format. By default this points to
    * Highchart's free web service.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Use multi level headers in data
    * table. If csv.columnHeaderFormatter is defined, it has to return objects
    * in order for multi level headers to work.
    */
  var useMultiLevelHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If using multi level table
    * headers, use rowspans for headers that have only one level.
    */
  var useRowspanHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of charts
    * exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is
    * a function of the chart.width or exporting.sourceWidth and the
    * exporting.scale.
    */
  var width: js.UndefOr[Double] = js.native
}
object ExportingOptions {
  
  @scala.inline
  def apply(): ExportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingOptions]
  }
  
  @scala.inline
  implicit class ExportingOptionsOps[Self <: ExportingOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(value: ExportingAccessibilityOptions): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAllowHTML(value: Boolean): Self = this.set("allowHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHTML: Self = this.set("allowHTML", js.undefined)
    
    @scala.inline
    def setButtons(value: ExportingButtonsOptions | Dictionary[ExportingButtonsOptionsObject]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setChartOptions(value: Options): Self = this.set("chartOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartOptions: Self = this.set("chartOptions", js.undefined)
    
    @scala.inline
    def setCsv(value: ExportingCsvOptions): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setError(value: (/* options */ ExportingOptions, /* err */ Error) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFallbackToExportServer(value: Boolean): Self = this.set("fallbackToExportServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackToExportServer: Self = this.set("fallbackToExportServer", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFormAttributes(value: HTMLAttributes): Self = this.set("formAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAttributes: Self = this.set("formAttributes", js.undefined)
    
    @scala.inline
    def setLibURL(value: String): Self = this.set("libURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibURL: Self = this.set("libURL", js.undefined)
    
    @scala.inline
    def setMenuItemDefinitions(value: Dictionary[ExportingMenuObject]): Self = this.set("menuItemDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemDefinitions: Self = this.set("menuItemDefinitions", js.undefined)
    
    @scala.inline
    def setPrintMaxWidth(value: Double): Self = this.set("printMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMaxWidth: Self = this.set("printMaxWidth", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShowTable(value: Boolean): Self = this.set("showTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTable: Self = this.set("showTable", js.undefined)
    
    @scala.inline
    def setSourceHeight(value: Double): Self = this.set("sourceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHeight: Self = this.set("sourceHeight", js.undefined)
    
    @scala.inline
    def setSourceWidth(value: Double): Self = this.set("sourceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceWidth: Self = this.set("sourceWidth", js.undefined)
    
    @scala.inline
    def setTableCaption(value: Boolean | String): Self = this.set("tableCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCaption: Self = this.set("tableCaption", js.undefined)
    
    @scala.inline
    def setType(value: ExportingMimeTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseMultiLevelHeaders(value: Boolean): Self = this.set("useMultiLevelHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMultiLevelHeaders: Self = this.set("useMultiLevelHeaders", js.undefined)
    
    @scala.inline
    def setUseRowspanHeaders(value: Boolean): Self = this.set("useRowspanHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRowspanHeaders: Self = this.set("useRowspanHeaders", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
