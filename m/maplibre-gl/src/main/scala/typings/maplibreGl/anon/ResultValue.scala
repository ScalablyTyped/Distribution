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
  
  extension [Self <: ResultValue[?], E](x: Self & ResultValue[E]) {
    
    inline def setResult(value: error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
