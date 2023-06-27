package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result[T]
  extends StObject
     with typings.maplibreMaplibreGlStyleSpec.mod.Result[T, Any] {
  
  var result: success
  
  var value: T
}
object Result {
  
  inline def apply[T](value: T): Result[T] = {
    val __obj = js.Dynamic.literal(result = "success", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result[?], T] (val x: Self & Result[T]) extends AnyVal {
    
    inline def setResult(value: success): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
