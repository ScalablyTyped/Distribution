package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  var worldSize: js.UndefOr[Size] = js.undefined
  def getTileUrl(pano: java.lang.String, tileZoom: scala.Double, tileX: scala.Double, tileY: scala.Double): java.lang.String
}

object StreetViewTileData {
  @scala.inline
  def apply(
    getTileUrl: js.Function4[java.lang.String, scala.Double, scala.Double, scala.Double, java.lang.String],
    centerHeading: scala.Int | scala.Double = null,
    tileSize: Size = null,
    worldSize: Size = null
  ): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = getTileUrl)
    if (centerHeading != null) __obj.updateDynamic("centerHeading")(centerHeading.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    if (worldSize != null) __obj.updateDynamic("worldSize")(worldSize)
    __obj.asInstanceOf[StreetViewTileData]
  }
}

