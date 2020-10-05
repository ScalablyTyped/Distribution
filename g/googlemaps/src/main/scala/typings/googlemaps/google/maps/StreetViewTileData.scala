package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Size] = js.native
  var worldSize: js.UndefOr[Size] = js.native
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String = js.native
}

object StreetViewTileData {
  @scala.inline
  def apply(getTileUrl: (String, Double, Double, Double) => String): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction4(getTileUrl))
    __obj.asInstanceOf[StreetViewTileData]
  }
  @scala.inline
  implicit class StreetViewTileDataOps[Self <: StreetViewTileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTileUrl(value: (String, Double, Double, Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction4(value))
    @scala.inline
    def setCenterHeading(value: Double): Self = this.set("centerHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterHeading: Self = this.set("centerHeading", js.undefined)
    @scala.inline
    def setTileSize(value: Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setWorldSize(value: Size): Self = this.set("worldSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldSize: Self = this.set("worldSize", js.undefined)
  }
  
}

