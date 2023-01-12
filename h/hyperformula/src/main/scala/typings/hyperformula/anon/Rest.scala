package typings.hyperformula.anon

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rest[T] extends StObject {
  
  var rest: IterableIterator[T]
  
  var value: js.UndefOr[T] = js.undefined
}
object Rest {
  
  inline def apply[T](rest: IterableIterator[T]): Rest[T] = {
    val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rest[?], T] (val x: Self & Rest[T]) extends AnyVal {
    
    inline def setRest(value: IterableIterator[T]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
