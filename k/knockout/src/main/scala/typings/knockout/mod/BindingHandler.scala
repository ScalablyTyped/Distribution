package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingHandler[T] extends StObject {
  
  var after: js.UndefOr[js.Array[String]] = js.undefined
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[T], 
      /* allBindings */ AllBindings, 
      /* viewModel */ Any, 
      /* bindingContext */ BindingContext[Any], 
      Unit | BindingHandlerControlsDescendant
    ]
  ] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[String], 
      /* name */ String, 
      /* addBinding */ BindingHandlerAddBinding, 
      js.UndefOr[String | Unit]
    ]
  ] = js.undefined
  
  var update: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[T], 
      /* allBindings */ AllBindings, 
      /* viewModel */ Any, 
      /* bindingContext */ BindingContext[Any], 
      Unit
    ]
  ] = js.undefined
}
object BindingHandler {
  
  inline def apply[T](): BindingHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingHandler[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingHandler[?], T] (val x: Self & BindingHandler[T]) extends AnyVal {
    
    inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setInit(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ Any, /* bindingContext */ BindingContext[Any]) => Unit | BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPreprocess(
      value: (/* value */ js.UndefOr[String], /* name */ String, /* addBinding */ BindingHandlerAddBinding) => js.UndefOr[String | Unit]
    ): Self = StObject.set(x, "preprocess", js.Any.fromFunction3(value))
    
    inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
    
    inline def setUpdate(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[T], /* allBindings */ AllBindings, /* viewModel */ Any, /* bindingContext */ BindingContext[Any]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
