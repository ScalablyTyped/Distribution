package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoLiteCommandOptions extends StObject {
  
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ Boolean, _]] = js.native
  
  def execute(args: js.Any*): js.Any = js.native
}
object KoLiteCommandOptions {
  
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
  
  @scala.inline
  implicit class KoLiteCommandOptionsMutableBuilder[Self <: KoLiteCommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanExecute(value: /* isExecuting */ Boolean => _): Self = StObject.set(x, "canExecute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
    
    @scala.inline
    def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
