package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA6[R, T, U, V, W, X, Y] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R] = js.native
}
object CommandA6 {
  
  @scala.inline
  def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => js.Thenable[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
  
  @scala.inline
  implicit class CommandA6MutableBuilder[Self <: CommandA6[_, _, _, _, _, _, _], R, T, U, V, W, X, Y] (val x: Self with (CommandA6[R, T, U, V, W, X, Y])) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (T, U, V, W, X, Y) => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction6(value))
  }
}
