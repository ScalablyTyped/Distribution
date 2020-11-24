package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectDiagnosticsLinkStatus extends js.Object {
  
  /** A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on this link. This will be empty if the link is bundled */
  var arpCaches: js.UndefOr[js.Array[InterconnectDiagnosticsARPEntry]] = js.native
  
  /** The unique ID for this link assigned during turn up by Google. */
  var circuitId: js.UndefOr[String] = js.native
  
  /** The Demarc address assigned by Google and provided in the LoA. */
  var googleDemarc: js.UndefOr[String] = js.native
  
  var lacpStatus: js.UndefOr[InterconnectDiagnosticsLinkLACPStatus] = js.native
  
  /** An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the received light level. */
  var receivingOpticalPower: js.UndefOr[InterconnectDiagnosticsLinkOpticalPower] = js.native
  
  /** An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the transmitted light level. */
  var transmittingOpticalPower: js.UndefOr[InterconnectDiagnosticsLinkOpticalPower] = js.native
}
object InterconnectDiagnosticsLinkStatus {
  
  @scala.inline
  def apply(): InterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsLinkStatus]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsLinkStatusOps[Self <: InterconnectDiagnosticsLinkStatus] (val x: Self) extends AnyVal {
    
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
    def setArpCachesVarargs(value: InterconnectDiagnosticsARPEntry*): Self = this.set("arpCaches", js.Array(value :_*))
    
    @scala.inline
    def setArpCaches(value: js.Array[InterconnectDiagnosticsARPEntry]): Self = this.set("arpCaches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArpCaches: Self = this.set("arpCaches", js.undefined)
    
    @scala.inline
    def setCircuitId(value: String): Self = this.set("circuitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircuitId: Self = this.set("circuitId", js.undefined)
    
    @scala.inline
    def setGoogleDemarc(value: String): Self = this.set("googleDemarc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleDemarc: Self = this.set("googleDemarc", js.undefined)
    
    @scala.inline
    def setLacpStatus(value: InterconnectDiagnosticsLinkLACPStatus): Self = this.set("lacpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLacpStatus: Self = this.set("lacpStatus", js.undefined)
    
    @scala.inline
    def setReceivingOpticalPower(value: InterconnectDiagnosticsLinkOpticalPower): Self = this.set("receivingOpticalPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivingOpticalPower: Self = this.set("receivingOpticalPower", js.undefined)
    
    @scala.inline
    def setTransmittingOpticalPower(value: InterconnectDiagnosticsLinkOpticalPower): Self = this.set("transmittingOpticalPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransmittingOpticalPower: Self = this.set("transmittingOpticalPower", js.undefined)
  }
}
