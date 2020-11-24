package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingHandler[T] extends js.Object {
  
  var after: js.UndefOr[js.Array[String]] = js.native
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[T], 
      /* allBindings */ AllBindings, 
      /* viewModel */ js.Any, 
      /* bindingContext */ BindingContext[_], 
      Unit | BindingHandlerControlsDescendant
    ]
  ] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[String], 
      /* name */ String, 
      /* addBinding */ BindingHandlerAddBinding, 
      js.UndefOr[String | Unit]
    ]
  ] = js.native
  
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[T], 
      /* allBindings */ AllBindings, 
      /* viewModel */ js.Any, 
      /* bindingContext */ BindingContext[_], 
      Unit
    ]
  ] = js.native
}
object BindingHandler {
  
  @scala.inline
  def apply[T](): BindingHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingHandler[T]]
  }
  
  @scala.inline
  implicit class BindingHandlerOps[Self <: BindingHandler[_], T] (val x: Self with BindingHandler[T]) extends AnyVal {
    
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ js.Any, /* bindingContext */ BindingContext[_]) => Unit | BindingHandlerControlsDescendant
    ): Self = this.set("init", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPreprocess(
      value: (/* value */ js.UndefOr[String], /* name */ String, /* addBinding */ BindingHandlerAddBinding) => js.UndefOr[String | Unit]
    ): Self = this.set("preprocess", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ js.Any, /* bindingContext */ BindingContext[_]) => Unit
    ): Self = this.set("update", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
