package typings.mapsjs.mod

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
    val __obj = js.Dynamic.literal(centerLat = centerLat.asInstanceOf[js.Any], centerLon = centerLon.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], mapScale = mapScale.asInstanceOf[js.Any], mapScaleProjected = mapScaleProjected.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[extentChangeStatsObj]
  }
}

