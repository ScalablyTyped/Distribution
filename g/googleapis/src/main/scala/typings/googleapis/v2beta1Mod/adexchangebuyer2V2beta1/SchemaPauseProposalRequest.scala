package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to pause serving for an already-finalized proposal.
  */
@js.native
trait SchemaPauseProposalRequest extends StObject {
  
  /**
    * The reason why the proposal is being paused. This human readable message
    * will be displayed in the seller&#39;s UI. (Max length: 1000 unicode code
    * units.)
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaPauseProposalRequest {
  
  @scala.inline
  def apply(): SchemaPauseProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPauseProposalRequest]
  }
  
  @scala.inline
  implicit class SchemaPauseProposalRequestMutableBuilder[Self <: SchemaPauseProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
