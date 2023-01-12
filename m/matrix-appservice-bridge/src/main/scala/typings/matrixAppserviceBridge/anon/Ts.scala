package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ts[T] extends StObject {
  
  var content: T
  
  var ts: Double
}
object Ts {
  
  inline def apply[T](content: T, ts: Double): Ts[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ts[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ts[?], T] (val x: Self & Ts[T]) extends AnyVal {
    
    inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
