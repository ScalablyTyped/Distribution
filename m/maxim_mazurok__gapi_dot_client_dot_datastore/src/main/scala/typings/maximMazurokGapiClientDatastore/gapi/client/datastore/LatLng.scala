package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLng extends StObject {
  
  /** The latitude in degrees. It must be in the range [-90.0, +90.0]. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** The longitude in degrees. It must be in the range [-180.0, +180.0]. */
  var longitude: js.UndefOr[Double] = js.undefined
}
object LatLng {
  
  inline def apply(): LatLng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLng]
  }
  
  extension [Self <: LatLng](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
