package typings.highcharts.modulesMapMod.highchartsMod

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
  def apply(x: Double, y: Int | Double = null): MapCoordinateObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCoordinateObject]
  }
}

