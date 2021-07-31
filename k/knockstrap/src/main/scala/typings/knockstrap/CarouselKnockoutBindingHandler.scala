package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ trait CarouselKnockoutBindingHandler extends StObject {
  
  var defaults: KnockstrapCarouselDefaults
  
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
object CarouselKnockoutBindingHandler {
  
  @scala.inline
  def apply(defaults: KnockstrapCarouselDefaults): CarouselKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselKnockoutBindingHandler]
  }
  
  @scala.inline
  implicit class CarouselKnockoutBindingHandlerMutableBuilder[Self <: CarouselKnockoutBindingHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: KnockstrapCarouselDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, /* viewModel */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any) => KnockoutControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
