package typings.joi.anon

import typings.joi.mod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  var warning: js.Array[ValidationError]
}
object Warning {
  
  inline def apply(warning: js.Array[ValidationError]): Warning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  extension [Self <: Warning](x: Self) {
    
    inline def setWarning(value: js.Array[ValidationError]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningVarargs(value: ValidationError*): Self = StObject.set(x, "warning", js.Array(value*))
  }
}
