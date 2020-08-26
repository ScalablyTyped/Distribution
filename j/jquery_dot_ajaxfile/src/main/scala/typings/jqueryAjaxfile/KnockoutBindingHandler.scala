package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.anon.ControlsDescendantBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandler extends js.Object {
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | ControlsDescendantBindings
    ]
  ] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.native
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.native
}

object KnockoutBindingHandler {
  @scala.inline
  def apply(): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
  @scala.inline
  implicit class KnockoutBindingHandlerOps[Self <: KnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | ControlsDescendantBindings
    ): Self = this.set("init", js.Any.fromFunction5(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self = this.set("preprocess", js.Any.fromFunction3(value))
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit
    ): Self = this.set("update", js.Any.fromFunction5(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

