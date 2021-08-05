package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KoLiteCommandOptions extends StObject {
  
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ Boolean, js.Any]] = js.undefined
  
  def execute(args: js.Any*): js.Any
}
object KoLiteCommandOptions {
  
  inline def apply(execute: /* repeated */ js.Any => js.Any): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
  
  extension [Self <: KoLiteCommandOptions](x: Self) {
    
    inline def setCanExecute(value: /* isExecuting */ Boolean => js.Any): Self = StObject.set(x, "canExecute", js.Any.fromFunction1(value))
    
    inline def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
    
    inline def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
