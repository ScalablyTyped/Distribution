package typings.googlemaps.googleNs.mapsNs.geometryNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.MVCArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.geometry.encoding")
@js.native
class encoding () extends js.Object

/* static members */
@JSGlobal("google.maps.geometry.encoding")
@js.native
object encoding extends js.Object {
  def decodePath(encodedPath: String): js.Array[LatLng] = js.native
  def encodePath(path: js.Array[LatLng]): String = js.native
  def encodePath(path: MVCArray[LatLng]): String = js.native
}

