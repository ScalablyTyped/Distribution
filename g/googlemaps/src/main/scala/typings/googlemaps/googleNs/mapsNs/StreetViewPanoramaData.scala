package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPanoramaData extends js.Object {
  var copyright: js.UndefOr[String] = js.undefined
  var imageDate: js.UndefOr[String] = js.undefined
  var links: js.UndefOr[js.Array[StreetViewLink]] = js.undefined
  var location: js.UndefOr[StreetViewLocation] = js.undefined
  var tiles: js.UndefOr[StreetViewTileData] = js.undefined
}

object StreetViewPanoramaData {
  @scala.inline
  def apply(
    copyright: String = null,
    imageDate: String = null,
    links: js.Array[StreetViewLink] = null,
    location: StreetViewLocation = null,
    tiles: StreetViewTileData = null
  ): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (imageDate != null) __obj.updateDynamic("imageDate")(imageDate)
    if (links != null) __obj.updateDynamic("links")(links)
    if (location != null) __obj.updateDynamic("location")(location)
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
}

