package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA0[R] extends StObject {
  
  def execute[R](): js.Thenable[R]
}
object CommandA0 {
  
  inline def apply[R](execute: () => js.Thenable[js.Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[CommandA0[R]]
  }
  
  extension [Self <: CommandA0[?], R](x: Self & CommandA0[R]) {
    
    inline def setExecute(value: () => js.Thenable[js.Any]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
