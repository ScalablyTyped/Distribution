package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxZoomService extends js.Object {
  def getMaxZoomAtLatLng(latlng: LatLngLiteral, callback: js.Function1[/* result */ MaxZoomResult, Unit]): Unit = js.native
  def getMaxZoomAtLatLng(latlng: LatLng, callback: js.Function1[/* result */ MaxZoomResult, Unit]): Unit = js.native
}

