package typings.knockoutSecureBinding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSecureBindingOptions extends StObject {
  
  var attribute: js.UndefOr[String] = js.native
  
  var bindings: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ js.Any
  ] = js.native
  
  var globals: js.UndefOr[js.Any] = js.native
  
  var noVirtualElements: js.UndefOr[Boolean] = js.native
}
object KnockoutSecureBindingOptions {
  
  @scala.inline
  def apply(): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
  
  @scala.inline
  implicit class KnockoutSecureBindingOptionsMutableBuilder[Self <: KnockoutSecureBindingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setBindings(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ js.Any
    ): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setGlobals(value: js.Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setNoVirtualElements(value: Boolean): Self = StObject.set(x, "noVirtualElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoVirtualElementsUndefined: Self = StObject.set(x, "noVirtualElements", js.undefined)
  }
}
