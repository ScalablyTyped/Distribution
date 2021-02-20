package typings.koPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//
// declare new binding handlers in ko.plus
//
@js.native
trait KnockoutBindingHandlers extends StObject {
  
  var command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  
  var loadingWhen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  
  var sortBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
}
object KnockoutBindingHandlers {
  
  @scala.inline
  def apply(
    command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    loadingWhen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    sortBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], loadingWhen = loadingWhen.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  @scala.inline
  implicit class KnockoutBindingHandlersMutableBuilder[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingWhen(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "loadingWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
  }
}
