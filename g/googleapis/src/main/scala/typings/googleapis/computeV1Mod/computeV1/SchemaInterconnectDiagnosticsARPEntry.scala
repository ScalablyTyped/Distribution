package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describing the ARP neighbor entries seen on this link
  */
@js.native
trait SchemaInterconnectDiagnosticsARPEntry extends StObject {
  
  /**
    * The IP address of this ARP neighbor.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * The MAC address of this ARP neighbor.
    */
  var macAddress: js.UndefOr[String] = js.native
}
object SchemaInterconnectDiagnosticsARPEntry {
  
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsARPEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsARPEntry]
  }
  
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsARPEntryMutableBuilder[Self <: SchemaInterconnectDiagnosticsARPEntry] (val x: Self) extends AnyVal {
    
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
