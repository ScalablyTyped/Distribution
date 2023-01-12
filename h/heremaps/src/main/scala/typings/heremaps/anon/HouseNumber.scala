package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HouseNumber extends StObject {
  
  var City: Double
  
  var HouseNumber: Double
  
  var Street: js.Array[Double]
}
object HouseNumber {
  
  inline def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): HouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[HouseNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HouseNumber] (val x: Self) extends AnyVal {
    
    inline def setCity(value: Double): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setHouseNumber(value: Double): Self = StObject.set(x, "HouseNumber", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: js.Array[Double]): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
    
    inline def setStreetVarargs(value: Double*): Self = StObject.set(x, "Street", js.Array(value*))
  }
}
