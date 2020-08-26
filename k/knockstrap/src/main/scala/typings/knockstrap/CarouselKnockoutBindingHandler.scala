package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ @js.native
trait CarouselKnockoutBindingHandler extends js.Object {
  var defaults: KnockstrapCarouselDefaults = js.native
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, 
      /* viewModel */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.native
}

object CarouselKnockoutBindingHandler {
  @scala.inline
  def apply(defaults: KnockstrapCarouselDefaults): CarouselKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselKnockoutBindingHandler]
  }
  @scala.inline
  implicit class CarouselKnockoutBindingHandlerOps[Self <: CarouselKnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaults(value: KnockstrapCarouselDefaults): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, /* viewModel */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any) => KnockoutControlsDescendantBindings
    ): Self = this.set("init", js.Any.fromFunction5(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
  
}

