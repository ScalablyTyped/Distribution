package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KoLiteCommandOptions extends StObject {
  
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ Boolean, Any]] = js.undefined
  
  def execute(args: Any*): Any
}
object KoLiteCommandOptions {
  
  inline def apply(execute: /* repeated */ Any => Any): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KoLiteCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setCanExecute(value: /* isExecuting */ Boolean => Any): Self = StObject.set(x, "canExecute", js.Any.fromFunction1(value))
    
    inline def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
    
    inline def setExecute(value: /* repeated */ Any => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
