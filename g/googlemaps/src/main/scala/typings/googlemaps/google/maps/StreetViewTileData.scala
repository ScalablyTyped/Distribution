package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  var worldSize: js.UndefOr[Size] = js.undefined
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String
}

object StreetViewTileData {
  @scala.inline
  def apply(
    getTileUrl: (String, Double, Double, Double) => String,
    centerHeading: js.UndefOr[Double] = js.undefined,
    tileSize: Size = null,
    worldSize: Size = null
  ): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction4(getTileUrl))
    if (!js.isUndefined(centerHeading)) __obj.updateDynamic("centerHeading")(centerHeading.get.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (worldSize != null) __obj.updateDynamic("worldSize")(worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewTileData]
  }
}

