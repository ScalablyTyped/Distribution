package typings
package knockoutDashPagingLib

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
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      scala.Unit
    ]
  ] = js.undefined
}

object KnockoutBindingHandler {
  @scala.inline
  def apply(
    init: js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      scala.Unit | Anon_ControlsDescendantBindings
    ] = null,
    options: js.Any = null,
    preprocess: js.Function3[
      /* value */ java.lang.String, 
      /* name */ java.lang.String, 
      /* addBindingCallback */ js.UndefOr[
        js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
      ], 
      java.lang.String
    ] = null,
    update: js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      scala.Unit
    ] = null
  ): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init)
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
}

