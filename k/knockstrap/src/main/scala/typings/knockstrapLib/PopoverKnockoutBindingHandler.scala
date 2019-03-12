package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverKnockoutBindingHandler
  extends knockoutLib.KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  @JSName("init")
  var init_PopoverKnockoutBindingHandler: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ knockoutLib.KnockoutAllBindingsAccessor, 
      /* viewModel */ js.Any, 
      /* bindingContext */ knockoutLib.KnockoutBindingContext, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}

object PopoverKnockoutBindingHandler {
  @scala.inline
  def apply(
    after: js.Array[java.lang.String] = null,
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ knockoutLib.KnockoutAllBindingsAccessor, /* viewModel */ js.Any, /* bindingContext */ knockoutLib.KnockoutBindingContext) => KnockoutControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ java.lang.String, /* name */ java.lang.String, /* addBindingCallback */ js.UndefOr[
      js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
    ]) => java.lang.String = null,
    update: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ knockoutLib.KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ knockoutLib.KnockoutBindingContext) => scala.Unit = null
  ): PopoverKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[PopoverKnockoutBindingHandler]
  }
}

