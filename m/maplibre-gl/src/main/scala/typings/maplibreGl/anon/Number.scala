package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  var number: Any
}
object Number {
  
  inline def apply(number: Any): Number = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
