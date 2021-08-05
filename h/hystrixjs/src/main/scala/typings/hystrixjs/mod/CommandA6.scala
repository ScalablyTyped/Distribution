package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA6[R, T, U, V, W, X, Y] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R]
}
object CommandA6 {
  
  inline def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => js.Thenable[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
  
  extension [Self <: CommandA6[?, ?, ?, ?, ?, ?, ?], R, T, U, V, W, X, Y](x: Self & (CommandA6[R, T, U, V, W, X, Y])) {
    
    inline def setExecute(value: (T, U, V, W, X, Y) => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction6(value))
  }
}
