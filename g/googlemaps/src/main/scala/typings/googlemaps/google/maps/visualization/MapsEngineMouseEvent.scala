package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapsEngineMouseEvent extends js.Object {
  var featureId: js.UndefOr[String] = js.undefined
  var infoWindowHtml: js.UndefOr[String] = js.undefined
  var latLng: js.UndefOr[LatLng] = js.undefined
  var pixelOffset: js.UndefOr[Size] = js.undefined
}

object MapsEngineMouseEvent {
  @scala.inline
  def apply(
    featureId: String = null,
    infoWindowHtml: String = null,
    latLng: LatLng = null,
    pixelOffset: Size = null
  ): MapsEngineMouseEvent = {
    val __obj = js.Dynamic.literal()
    if (featureId != null) __obj.updateDynamic("featureId")(featureId.asInstanceOf[js.Any])
    if (infoWindowHtml != null) __obj.updateDynamic("infoWindowHtml")(infoWindowHtml.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEngineMouseEvent]
  }
}

