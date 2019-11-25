package typings.knockstrap

import typings.knockout.KnockoutAllBindingsAccessor
import typings.knockout.KnockoutBindingContext
import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapModalDefaults
  @JSName("init")
  var init_ModalKnockoutBindingHandler: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ js.Any, 
      /* bindingContext */ KnockoutBindingContext, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}

object ModalKnockoutBindingHandler {
  @scala.inline
  def apply(
    defaults: KnockstrapModalDefaults,
    after: js.Array[String] = null,
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ js.Any, /* bindingContext */ KnockoutBindingContext) => KnockoutControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String = null,
    update: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ KnockoutBindingContext) => Unit = null
  ): ModalKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[ModalKnockoutBindingHandler]
  }
}

