package typings.leafletDraw.mod

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "LatLngUtil")
@js.native
object LatLngUtil extends js.Object {
  
  /**
    * Clone the latLng and return a new LatLng object.
    */
  def cloneLatLng(latlng: LatLng_): LatLng_ = js.native
  
  /**
    * Clone the latLng point or points or nested points and return an array with those points
    */
  def cloneLatLngs(latlngs: js.Array[LatLng_]): js.Array[js.Array[LatLng_]] = js.native
}
