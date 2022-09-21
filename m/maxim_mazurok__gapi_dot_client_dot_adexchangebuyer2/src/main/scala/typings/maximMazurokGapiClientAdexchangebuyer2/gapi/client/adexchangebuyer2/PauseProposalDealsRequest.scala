package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseProposalDealsRequest extends StObject {
  
  /** The external_deal_id's of the deals to be paused. If empty, all the deals in the proposal will be paused. */
  var externalDealIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The reason why the deals are being paused. This human readable message will be displayed in the seller's UI. (Max length: 1000 unicode code units.) */
  var reason: js.UndefOr[String] = js.undefined
}
object PauseProposalDealsRequest {
  
  inline def apply(): PauseProposalDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseProposalDealsRequest]
  }
  
  extension [Self <: PauseProposalDealsRequest](x: Self) {
    
    inline def setExternalDealIds(value: js.Array[String]): Self = StObject.set(x, "externalDealIds", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdsUndefined: Self = StObject.set(x, "externalDealIds", js.undefined)
    
    inline def setExternalDealIdsVarargs(value: String*): Self = StObject.set(x, "externalDealIds", js.Array(value*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
