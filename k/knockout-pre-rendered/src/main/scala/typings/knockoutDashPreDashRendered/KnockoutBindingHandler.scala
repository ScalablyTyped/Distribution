package typings.knockoutDashPreDashRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandler extends js.Object {
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | Anon_ControlsDescendantBindings
    ]
  ] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.undefined
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.undefined
}

object KnockoutBindingHandler {
  @scala.inline
  def apply(
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | Anon_ControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String = null,
    update: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit = null
  ): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
}

