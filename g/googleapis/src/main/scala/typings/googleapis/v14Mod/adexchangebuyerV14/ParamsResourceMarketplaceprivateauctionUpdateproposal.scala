package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplaceprivateauctionUpdateproposal
  extends StObject
     with StandardParameters {
  
  /**
    * The private auction id to be updated.
    */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdatePrivateAuctionProposalRequest] = js.undefined
}
object ParamsResourceMarketplaceprivateauctionUpdateproposal {
  
  inline def apply(): ParamsResourceMarketplaceprivateauctionUpdateproposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplaceprivateauctionUpdateproposal]
  }
  
  extension [Self <: ParamsResourceMarketplaceprivateauctionUpdateproposal](x: Self) {
    
    inline def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    inline def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdatePrivateAuctionProposalRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
