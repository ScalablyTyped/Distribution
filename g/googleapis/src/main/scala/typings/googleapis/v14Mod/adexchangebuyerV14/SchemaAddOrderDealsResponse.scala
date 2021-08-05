package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddOrderDealsResponse extends StObject {
  
  /**
    * List of deals added (in the same proposal as passed in the request)
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.undefined
  
  /**
    * The updated revision number for the proposal.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
}
object SchemaAddOrderDealsResponse {
  
  inline def apply(): SchemaAddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderDealsResponse]
  }
  
  extension [Self <: SchemaAddOrderDealsResponse](x: Self) {
    
    inline def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
  }
}
