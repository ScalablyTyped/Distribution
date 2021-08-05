package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrderDealsRequest extends StObject {
  
  /** List of deals to delete for a given proposal */
  var dealIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.undefined
}
object DeleteOrderDealsRequest {
  
  inline def apply(): DeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrderDealsRequest]
  }
  
  extension [Self <: DeleteOrderDealsRequest](x: Self) {
    
    inline def setDealIds(value: js.Array[String]): Self = StObject.set(x, "dealIds", value.asInstanceOf[js.Any])
    
    inline def setDealIdsUndefined: Self = StObject.set(x, "dealIds", js.undefined)
    
    inline def setDealIdsVarargs(value: String*): Self = StObject.set(x, "dealIds", js.Array(value :_*))
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
