package typings.googlemaps.googleNs.mapsNs.visualizationNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.Size
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
    if (featureId != null) __obj.updateDynamic("featureId")(featureId)
    if (infoWindowHtml != null) __obj.updateDynamic("infoWindowHtml")(infoWindowHtml)
    if (latLng != null) __obj.updateDynamic("latLng")(latLng)
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset)
    __obj.asInstanceOf[MapsEngineMouseEvent]
  }
}

