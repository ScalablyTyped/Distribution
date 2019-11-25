package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtremesObject extends js.Object {
  /**
    * The maximum value of the axis' associated series.
    */
  var dataMax: Double
  /**
    * The minimum value of the axis' associated series.
    */
  var dataMin: Double
  /**
    * The maximum axis value, either automatic or set manually. If the `max`
    * option is not set, `maxPadding` is 0 and `endOnTick` is false, this value
    * will be the same as `dataMax`.
    */
  var max: Double
  /**
    * The minimum axis value, either automatic or set manually. If the `min`
    * option is not set, `minPadding` is 0 and `startOnTick` is false, this
    * value will be the same as `dataMin`.
    */
  var min: Double
  /**
    * The user defined maximum, either from the `max` option or from a zoom or
    * `setExtremes` action.
    */
  var userMax: Double
  /**
    * The user defined minimum, either from the `min` option or from a zoom or
    * `setExtremes` action.
    */
  var userMin: Double
}

object ExtremesObject {
  @scala.inline
  def apply(dataMax: Double, dataMin: Double, max: Double, min: Double, userMax: Double, userMin: Double): ExtremesObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtremesObject]
  }
}

