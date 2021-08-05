package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseProposalRequest extends StObject {
  
  /** The reason why the proposal is being paused. This human readable message will be displayed in the seller's UI. (Max length: 1000 unicode code units.) */
  var reason: js.UndefOr[String] = js.undefined
}
object PauseProposalRequest {
  
  inline def apply(): PauseProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseProposalRequest]
  }
  
  extension [Self <: PauseProposalRequest](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
