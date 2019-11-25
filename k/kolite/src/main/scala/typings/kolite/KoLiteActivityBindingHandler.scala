package typings.kolite

import typings.knockout.Anon_ControlsDescendantBindings
import typings.knockout.KnockoutAllBindingsAccessor
import typings.knockout.KnockoutBindingContext
import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteActivityBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaultOptions: KoLiteActivityDefaultOptions
}

object KoLiteActivityBindingHandler {
  @scala.inline
  def apply(
    defaultOptions: KoLiteActivityDefaultOptions,
    after: js.Array[String] = null,
    init: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ KnockoutBindingContext) => Unit | Anon_ControlsDescendantBindings = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String = null,
    update: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ KnockoutBindingContext) => Unit = null
  ): KoLiteActivityBindingHandler = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5(init))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3(preprocess))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5(update))
    __obj.asInstanceOf[KoLiteActivityBindingHandler]
  }
}

