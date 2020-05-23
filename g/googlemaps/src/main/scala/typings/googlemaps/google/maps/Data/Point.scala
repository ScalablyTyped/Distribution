package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends Geometry {
  def get(): LatLng
}

object Point {
  @scala.inline
  def apply(
    forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
    get: () => LatLng,
    getType: () => String
  ): Point = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), get = js.Any.fromFunction0(get), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[Point]
  }
}

