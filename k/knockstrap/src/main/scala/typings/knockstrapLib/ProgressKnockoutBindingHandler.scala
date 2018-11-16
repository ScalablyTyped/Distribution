package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressKnockoutBindingHandler
  extends knockoutLib.KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapProgressDefaults
  @JSName("init")
  var init_ProgressKnockoutBindingHandler: js.UndefOr[
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

