package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSHAKEOptionsNoEncodingType extends StObject {
  
  var customization: js.UndefOr[GenericInputType] = js.undefined
  
  var funcName: js.UndefOr[GenericInputType] = js.undefined
}
object CSHAKEOptionsNoEncodingType {
  
  inline def apply(): CSHAKEOptionsNoEncodingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSHAKEOptionsNoEncodingType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSHAKEOptionsNoEncodingType] (val x: Self) extends AnyVal {
    
    inline def setCustomization(value: GenericInputType): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
    
    inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
    
    inline def setFuncName(value: GenericInputType): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
    
    inline def setFuncNameUndefined: Self = StObject.set(x, "funcName", js.undefined)
  }
}
