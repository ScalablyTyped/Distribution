package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterFallChart extends BarChart {
  /**
    * The color of the line that connects columns in a waterfall series.
    * @default '#333333'
    * @since 3.0
    */
  var lineColor: js.UndefOr[Color] = js.undefined
  /**
    * The color used specifically for positive point columns. When not specified, the general series color is used.
    */
  var upColor: js.UndefOr[Color] = js.undefined
}

