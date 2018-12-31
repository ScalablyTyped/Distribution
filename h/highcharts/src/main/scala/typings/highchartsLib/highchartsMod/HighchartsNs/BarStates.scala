package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarStates extends js.Object {
  /**
    * A specific border color for the hovered point. Defaults to inherit the normal state border color.
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format.
    * @default 0.1
    */
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the
    * legend.
    * @default true
    * @since 1.2
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice
    * in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The
    * halo can be disabled by setting the halo option to false.
    * @since 4.0
    */
  var halo: js.UndefOr[scala.Boolean | Halo] = js.undefined
}

