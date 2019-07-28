package typings.mapsjs.mapsjsMod

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
    val __obj = js.Dynamic.literal(centerX = centerX, centerY = centerY, mapUnitsPerPixel = mapUnitsPerPixel, zoomLevel = zoomLevel)
  
    __obj.asInstanceOf[repositionStatsObj]
  }
}

