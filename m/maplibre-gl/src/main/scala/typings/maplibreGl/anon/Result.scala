package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result[T]
  extends StObject
     with typings.maplibreGl.distStyleSpecMod.Result[T, Any] {
  
  var result: success
  
  var value: T
}
object Result {
  
  inline def apply[T](value: T): Result[T] = {
    val __obj = js.Dynamic.literal(result = "success", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
  
  extension [Self <: Result[?], T](x: Self & Result[T]) {
    
    inline def setResult(value: success): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
