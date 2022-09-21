package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplacenotesInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The proposalId to add notes for.
    */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddOrderNotesRequest] = js.undefined
}
object ParamsResourceMarketplacenotesInsert {
  
  inline def apply(): ParamsResourceMarketplacenotesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesInsert]
  }
  
  extension [Self <: ParamsResourceMarketplacenotesInsert](x: Self) {
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setRequestBody(value: SchemaAddOrderNotesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
