package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Command /////////////////////////////////////////////
trait KoliteCommand extends StObject {
  
  var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
  
  def execute(args: Any*): Any
}
object KoliteCommand {
  
  inline def apply(
    canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any,
    execute: /* repeated */ Any => Any
  ): KoliteCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoliteCommand]
  }
  
  extension [Self <: KoliteCommand](x: Self) {
    
    inline def setCanExecute(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
    ): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: /* repeated */ Any => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
