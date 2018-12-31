package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Halo extends js.Object {
  /**
    * A collection of SVG attributes to override the appearance of the halo, for example fill, stroke and stroke-width.
    * @since 4.0
    */
  var attributes: js.UndefOr[js.Object] = js.undefined
  /**
    * Opacity for the halo unless a specific fill is overridden using the attributes setting. Note that Highcharts is
    * only able to apply opacity to colors of hex or rgb(a) formats.
    * @default 0.25
    * @since 4.0
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of
    * the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
    * Defaults to 10.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

