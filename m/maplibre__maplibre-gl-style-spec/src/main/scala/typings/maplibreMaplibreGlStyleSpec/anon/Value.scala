package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[E]
  extends StObject
     with typings.maplibreMaplibreGlStyleSpec.mod.Result[Any, E] {
  
  var result: error
  
  var value: E
}
object Value {
  
  inline def apply[E](value: E): Value[E] = {
    val __obj = js.Dynamic.literal(result = "error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value[?], E] (val x: Self & Value[E]) extends AnyVal {
    
    inline def setResult(value: error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
