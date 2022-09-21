package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProposalsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The proposal id to update.
    */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProposal] = js.undefined
  
  /**
    * The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    */
  var revisionNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    */
  var updateAction: js.UndefOr[String] = js.undefined
}
object ParamsResourceProposalsPatch {
  
  inline def apply(): ParamsResourceProposalsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProposalsPatch]
  }
  
  extension [Self <: ParamsResourceProposalsPatch](x: Self) {
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setRequestBody(value: SchemaProposal): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRevisionNumber(value: String): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
