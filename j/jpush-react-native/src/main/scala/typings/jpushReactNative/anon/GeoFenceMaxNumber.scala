package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoFenceMaxNumber extends StObject {
  
  var geoFenceMaxNumber: Double
}
object GeoFenceMaxNumber {
  
  inline def apply(geoFenceMaxNumber: Double): GeoFenceMaxNumber = {
    val __obj = js.Dynamic.literal(geoFenceMaxNumber = geoFenceMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoFenceMaxNumber]
  }
  
  extension [Self <: GeoFenceMaxNumber](x: Self) {
    
    inline def setGeoFenceMaxNumber(value: Double): Self = StObject.set(x, "geoFenceMaxNumber", value.asInstanceOf[js.Any])
  }
}
