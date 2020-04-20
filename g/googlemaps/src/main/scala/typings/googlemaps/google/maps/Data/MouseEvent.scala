package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-unnecessary-qualifier
trait MouseEvent
  extends typings.googlemaps.google.maps.MouseEvent {
  var feature: Feature
}

object MouseEvent {
  @scala.inline
  def apply(feature: Feature, latLng: LatLng, stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MouseEvent]
  }
}

