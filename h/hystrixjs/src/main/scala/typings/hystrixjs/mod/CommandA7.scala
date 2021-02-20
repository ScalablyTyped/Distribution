package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA7[R, T, U, V, W, X, Y, Z] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): js.Thenable[R] = js.native
}
object CommandA7 {
  
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](execute: (T, U, V, W, X, Y, Z) => js.Thenable[R]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction7(execute))
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
  
  @scala.inline
  implicit class CommandA7MutableBuilder[Self <: CommandA7[_, _, _, _, _, _, _, _], R, T, U, V, W, X, Y, Z] (val x: Self with (CommandA7[R, T, U, V, W, X, Y, Z])) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (T, U, V, W, X, Y, Z) => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction7(value))
  }
}
