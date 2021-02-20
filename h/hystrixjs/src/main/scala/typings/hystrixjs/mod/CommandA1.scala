package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA1[R, T] extends StObject {
  
  def execute(t: T): js.Thenable[R] = js.native
}
object CommandA1 {
  
  @scala.inline
  def apply[R, T](execute: T => js.Thenable[R]): CommandA1[R, T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[CommandA1[R, T]]
  }
  
  @scala.inline
  implicit class CommandA1MutableBuilder[Self <: CommandA1[_, _], R, T] (val x: Self with (CommandA1[R, T])) extends AnyVal {
    
    @scala.inline
    def setExecute(value: T => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
