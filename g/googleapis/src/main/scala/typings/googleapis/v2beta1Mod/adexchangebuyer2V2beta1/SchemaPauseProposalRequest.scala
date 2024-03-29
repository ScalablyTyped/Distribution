package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPauseProposalRequest extends StObject {
  
  /**
    * The reason why the proposal is being paused. This human readable message will be displayed in the seller's UI. (Max length: 1000 unicode code units.)
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaPauseProposalRequest {
  
  inline def apply(): SchemaPauseProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPauseProposalRequest]
  }
  
  extension [Self <: SchemaPauseProposalRequest](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
