package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModalKnockoutBindingHandler
  extends knockoutLib.KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapModalDefaults
  @JSName("init")
  var init_ModalKnockoutBindingHandler: js.UndefOr[
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

