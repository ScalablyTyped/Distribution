package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA2[R, T, U] extends StObject {
  
  def execute(t: T, u: U): PromiseLike[R]
}
object CommandA2 {
  
  inline def apply[R, T, U](execute: (T, U) => PromiseLike[R]): CommandA2[R, T, U] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute))
    __obj.asInstanceOf[CommandA2[R, T, U]]
  }
  
  extension [Self <: CommandA2[?, ?, ?], R, T, U](x: Self & (CommandA2[R, T, U])) {
    
    inline def setExecute(value: (T, U) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
  }
}
