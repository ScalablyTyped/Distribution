package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersHoldsAddheldaccounts
  extends StObject
     with StandardParameters {
  
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.undefined
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddHeldAccountsRequest] = js.undefined
}
object ParamsResourceMattersHoldsAddheldaccounts {
  
  inline def apply(): ParamsResourceMattersHoldsAddheldaccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersHoldsAddheldaccounts]
  }
  
  extension [Self <: ParamsResourceMattersHoldsAddheldaccounts](x: Self) {
    
    inline def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    inline def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setRequestBody(value: SchemaAddHeldAccountsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
