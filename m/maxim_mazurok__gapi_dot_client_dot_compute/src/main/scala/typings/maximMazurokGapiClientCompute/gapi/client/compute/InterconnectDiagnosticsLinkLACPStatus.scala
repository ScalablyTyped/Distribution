package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectDiagnosticsLinkLACPStatus extends js.Object {
  
  /** System ID of the port on Google's side of the LACP exchange. */
  var googleSystemId: js.UndefOr[String] = js.native
  
  /** System ID of the port on the neighbor's side of the LACP exchange. */
  var neighborSystemId: js.UndefOr[String] = js.native
  
  /**
    * The state of a LACP link, which can take one of the following values:
    * - ACTIVE: The link is configured and active within the bundle.
    * - DETACHED: The link is not configured within the bundle. This means that the rest of the object should be empty.
    */
  var state: js.UndefOr[String] = js.native
}
object InterconnectDiagnosticsLinkLACPStatus {
  
  @scala.inline
  def apply(): InterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsLinkLACPStatus]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsLinkLACPStatusOps[Self <: InterconnectDiagnosticsLinkLACPStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGoogleSystemId(value: String): Self = this.set("googleSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleSystemId: Self = this.set("googleSystemId", js.undefined)
    
    @scala.inline
    def setNeighborSystemId(value: String): Self = this.set("neighborSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeighborSystemId: Self = this.set("neighborSystemId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
