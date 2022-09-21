package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountCountError extends StObject {
  
  /**
    * Account owner.
    */
  var account: js.UndefOr[SchemaUserInfo] = js.undefined
  
  /**
    * Account query error.
    */
  var errorType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountCountError {
  
  inline def apply(): SchemaAccountCountError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountCountError]
  }
  
  extension [Self <: SchemaAccountCountError](x: Self) {
    
    inline def setAccount(value: SchemaUserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeNull: Self = StObject.set(x, "errorType", null)
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
  }
}
