package typings.knockstrap

import typings.knockout.KnockoutAllBindingsAccessor
import typings.knockout.KnockoutBindingContext
import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  @JSName("init")
  var init_AlertKnockoutBindingHandler: js.UndefOr[
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

object AlertKnockoutBindingHandler {
  @scala.inline
  def apply(
    after: js.Array[String] = null,
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ js.Any, /* bindingContext */ KnockoutBindingContext) => KnockoutControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String = null,
    update: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ KnockoutBindingContext) => Unit = null
  ): AlertKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[AlertKnockoutBindingHandler]
  }
}

