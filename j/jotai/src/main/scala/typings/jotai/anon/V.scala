package typings.jotai.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V[Value] extends StObject {
  
  var v: Value
}
object V {
  
  inline def apply[Value](v: Value): V[Value] = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V[?], Value] (val x: Self & V[Value]) extends AnyVal {
    
    inline def setV(value: Value): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
