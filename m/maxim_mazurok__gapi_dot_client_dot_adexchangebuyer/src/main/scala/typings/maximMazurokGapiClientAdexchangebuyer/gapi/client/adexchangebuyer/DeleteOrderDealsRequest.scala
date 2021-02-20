package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrderDealsRequest extends StObject {
  
  /** List of deals to delete for a given proposal */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.native
}
object DeleteOrderDealsRequest {
  
  @scala.inline
  def apply(): DeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrderDealsRequest]
  }
  
  @scala.inline
  implicit class DeleteOrderDealsRequestMutableBuilder[Self <: DeleteOrderDealsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDealIds(value: js.Array[String]): Self = StObject.set(x, "dealIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdsUndefined: Self = StObject.set(x, "dealIds", js.undefined)
    
    @scala.inline
    def setDealIdsVarargs(value: String*): Self = StObject.set(x, "dealIds", js.Array(value :_*))
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    @scala.inline
    def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
