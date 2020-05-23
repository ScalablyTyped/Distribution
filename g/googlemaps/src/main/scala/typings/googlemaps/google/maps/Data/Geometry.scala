package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit
  def getType(): String
}

object Geometry {
  @scala.inline
  def apply(forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[Geometry]
  }
}

