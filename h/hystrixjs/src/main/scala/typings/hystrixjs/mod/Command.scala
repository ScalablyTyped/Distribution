package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  def execute(args: Any*): PromiseLike[Any]
}
object Command {
  
  inline def apply(execute: /* repeated */ Any => PromiseLike[Any]): Command = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: /* repeated */ Any => PromiseLike[Any]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
