package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Diagnostics information about interconnect, contains detailed and current
  * technical information about Google?s side of the connection.
  */
trait SchemaInterconnectDiagnostics extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual
    * neighbors currently seen by the Google router in the ARP cache for the
    * Interconnect. This will be empty when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.undefined
  
  /**
    * A list of InterconnectDiagnostics.LinkStatus objects, describing the
    * status for each link on the Interconnect.
    */
  var links: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsLinkStatus]] = js.undefined
  
  /**
    * The MAC address of the Interconnect&#39;s bundle interface.
    */
  var macAddress: js.UndefOr[String] = js.undefined
}
object SchemaInterconnectDiagnostics {
  
  inline def apply(): SchemaInterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnostics]
  }
  
  extension [Self <: SchemaInterconnectDiagnostics](x: Self) {
    
    inline def setArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    inline def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    inline def setArpCachesVarargs(value: SchemaInterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value :_*))
    
    inline def setLinks(value: js.Array[SchemaInterconnectDiagnosticsLinkStatus]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaInterconnectDiagnosticsLinkStatus*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
