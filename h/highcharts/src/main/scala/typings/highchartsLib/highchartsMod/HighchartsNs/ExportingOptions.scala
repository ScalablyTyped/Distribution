package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExportingOptions extends js.Object {
  /**
           * Experimental setting to allow HTML inside the chart (added through the useHTML options), directly in the exported
           * image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported
           * charts.
           *
           * Disclaimer: The HTML is rendered in a foreignObject tag in the generated SVG. The official export server is based
           * on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to
           * downloaded SVG that you want to open in a desktop client.
           * @default false
           * @since 4.1.8
           */
  var allowHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom
           * buttons can be added. See navigation.buttonOptions for general options.
           */
  var buttons: js.UndefOr[highchartsLib.Anon_ContextButton] = js.undefined
  /**
           * Additional chart options to be merged into an exported chart. For example, the exported chart can be given a
           * specific width and height, or a printer-friendly color scheme.
           * @default null
           */
  var chartOptions: js.UndefOr[Options | scala.Null] = js.undefined
  /**
           * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will
           * still be available.
           * @default true
           * @since 2.0
           */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Function to call if the offline-exporting module fails to export a chart on the client side, and
           * fallbackToExportServer is disabled. If left undefined, an exception is thrown instead.
           * @default undefined
           * @since 5.0.0
           */
  var error: js.UndefOr[js.Function] = js.undefined
  /**
           * Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on
           * the client side.
           * @default true
           * @since 4.1.8
           */
  var fallbackToExportServer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The filename, without extension, to use for the exported chart.
           * @default 'chart'
           * @since 2.0
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
           * An object containing additional attributes for the POST form that sends the SVG to the export server. For
           * example, a target can be set to make sure the generated image is received in another frame, or a custom enctype
           * or encoding can be set.
           * @since 3.0.8
           */
  var formAttributes: js.UndefOr[js.Any] = js.undefined
  /**
           * Path where Highcharts will look for export module dependencies to load on demand if they don't already exist on
           * window. Should currently point to location of CanVG library (https://github.com/canvg/canvg) and RGBColor.js,
           * required for client side export in certain browsers.
           * @default 'http://code.highcharts.com/{version}/lib'
           * @since 5.0.0
           */
  var libUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When printing the chart from the menu item in the burger menu, if the on-screen chart exceeds this width, it is
           * resized. After printing or cancelled, it is restored. The default width makes the chart fit into typical paper
           * format. Note that this does not affect the chart when printing the web page as a whole.
           * @default 780
           * @since 4.2.5
           */
  var printMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a
           * 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart
           * export to a 1200px PNG or JPG.
           * @default 2
           * @since 3.0
           */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
           * The height of the original chart when exported, unless an explicit chart.height is set. The height exported
           * raster image is then multiplied by scale.
           * @since 3.0
           */
  var sourceHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * The width of the original chart when exported, unless an explicit chart.width is set. The width exported
           * raster image is then multiplied by scale.
           * @since 3.0
           */
  var sourceWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * Default MIME type for exporting if chart.exportChart() is called without specifying a type option. Possible
           * values are image/png, image/jpeg, application/pdf and image/svg+xml.
           * @default 'image/png'
           * @since 2.0
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The URL for the server module converting the SVG string to an image format. By default this points to Highslide
           * Software's free web service.
           * @default 'http://export.highcharts.com'
           * @since 2.0
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of
           * the chart.width or exporting.sourceWidth and the exporting.scale.
           * @since 2.0
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

