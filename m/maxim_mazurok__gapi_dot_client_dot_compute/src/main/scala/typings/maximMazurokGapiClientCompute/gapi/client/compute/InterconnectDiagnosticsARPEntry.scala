package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectDiagnosticsARPEntry extends StObject {
  
  /** The IP address of this ARP neighbor. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** The MAC address of this ARP neighbor. */
  var macAddress: js.UndefOr[String] = js.undefined
}
object InterconnectDiagnosticsARPEntry {
  
  @scala.inline
  def apply(): InterconnectDiagnosticsARPEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsARPEntry]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsARPEntryMutableBuilder[Self <: InterconnectDiagnosticsARPEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
