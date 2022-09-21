package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplacedealsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * proposalId for which deals need to be added.
    */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddOrderDealsRequest] = js.undefined
}
object ParamsResourceMarketplacedealsInsert {
  
  inline def apply(): ParamsResourceMarketplacedealsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacedealsInsert]
  }
  
  extension [Self <: ParamsResourceMarketplacedealsInsert](x: Self) {
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setRequestBody(value: SchemaAddOrderDealsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
