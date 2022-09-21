package typings.kefir.anon

import typings.kefir.kefirStrings.value
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[V]
  extends StObject
     with Event[V, Any] {
  
  var `type`: value
  
  var value: V
}
object Type {
  
  inline def apply[V](value: V): Type[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[Type[V]]
  }
  
  extension [Self <: Type[?], V](x: Self & Type[V]) {
    
    inline def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
