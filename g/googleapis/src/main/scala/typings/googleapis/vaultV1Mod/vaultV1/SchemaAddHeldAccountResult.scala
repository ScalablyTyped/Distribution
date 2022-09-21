package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddHeldAccountResult extends StObject {
  
  /**
    * Returned when the account was successfully created.
    */
  var account: js.UndefOr[SchemaHeldAccount] = js.undefined
  
  /**
    * Reports the request status. If it failed, returns an error message.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaAddHeldAccountResult {
  
  inline def apply(): SchemaAddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountResult]
  }
  
  extension [Self <: SchemaAddHeldAccountResult](x: Self) {
    
    inline def setAccount(value: SchemaHeldAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
