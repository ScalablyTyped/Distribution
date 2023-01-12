package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeProposalDealsRequest extends StObject {
  
  /** The external_deal_id's of the deals to resume. If empty, all the deals in the proposal will be resumed. */
  var externalDealIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ResumeProposalDealsRequest {
  
  inline def apply(): ResumeProposalDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeProposalDealsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeProposalDealsRequest] (val x: Self) extends AnyVal {
    
    inline def setExternalDealIds(value: js.Array[String]): Self = StObject.set(x, "externalDealIds", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdsUndefined: Self = StObject.set(x, "externalDealIds", js.undefined)
    
    inline def setExternalDealIdsVarargs(value: String*): Self = StObject.set(x, "externalDealIds", js.Array(value*))
  }
}
