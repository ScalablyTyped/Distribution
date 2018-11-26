package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AreaChart extends SeriesChart {
  /**
           * Fill color or gradient for the area. When null, the series' color is used with the series' fillOpacity.
           */
  var fillColor: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
           * Fill opacity for the area. Note that when you set an explicit fillColor, the fillOpacity is not applied. Instead,
           * you should define the opacity in the fillColor with an rgba color definition.
           * @default 0.75
           */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
           * A separate color for the graph line. By default the line takes the color of the series, but the lineColor setting
           * allows setting a separate color for the line without altering the fillColor.
           */
  var lineColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
           */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
           */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * A separate color for the negative part of the area.
           * @since 3.0
           */
  var negativeFillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether to apply steps to the line. Possible values are left, center and right. Prior to 2.3.5, only left was
           * supported.
           *
           * @default 'false'
           * @since 1.2.5
           */
  var step: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events.
           * @default false
           * @since 1.1.6
           */
  var trackByArea: js.UndefOr[scala.Boolean] = js.undefined
}

