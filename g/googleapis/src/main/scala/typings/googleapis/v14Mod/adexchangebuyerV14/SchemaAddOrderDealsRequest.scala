package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddOrderDealsRequest extends StObject {
  
  /**
    * The list of deals to add
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.undefined
  
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddOrderDealsRequest {
  
  inline def apply(): SchemaAddOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderDealsRequest]
  }
  
  extension [Self <: SchemaAddOrderDealsRequest](x: Self) {
    
    inline def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value*))
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberNull: Self = StObject.set(x, "proposalRevisionNumber", null)
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionNull: Self = StObject.set(x, "updateAction", null)
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
