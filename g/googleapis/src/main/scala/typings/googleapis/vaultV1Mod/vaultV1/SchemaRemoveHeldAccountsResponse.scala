package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveHeldAccountsResponse extends StObject {
  
  /**
    * A list of statuses for the deleted accounts. Results have the same order as the request.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
}
object SchemaRemoveHeldAccountsResponse {
  
  inline def apply(): SchemaRemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsResponse]
  }
  
  extension [Self <: SchemaRemoveHeldAccountsResponse](x: Self) {
    
    inline def setStatuses(value: js.Array[SchemaStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: SchemaStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
