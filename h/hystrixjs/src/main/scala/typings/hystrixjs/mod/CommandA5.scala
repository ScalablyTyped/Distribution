package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA5[R, T, U, V, W, X] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X): PromiseLike[R]
}
object CommandA5 {
  
  inline def apply[R, T, U, V, W, X](execute: (T, U, V, W, X) => PromiseLike[R]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction5(execute))
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
  
  extension [Self <: CommandA5[?, ?, ?, ?, ?, ?], R, T, U, V, W, X](x: Self & (CommandA5[R, T, U, V, W, X])) {
    
    inline def setExecute(value: (T, U, V, W, X) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction5(value))
  }
}
