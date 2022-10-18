package typings.kefir.anon

import typings.kefir.kefirStrings.end
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue
  extends StObject
     with Event[Any, Any] {
  
  var `type`: end
  
  var value: Unit
}
object TypeValue {
  
  inline def apply(value: Unit): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
