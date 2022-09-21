package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCustomDns extends StObject {
  
  /** a boolean indicating whether custom dns has been configured for this ip */
  var enabled: Boolean
  
  /** if the ip's custom dns is invalid, this will include details about the error */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /** whether the ip's custom dns is currently valid */
  var valid: Boolean
}
object IpsCustomDns {
  
  inline def apply(enabled: Boolean, valid: Boolean): IpsCustomDns = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsCustomDns]
  }
  
  extension [Self <: IpsCustomDns](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
