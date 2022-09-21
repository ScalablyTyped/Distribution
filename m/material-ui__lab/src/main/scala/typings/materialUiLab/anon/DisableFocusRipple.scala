package typings.materialUiLab.anon

import typings.materialUiLab.materialUiLabStrings.large
import typings.materialUiLab.materialUiLabStrings.medium
import typings.materialUiLab.materialUiLabStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFocusRipple extends StObject {
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[small | medium | large] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object DisableFocusRipple {
  
  inline def apply(): DisableFocusRipple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFocusRipple]
  }
  
  extension [Self <: DisableFocusRipple](x: Self) {
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
