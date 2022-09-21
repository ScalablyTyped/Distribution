package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcceptProposalRequest extends StObject {
  
  /**
    * The last known client revision number of the proposal.
    */
  var proposalRevision: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcceptProposalRequest {
  
  inline def apply(): SchemaAcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceptProposalRequest]
  }
  
  extension [Self <: SchemaAcceptProposalRequest](x: Self) {
    
    inline def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNull: Self = StObject.set(x, "proposalRevision", null)
    
    inline def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
  }
}
