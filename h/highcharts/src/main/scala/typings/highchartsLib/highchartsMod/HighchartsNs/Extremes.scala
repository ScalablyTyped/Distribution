package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extremes extends js.Object {
  /**
    * The maximum value of the axis' associated series.
    */
  var dataMax: scala.Double
  /**
    * The minimum value of the axis' associated series.
    */
  var dataMin: scala.Double
  /**
    * The maximum axis value, either automatic or set manually. If the max option is not set and maxPadding is 0, this
    * value will be the same as dataMax.
    */
  var max: scala.Double
  /**
    * The minimum axis value, either automatic or set manually. If the min option is not set and minPadding is 0, this
    * value will be the same as dataMin.
    */
  var min: scala.Double
}

object Extremes {
  @scala.inline
  def apply(dataMax: scala.Double, dataMin: scala.Double, max: scala.Double, min: scala.Double): Extremes = {
    val __obj = js.Dynamic.literal(dataMax = dataMax, dataMin = dataMin, max = max, min = min)
  
    __obj.asInstanceOf[Extremes]
  }
}

