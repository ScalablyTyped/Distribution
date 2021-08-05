package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputStatic extends StObject {
  
  var defaults: MaskedInputDefaults
  
  def format(value: String, options: MaskedInputStaticDefaults): Boolean
  
  def isValid(value: String, options: MaskedInputStaticDefaults): Boolean
}
object MaskedInputStatic {
  
  inline def apply(
    defaults: MaskedInputDefaults,
    format: (String, MaskedInputStaticDefaults) => Boolean,
    isValid: (String, MaskedInputStaticDefaults) => Boolean
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], format = js.Any.fromFunction2(format), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[MaskedInputStatic]
  }
  
  extension [Self <: MaskedInputStatic](x: Self) {
    
    inline def setDefaults(value: MaskedInputDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: (String, MaskedInputStaticDefaults) => Boolean): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setIsValid(value: (String, MaskedInputStaticDefaults) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
  }
}
