package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaZone extends js.Object {
  /**
    * Styled mode only. A custom class name for the zone.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the color of the series.
    * @since 4.1.0
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * A name for the dash style to use for the graph.
    * @since 4.1.0
    */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the fill color for the series (in area type series)
    * @since 4.1.0
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
    * @default undefined
    * @since 4.1.0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

