package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA4[R, T, U, V, W] extends StObject {
  
  def execute(t: T, u: U, v: V, w: W): PromiseLike[R]
}
object CommandA4 {
  
  inline def apply[R, T, U, V, W](execute: (T, U, V, W) => PromiseLike[R]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute))
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandA4[?, ?, ?, ?, ?], R, T, U, V, W] (val x: Self & (CommandA4[R, T, U, V, W])) extends AnyVal {
    
    inline def setExecute(value: (T, U, V, W) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
  }
}
