package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends MarkerState {
  /**
    * Image markers only. Set the image width explicitly. When using this option, a width must also be set.
    * @default null
    * @since 4.0.4
    */
  var height: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var states: js.UndefOr[highchartsLib.Anon_SelectHover] = js.undefined
  /**
    * A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible
    * values are 'circle', 'square', 'diamond', 'triangle' and 'triangle-down'.
    *
    * Additionally, the URL to a graphic can be given on this form: 'url(graphic.png)'. Note that for the image to be
    * applied to exported charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to Highcharts.SVGRenderer.prototype.symbols. The
    * callback is then used by its method name.
    */
  var symbol: js.UndefOr[java.lang.String | scala.Null] = js.undefined
   // null, 'circle', 'square', 'diamond', 'triangle' 'triangle-down' or 'url(graphic.png)'
  /**
    * Image markers only. Set the image width explicitly. When using this option, a height must also be set.
    * @default null.
    * @since 4.0.4
    */
  var width: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

