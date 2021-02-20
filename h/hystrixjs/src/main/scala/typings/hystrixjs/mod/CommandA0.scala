package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA0[R] extends StObject {
  
  def execute[R](): js.Thenable[R] = js.native
}
object CommandA0 {
  
  @scala.inline
  def apply[R](execute: () => js.Thenable[js.Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[CommandA0[R]]
  }
  
  @scala.inline
  implicit class CommandA0MutableBuilder[Self <: CommandA0[_], R] (val x: Self with CommandA0[R]) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => js.Thenable[js.Any]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
