package typings.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait repositionStatsObj extends js.Object {
  var centerX: Double
  var centerY: Double
  var mapUnitsPerPixel: Double
  var zoomLevel: Double
}

object repositionStatsObj {
  @scala.inline
  def apply(centerX: Double, centerY: Double, mapUnitsPerPixel: Double, zoomLevel: Double): repositionStatsObj = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[repositionStatsObj]
  }
}

