package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: City
  
  var position: js.Array[Double]
}
object Address {
  
  inline def apply(address: City, position: js.Array[Double]): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: City): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
