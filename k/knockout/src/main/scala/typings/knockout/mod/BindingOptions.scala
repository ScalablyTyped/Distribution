package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingOptions extends StObject {
  
  var bindingParams: js.UndefOr[Boolean] = js.undefined
  
  var valueAccessors: js.UndefOr[Boolean] = js.undefined
}
object BindingOptions {
  
  @scala.inline
  def apply(): BindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingOptions]
  }
  
  @scala.inline
  implicit class BindingOptionsMutableBuilder[Self <: BindingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingParams(value: Boolean): Self = StObject.set(x, "bindingParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingParamsUndefined: Self = StObject.set(x, "bindingParams", js.undefined)
    
    @scala.inline
    def setValueAccessors(value: Boolean): Self = StObject.set(x, "valueAccessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAccessorsUndefined: Self = StObject.set(x, "valueAccessors", js.undefined)
  }
}
