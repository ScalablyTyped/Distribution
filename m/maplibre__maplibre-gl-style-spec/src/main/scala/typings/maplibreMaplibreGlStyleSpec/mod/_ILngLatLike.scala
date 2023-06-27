package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ILngLatLike extends StObject
object _ILngLatLike {
  
  inline def ILngLat(
    convert: ILngLatLike => typings.maplibreMaplibreGlStyleSpec.mod.ILngLat,
    distanceTo: typings.maplibreMaplibreGlStyleSpec.mod.ILngLat => js.Object,
    toArray: () => js.Object,
    wrap: () => js.Object
  ): typings.maplibreMaplibreGlStyleSpec.mod.ILngLat = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), distanceTo = js.Any.fromFunction1(distanceTo), toArray = js.Any.fromFunction0(toArray), wrap = js.Any.fromFunction0(wrap))
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.ILngLat]
  }
  
  inline def Lat(lat: Double, lng: Double): typings.maplibreMaplibreGlStyleSpec.anon.Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Lat]
  }
  
  inline def Lon(lat: Double, lon: Double): typings.maplibreMaplibreGlStyleSpec.anon.Lon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Lon]
  }
}
