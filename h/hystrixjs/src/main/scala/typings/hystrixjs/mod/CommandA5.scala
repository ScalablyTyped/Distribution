package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA5[R, T, U, V, W, X] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X): js.Thenable[R]
}
object CommandA5 {
  
  @scala.inline
  def apply[R, T, U, V, W, X](execute: (T, U, V, W, X) => js.Thenable[R]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction5(execute))
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
  
  @scala.inline
  implicit class CommandA5MutableBuilder[Self <: CommandA5[?, ?, ?, ?, ?, ?], R, T, U, V, W, X] (val x: Self & (CommandA5[R, T, U, V, W, X])) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (T, U, V, W, X) => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction5(value))
  }
}
