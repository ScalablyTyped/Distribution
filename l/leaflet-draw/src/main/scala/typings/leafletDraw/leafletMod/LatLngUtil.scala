package typings.leafletDraw.leafletMod

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LatLngUtil {
  
  @JSImport("leaflet", "LatLngUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clone the latLng and return a new LatLng object.
    */
  inline def cloneLatLng(latlng: LatLng_): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneLatLng")(latlng.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
  
  /**
    * Clone the latLng point or points or nested points and return an array with those points
    */
  inline def cloneLatLngs(latlngs: js.Array[LatLng_]): js.Array[js.Array[LatLng_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneLatLngs")(latlngs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[LatLng_]]]
}
