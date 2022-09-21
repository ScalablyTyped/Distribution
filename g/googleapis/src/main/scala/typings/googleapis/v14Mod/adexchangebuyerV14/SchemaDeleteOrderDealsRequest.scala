package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteOrderDealsRequest extends StObject {
  
  /**
    * List of deals to delete for a given proposal
    */
  var dealIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteOrderDealsRequest {
  
  inline def apply(): SchemaDeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteOrderDealsRequest]
  }
  
  extension [Self <: SchemaDeleteOrderDealsRequest](x: Self) {
    
    inline def setDealIds(value: js.Array[String]): Self = StObject.set(x, "dealIds", value.asInstanceOf[js.Any])
    
    inline def setDealIdsNull: Self = StObject.set(x, "dealIds", null)
    
    inline def setDealIdsUndefined: Self = StObject.set(x, "dealIds", js.undefined)
    
    inline def setDealIdsVarargs(value: String*): Self = StObject.set(x, "dealIds", js.Array(value*))
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberNull: Self = StObject.set(x, "proposalRevisionNumber", null)
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionNull: Self = StObject.set(x, "updateAction", null)
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
