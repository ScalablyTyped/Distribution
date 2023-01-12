package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KoliteAsyncCommand
  extends StObject
     with KoliteCommand {
  
  var isExecuting: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object KoliteAsyncCommand {
  
  inline def apply(
    canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any,
    execute: /* repeated */ Any => Any,
    isExecuting: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): KoliteAsyncCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoliteAsyncCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KoliteAsyncCommand] (val x: Self) extends AnyVal {
    
    inline def setIsExecuting(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isExecuting", value.asInstanceOf[js.Any])
  }
}
