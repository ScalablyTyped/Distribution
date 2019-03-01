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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("centerLat")(centerLat)
    __obj.updateDynamic("centerLon")(centerLon)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("extents")(extents)
    __obj.updateDynamic("mapScale")(mapScale)
    __obj.updateDynamic("mapScaleProjected")(mapScaleProjected)
    __obj.updateDynamic("mapUnitsPerPixel")(mapUnitsPerPixel)
    __obj.updateDynamic("zoomLevel")(zoomLevel)
    __obj.asInstanceOf[extentChangeStatsObj]
  }
}

