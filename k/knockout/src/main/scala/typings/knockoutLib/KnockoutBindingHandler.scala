package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KnockoutBindingHandler[E /* <: stdLib.Node */, V, VM]
  extends /* s */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

