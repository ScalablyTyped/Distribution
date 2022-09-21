package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResumeProposalDealsRequest extends StObject {
  
  /**
    * The external_deal_id's of the deals to resume. If empty, all the deals in the proposal will be resumed.
    */
  var externalDealIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaResumeProposalDealsRequest {
  
  inline def apply(): SchemaResumeProposalDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResumeProposalDealsRequest]
  }
  
  extension [Self <: SchemaResumeProposalDealsRequest](x: Self) {
    
    inline def setExternalDealIds(value: js.Array[String]): Self = StObject.set(x, "externalDealIds", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdsNull: Self = StObject.set(x, "externalDealIds", null)
    
    inline def setExternalDealIdsUndefined: Self = StObject.set(x, "externalDealIds", js.undefined)
    
    inline def setExternalDealIdsVarargs(value: String*): Self = StObject.set(x, "externalDealIds", js.Array(value*))
  }
}
