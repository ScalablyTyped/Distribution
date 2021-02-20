package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptProposalRequest extends StObject {
  
  /** The last known client revision number of the proposal. */
  var proposalRevision: js.UndefOr[String] = js.native
}
object AcceptProposalRequest {
  
  @scala.inline
  def apply(): AcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptProposalRequest]
  }
  
  @scala.inline
  implicit class AcceptProposalRequestMutableBuilder[Self <: AcceptProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
  }
}
