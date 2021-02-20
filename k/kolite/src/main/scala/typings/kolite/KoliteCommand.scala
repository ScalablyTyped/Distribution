package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Command /////////////////////////////////////////////
@js.native
trait KoliteCommand extends StObject {
  
  var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  
  def execute(args: js.Any*): js.Any = js.native
}
object KoliteCommand {
  
  @scala.inline
  def apply(
    canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    execute: /* repeated */ js.Any => js.Any
  ): KoliteCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoliteCommand]
  }
  
  @scala.inline
  implicit class KoliteCommandMutableBuilder[Self <: KoliteCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanExecute(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
