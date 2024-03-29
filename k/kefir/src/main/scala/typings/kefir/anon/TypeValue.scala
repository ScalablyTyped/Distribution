package typings.kefir.anon

import typings.kefir.kefirStrings.error
import typings.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue[E]
  extends StObject
     with Event[Any, E] {
  
  var `type`: error
  
  var value: E
}
object TypeValue {
  
  inline def apply[E](value: E): TypeValue[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[TypeValue[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeValue[?], E] (val x: Self & TypeValue[E]) extends AnyVal {
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
