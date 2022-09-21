package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProposalsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Id of the proposal to retrieve.
    */
  var proposalId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProposalsGet {
  
  inline def apply(): ParamsResourceProposalsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProposalsGet]
  }
  
  extension [Self <: ParamsResourceProposalsGet](x: Self) {
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
