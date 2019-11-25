package typings.googlemaps.google.maps

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
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (imageDate != null) __obj.updateDynamic("imageDate")(imageDate.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
}

