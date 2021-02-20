package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingHandler[T] extends StObject {
  
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
  implicit class BindingHandlerMutableBuilder[Self <: BindingHandler[_], T] (val x: Self with BindingHandler[T]) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ js.Any, /* bindingContext */ BindingContext[_]) => Unit | BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPreprocess(
      value: (/* value */ js.UndefOr[String], /* name */ String, /* addBinding */ BindingHandlerAddBinding) => js.UndefOr[String | Unit]
    ): Self = StObject.set(x, "preprocess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ js.Any, /* bindingContext */ BindingContext[_]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
