package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteActivityBindingHandler
  extends knockoutLib.KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaultOptions: KoLiteActivityDefaultOptions
}

object KoLiteActivityBindingHandler {
  @scala.inline
  def apply(
    defaultOptions: KoLiteActivityDefaultOptions,
    after: js.Array[java.lang.String] = null,
    init: js.Function5[
      js.Any, 
      /* valueAccessor */ js.Function0[js.Any], 
      /* allBindingsAccessor */ knockoutLib.KnockoutAllBindingsAccessor, 
      js.Any, 
      /* bindingContext */ knockoutLib.KnockoutBindingContext, 
      scala.Unit | knockoutLib.Anon_ControlsDescendantBindings
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
      js.Any, 
      /* valueAccessor */ js.Function0[js.Any], 
      /* allBindingsAccessor */ knockoutLib.KnockoutAllBindingsAccessor, 
      js.Any, 
      /* bindingContext */ knockoutLib.KnockoutBindingContext, 
      scala.Unit
    ] = null
  ): KoLiteActivityBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (after != null) __obj.updateDynamic("after")(after)
    if (init != null) __obj.updateDynamic("init")(init)
    if (options != null) __obj.updateDynamic("options")(options)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[KoLiteActivityBindingHandler]
  }
}

