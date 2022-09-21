package typings.knockoutSecureBinding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutSecureBindingOptions extends StObject {
  
  var attribute: js.UndefOr[String] = js.undefined
  
  var bindings: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ Any
  ] = js.undefined
  
  var globals: js.UndefOr[Any] = js.undefined
  
  var noVirtualElements: js.UndefOr[Boolean] = js.undefined
}
object KnockoutSecureBindingOptions {
  
  inline def apply(): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
  
  extension [Self <: KnockoutSecureBindingOptions](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setBindings(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ Any
    ): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setGlobals(value: Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setNoVirtualElements(value: Boolean): Self = StObject.set(x, "noVirtualElements", value.asInstanceOf[js.Any])
    
    inline def setNoVirtualElementsUndefined: Self = StObject.set(x, "noVirtualElements", js.undefined)
  }
}
