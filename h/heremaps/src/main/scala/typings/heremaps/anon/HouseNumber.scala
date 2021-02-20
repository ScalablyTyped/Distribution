package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HouseNumber extends StObject {
  
  var City: Double = js.native
  
  var HouseNumber: Double = js.native
  
  var Street: js.Array[Double] = js.native
}
object HouseNumber {
  
  @scala.inline
  def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): HouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[HouseNumber]
  }
  
  @scala.inline
  implicit class HouseNumberMutableBuilder[Self <: HouseNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: Double): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouseNumber(value: Double): Self = StObject.set(x, "HouseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: js.Array[Double]): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetVarargs(value: Double*): Self = StObject.set(x, "Street", js.Array(value :_*))
  }
}
