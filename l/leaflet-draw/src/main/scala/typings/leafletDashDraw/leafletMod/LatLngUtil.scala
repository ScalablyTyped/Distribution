package typings.leafletDashDraw.leafletMod

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LatLngUtil")
@js.native
object LatLngUtil extends js.Object {
  /**
    * Clone the latLng and return a new LatLng object.
    */
  def cloneLatLng(latlng: LatLng): LatLng = js.native
  /**
    * Clone the latLng point or points or nested points and return an array with those points
    */
  def cloneLatLngs(latlngs: js.Array[LatLng]): js.Array[js.Array[LatLng]] = js.native
}

