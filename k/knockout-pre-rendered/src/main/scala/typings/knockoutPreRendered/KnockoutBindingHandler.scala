package typings.knockoutPreRendered

import typings.knockoutPreRendered.anon.ControlsDescendantBindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingHandler extends StObject {
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | ControlsDescendantBindings
    ]
  ] = js.undefined
  
  var options: js.UndefOr[js.Any] = js.undefined
  
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.undefined
  
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.undefined
}
object KnockoutBindingHandler {
  
  inline def apply(): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
  
  extension [Self <: KnockoutBindingHandler](x: Self) {
    
    inline def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | ControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self = StObject.set(x, "preprocess", js.Any.fromFunction3(value))
    
    inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
    
    inline def setUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
