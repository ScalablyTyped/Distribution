package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProposalsSetupcomplete
  extends StObject
     with StandardParameters {
  
  /**
    * The proposal id for which the setup is complete
    */
  var proposalId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProposalsSetupcomplete {
  
  inline def apply(): ParamsResourceProposalsSetupcomplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProposalsSetupcomplete]
  }
  
  extension [Self <: ParamsResourceProposalsSetupcomplete](x: Self) {
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
