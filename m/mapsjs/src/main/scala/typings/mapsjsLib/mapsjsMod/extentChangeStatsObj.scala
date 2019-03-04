package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait extentChangeStatsObj extends js.Object {
  var centerLat: scala.Double
  var centerLon: scala.Double
  var centerX: scala.Double
  var centerY: scala.Double
  var extents: envelope
  var mapScale: scala.Double
  var mapScaleProjected: scala.Double
  var mapUnitsPerPixel: scala.Double
  var zoomLevel: scala.Double
}

object extentChangeStatsObj {
  @scala.inline
  def apply(
    centerLat: scala.Double,
    centerLon: scala.Double,
    centerX: scala.Double,
    centerY: scala.Double,
    extents: envelope,
    mapScale: scala.Double,
    mapScaleProjected: scala.Double,
    mapUnitsPerPixel: scala.Double,
    zoomLevel: scala.Double
  ): extentChangeStatsObj = {
    val __obj = js.Dynamic.literal(centerLat = centerLat, centerLon = centerLon, centerX = centerX, centerY = centerY, extents = extents, mapScale = mapScale, mapScaleProjected = mapScaleProjected, mapUnitsPerPixel = mapUnitsPerPixel, zoomLevel = zoomLevel)
  
    __obj.asInstanceOf[extentChangeStatsObj]
  }
}

