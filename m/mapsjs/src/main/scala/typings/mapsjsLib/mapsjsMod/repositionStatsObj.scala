package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait repositionStatsObj extends js.Object {
  var centerX: scala.Double
  var centerY: scala.Double
  var mapUnitsPerPixel: scala.Double
  var zoomLevel: scala.Double
}

object repositionStatsObj {
  @scala.inline
  def apply(
    centerX: scala.Double,
    centerY: scala.Double,
    mapUnitsPerPixel: scala.Double,
    zoomLevel: scala.Double
  ): repositionStatsObj = {
    val __obj = js.Dynamic.literal(centerX = centerX, centerY = centerY, mapUnitsPerPixel = mapUnitsPerPixel, zoomLevel = zoomLevel)
  
    __obj.asInstanceOf[repositionStatsObj]
  }
}

