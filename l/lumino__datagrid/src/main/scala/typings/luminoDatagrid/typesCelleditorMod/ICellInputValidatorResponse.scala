package typings.luminoDatagrid.typesCelleditorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellInputValidatorResponse extends StObject {
  
  /**
    * Validation error message. Set only when input is invalid
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Flag indicating cell input is valid or not
    */
  var valid: Boolean
}
object ICellInputValidatorResponse {
  
  inline def apply(valid: Boolean): ICellInputValidatorResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellInputValidatorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICellInputValidatorResponse] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
