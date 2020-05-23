package typings.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result object of a map transformation.
  */
trait MapCoordinateObject extends js.Object {
  /**
    * X coordinate on the map.
    */
  var x: Double
  /**
    * Y coordinate on the map.
    */
  var y: Double | Null
}

object MapCoordinateObject {
  @scala.inline
  def apply(x: Double, y: Double = null.asInstanceOf[Double]): MapCoordinateObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCoordinateObject]
  }
}

