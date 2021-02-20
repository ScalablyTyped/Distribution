package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoliteAsyncCommand extends KoliteCommand {
  
  var isExecuting: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
}
object KoliteAsyncCommand {
  
  @scala.inline
  def apply(
    canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    execute: /* repeated */ js.Any => js.Any,
    isExecuting: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ): KoliteAsyncCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoliteAsyncCommand]
  }
  
  @scala.inline
  implicit class KoliteAsyncCommandMutableBuilder[Self <: KoliteAsyncCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExecuting(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "isExecuting", value.asInstanceOf[js.Any])
  }
}
