package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandler[E /* <: stdLib.Node */, V, VM]
  extends /* s */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var after: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var init: js.UndefOr[
    js.Function5[
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      scala.Unit | Anon_ControlsDescendantBindings
    ]
  ] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* name */ java.lang.String, 
      /* addBindingCallback */ js.UndefOr[
        js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
      ], 
      java.lang.String
    ]
  ] = js.undefined
  var update: js.UndefOr[
    js.Function5[
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      scala.Unit
    ]
  ] = js.undefined
}

object KnockoutBindingHandler {
  @scala.inline
  def apply[E /* <: stdLib.Node */, V, VM](
    StringDictionary: /* s */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    after: js.Array[java.lang.String] = null,
    init: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => scala.Unit | Anon_ControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ java.lang.String, /* name */ java.lang.String, /* addBindingCallback */ js.UndefOr[
      js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
    ]) => java.lang.String = null,
    update: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => scala.Unit = null
  ): KnockoutBindingHandler[E, V, VM] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (after != null) __obj.updateDynamic("after")(after)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[KnockoutBindingHandler[E, V, VM]]
  }
}

