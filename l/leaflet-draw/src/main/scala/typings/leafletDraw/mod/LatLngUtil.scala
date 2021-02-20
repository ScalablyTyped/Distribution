package typings.leafletDraw.mod

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LatLngUtil {
  
  /**
    * Clone the latLng and return a new LatLng object.
    */
  @JSImport("leaflet", "LatLngUtil.cloneLatLng")
  @js.native
  def cloneLatLng(latlng: LatLng_): LatLng_ = js.native
  
  /**
    * Clone the latLng point or points or nested points and return an array with those points
    */
  @JSImport("leaflet", "LatLngUtil.cloneLatLngs")
  @js.native
  def cloneLatLngs(latlngs: js.Array[LatLng_]): js.Array[js.Array[LatLng_]] = js.native
}
