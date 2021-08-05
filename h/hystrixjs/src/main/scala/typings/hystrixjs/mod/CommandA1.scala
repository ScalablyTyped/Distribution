package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA1[R, T] extends StObject {
  
  def execute(t: T): js.Thenable[R]
}
object CommandA1 {
  
  inline def apply[R, T](execute: T => js.Thenable[R]): CommandA1[R, T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[CommandA1[R, T]]
  }
  
  extension [Self <: CommandA1[?, ?], R, T](x: Self & (CommandA1[R, T])) {
    
    inline def setExecute(value: T => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
