package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA6[R, T, U, V, W, X, Y] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): PromiseLike[R]
}
object CommandA6 {
  
  inline def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => PromiseLike[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandA6[?, ?, ?, ?, ?, ?, ?], R, T, U, V, W, X, Y] (val x: Self & (CommandA6[R, T, U, V, W, X, Y])) extends AnyVal {
    
    inline def setExecute(value: (T, U, V, W, X, Y) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction6(value))
  }
}
