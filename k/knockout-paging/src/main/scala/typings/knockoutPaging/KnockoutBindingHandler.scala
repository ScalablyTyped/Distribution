package typings.knockoutPaging

import typings.knockoutPaging.anon.ControlsDescendantBindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutBindingHandler extends StObject {
  
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
  implicit class KnockoutBindingHandlerMutableBuilder[Self <: KnockoutBindingHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | ControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self = StObject.set(x, "preprocess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
