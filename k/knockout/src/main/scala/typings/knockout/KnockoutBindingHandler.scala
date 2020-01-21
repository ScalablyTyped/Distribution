package typings.knockout

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandler[E /* <: Node */, V, VM]
  extends /* s */ StringDictionary[js.Any] {
  var after: js.UndefOr[js.Array[String]] = js.undefined
  var init: js.UndefOr[
    js.Function5[
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      Unit | AnonControlsDescendantBindings
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
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      Unit
    ]
  ] = js.undefined
}

object KnockoutBindingHandler {
  @scala.inline
  def apply[E /* <: Node */, V, VM](
    StringDictionary: /* s */ StringDictionary[js.Any] = null,
    after: js.Array[String] = null,
    init: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => Unit | AnonControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String = null,
    update: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => Unit = null
  ): KnockoutBindingHandler[E, V, VM] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[KnockoutBindingHandler[E, V, VM]]
  }
}

