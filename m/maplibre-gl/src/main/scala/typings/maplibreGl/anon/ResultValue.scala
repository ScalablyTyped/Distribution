package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultValue[E]
  extends StObject
     with typings.maplibreGl.distStyleSpecMod.Result[Any, E] {
  
  var result: error
  
  var value: E
}
object ResultValue {
  
  inline def apply[E](value: E): ResultValue[E] = {
    val __obj = js.Dynamic.literal(result = "error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultValue[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultValue[?], E] (val x: Self & ResultValue[E]) extends AnyVal {
    
    inline def setResult(value: error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
