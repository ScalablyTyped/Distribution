package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewPanoramaData extends js.Object {
  var copyright: js.UndefOr[String] = js.native
  var imageDate: js.UndefOr[String] = js.native
  var links: js.UndefOr[js.Array[StreetViewLink]] = js.native
  var location: js.UndefOr[StreetViewLocation] = js.native
  var tiles: js.UndefOr[StreetViewTileData] = js.native
}

object StreetViewPanoramaData {
  @scala.inline
  def apply(): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
  @scala.inline
  implicit class StreetViewPanoramaDataOps[Self <: StreetViewPanoramaData] (val x: Self) extends AnyVal {
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
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setImageDate(value: String): Self = this.set("imageDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDate: Self = this.set("imageDate", js.undefined)
    @scala.inline
    def setLinksVarargs(value: StreetViewLink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[StreetViewLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setLocation(value: StreetViewLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setTiles(value: StreetViewTileData): Self = this.set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
  }
  
}

