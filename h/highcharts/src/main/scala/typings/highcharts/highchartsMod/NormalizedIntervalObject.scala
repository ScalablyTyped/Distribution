package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedIntervalObject extends js.Object {
  /**
    * The count.
    */
  var count: Double
  /**
    * The interval in axis values (ms).
    */
  var unitRange: Double
}

object NormalizedIntervalObject {
  @scala.inline
  def apply(count: Double, unitRange: Double): NormalizedIntervalObject = {
    val __obj = js.Dynamic.literal(count = count, unitRange = unitRange)
  
    __obj.asInstanceOf[NormalizedIntervalObject]
  }
}

