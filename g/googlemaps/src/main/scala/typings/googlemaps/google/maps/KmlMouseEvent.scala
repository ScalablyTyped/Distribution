package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlMouseEvent extends js.Object {
  var featureData: KmlFeatureData
  var latLng: LatLng
  var pixelOffset: Size
}

object KmlMouseEvent {
  @scala.inline
  def apply(featureData: KmlFeatureData, latLng: LatLng, pixelOffset: Size): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(featureData = featureData.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], pixelOffset = pixelOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlMouseEvent]
  }
}

