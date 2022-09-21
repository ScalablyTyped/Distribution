package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ trait ModalKnockoutBindingHandler extends StObject {
  
  var defaults: KnockstrapModalDefaults
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ Any, 
      /* viewModel */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ Any, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}
object ModalKnockoutBindingHandler {
  
  inline def apply(defaults: KnockstrapModalDefaults): ModalKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalKnockoutBindingHandler]
  }
  
  extension [Self <: ModalKnockoutBindingHandler](x: Self) {
    
    inline def setDefaults(value: KnockstrapModalDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setInit(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ Any, /* viewModel */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ Any) => KnockoutControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
