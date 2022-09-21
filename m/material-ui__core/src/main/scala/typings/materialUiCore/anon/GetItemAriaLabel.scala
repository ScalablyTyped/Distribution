package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemAriaLabel extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var getItemAriaLabel: js.UndefOr[
    js.Function3[/* type */ String, /* page */ Double, /* selected */ Boolean, js.UndefOr[String]]
  ] = js.undefined
}
object GetItemAriaLabel {
  
  inline def apply(): GetItemAriaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemAriaLabel]
  }
  
  extension [Self <: GetItemAriaLabel](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setGetItemAriaLabel(value: (/* type */ String, /* page */ Double, /* selected */ Boolean) => js.UndefOr[String]): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction3(value))
    
    inline def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
  }
}
