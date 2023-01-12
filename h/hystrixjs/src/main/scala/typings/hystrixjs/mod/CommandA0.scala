package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA0[R] extends StObject {
  
  def execute[R](): PromiseLike[R]
}
object CommandA0 {
  
  inline def apply[R](execute: () => PromiseLike[Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[CommandA0[R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandA0[?], R] (val x: Self & CommandA0[R]) extends AnyVal {
    
    inline def setExecute(value: () => PromiseLike[Any]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
