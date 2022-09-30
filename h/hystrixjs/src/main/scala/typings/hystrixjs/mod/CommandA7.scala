package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA7[R, T, U, V, W, X, Y, Z] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): PromiseLike[R]
}
object CommandA7 {
  
  inline def apply[R, T, U, V, W, X, Y, Z](execute: (T, U, V, W, X, Y, Z) => PromiseLike[R]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction7(execute))
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
  
  extension [Self <: CommandA7[?, ?, ?, ?, ?, ?, ?, ?], R, T, U, V, W, X, Y, Z](x: Self & (CommandA7[R, T, U, V, W, X, Y, Z])) {
    
    inline def setExecute(value: (T, U, V, W, X, Y, Z) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction7(value))
  }
}
