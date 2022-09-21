package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  def execute(args: Any*): js.Thenable[Any]
}
object Command {
  
  inline def apply(execute: /* repeated */ Any => js.Thenable[Any]): Command = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setExecute(value: /* repeated */ Any => js.Thenable[Any]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
