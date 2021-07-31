package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to accept a proposal.
  */
trait SchemaAcceptProposalRequest extends StObject {
  
  /**
    * The last known client revision number of the proposal.
    */
  var proposalRevision: js.UndefOr[String] = js.undefined
}
object SchemaAcceptProposalRequest {
  
  @scala.inline
  def apply(): SchemaAcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceptProposalRequest]
  }
  
  @scala.inline
  implicit class SchemaAcceptProposalRequestMutableBuilder[Self <: SchemaAcceptProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
  }
}
