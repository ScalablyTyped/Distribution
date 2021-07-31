package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ trait AlertKnockoutBindingHandler extends StObject {
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, 
      /* viewModel */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}
object AlertKnockoutBindingHandler {
  
  @scala.inline
  def apply(): AlertKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertKnockoutBindingHandler]
  }
  
  @scala.inline
  implicit class AlertKnockoutBindingHandlerMutableBuilder[Self <: AlertKnockoutBindingHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, /* viewModel */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any) => KnockoutControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
