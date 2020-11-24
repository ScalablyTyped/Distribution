package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectDiagnostics extends js.Object {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty
    * when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[InterconnectDiagnosticsARPEntry]] = js.native
  
  /** A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect. */
  var links: js.UndefOr[js.Array[InterconnectDiagnosticsLinkStatus]] = js.native
  
  /** The MAC address of the Interconnect's bundle interface. */
  var macAddress: js.UndefOr[String] = js.native
}
object InterconnectDiagnostics {
  
  @scala.inline
  def apply(): InterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnostics]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsOps[Self <: InterconnectDiagnostics] (val x: Self) extends AnyVal {
    
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
    def setLinksVarargs(value: InterconnectDiagnosticsLinkStatus*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[InterconnectDiagnosticsLinkStatus]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
  }
}
