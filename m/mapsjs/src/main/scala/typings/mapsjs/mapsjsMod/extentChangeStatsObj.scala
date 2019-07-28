package typings.mapsjs.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait extentChangeStatsObj extends js.Object {
  var centerLat: Double
  var centerLon: Double
  var centerX: Double
  var centerY: Double
  var extents: envelope
  var mapScale: Double
  var mapScaleProjected: Double
  var mapUnitsPerPixel: Double
  var zoomLevel: Double
}

object extentChangeStatsObj {
  @scala.inline
  def apply(
    centerLat: Double,
    centerLon: Double,
    centerX: Double,
    centerY: Double,
    extents: envelope,
    mapScale: Double,
    mapScaleProjected: Double,
    mapUnitsPerPixel: Double,
    zoomLevel: Double
  ): extentChangeStatsObj = {
    val __obj = js.Dynamic.literal(centerLat = centerLat, centerLon = centerLon, centerX = centerX, centerY = centerY, extents = extents, mapScale = mapScale, mapScaleProjected = mapScaleProjected, mapUnitsPerPixel = mapUnitsPerPixel, zoomLevel = zoomLevel)
  
    __obj.asInstanceOf[extentChangeStatsObj]
  }
}

