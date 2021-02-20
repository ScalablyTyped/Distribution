package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayStatusHighAvailabilityRequirementState extends StObject {
  
  /** Indicates the high availability requirement state for the VPN connection. Valid values are CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET. */
  var state: js.UndefOr[String] = js.native
  
  /** Indicates the reason why the VPN connection does not meet the high availability redundancy criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE. */
  var unsatisfiedReason: js.UndefOr[String] = js.native
}
object VpnGatewayStatusHighAvailabilityRequirementState {
  
  @scala.inline
  def apply(): VpnGatewayStatusHighAvailabilityRequirementState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatusHighAvailabilityRequirementState]
  }
  
  @scala.inline
  implicit class VpnGatewayStatusHighAvailabilityRequirementStateMutableBuilder[Self <: VpnGatewayStatusHighAvailabilityRequirementState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUnsatisfiedReason(value: String): Self = StObject.set(x, "unsatisfiedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsatisfiedReasonUndefined: Self = StObject.set(x, "unsatisfiedReason", js.undefined)
  }
}
