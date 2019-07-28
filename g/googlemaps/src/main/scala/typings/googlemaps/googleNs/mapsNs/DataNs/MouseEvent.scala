package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent
  extends typings.googlemaps.googleNs.mapsNs.MouseEvent {
  var feature: Feature
}

object MouseEvent {
  @scala.inline
  def apply(feature: Feature, latLng: LatLng, stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(feature = feature, latLng = latLng, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[MouseEvent]
  }
}

