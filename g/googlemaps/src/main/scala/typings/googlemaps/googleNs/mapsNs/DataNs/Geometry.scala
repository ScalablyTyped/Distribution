package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Geometry")
@js.native
class Geometry () extends js.Object {
  def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit = js.native
  def getType(): String = js.native
}

