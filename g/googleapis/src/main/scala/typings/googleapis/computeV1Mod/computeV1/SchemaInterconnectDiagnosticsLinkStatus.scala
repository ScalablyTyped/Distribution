package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnosticsLinkStatus extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on this link. This will be empty if the link is bundled
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.undefined
  
  /**
    * The unique ID for this link assigned during turn up by Google.
    */
  var circuitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Demarc address assigned by Google and provided in the LoA.
    */
  var googleDemarc: js.UndefOr[String | Null] = js.undefined
  
  var lacpStatus: js.UndefOr[SchemaInterconnectDiagnosticsLinkLACPStatus] = js.undefined
  
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the received light level.
    */
  var receivingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.undefined
  
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the transmitted light level.
    */
  var transmittingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.undefined
}
object SchemaInterconnectDiagnosticsLinkStatus {
  
  inline def apply(): SchemaInterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkStatus]
  }
  
  extension [Self <: SchemaInterconnectDiagnosticsLinkStatus](x: Self) {
    
    inline def setArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    inline def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    inline def setArpCachesVarargs(value: SchemaInterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value*))
    
    inline def setCircuitId(value: String): Self = StObject.set(x, "circuitId", value.asInstanceOf[js.Any])
    
    inline def setCircuitIdNull: Self = StObject.set(x, "circuitId", null)
    
    inline def setCircuitIdUndefined: Self = StObject.set(x, "circuitId", js.undefined)
    
    inline def setGoogleDemarc(value: String): Self = StObject.set(x, "googleDemarc", value.asInstanceOf[js.Any])
    
    inline def setGoogleDemarcNull: Self = StObject.set(x, "googleDemarc", null)
    
    inline def setGoogleDemarcUndefined: Self = StObject.set(x, "googleDemarc", js.undefined)
    
    inline def setLacpStatus(value: SchemaInterconnectDiagnosticsLinkLACPStatus): Self = StObject.set(x, "lacpStatus", value.asInstanceOf[js.Any])
    
    inline def setLacpStatusUndefined: Self = StObject.set(x, "lacpStatus", js.undefined)
    
    inline def setReceivingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "receivingOpticalPower", value.asInstanceOf[js.Any])
    
    inline def setReceivingOpticalPowerUndefined: Self = StObject.set(x, "receivingOpticalPower", js.undefined)
    
    inline def setTransmittingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "transmittingOpticalPower", value.asInstanceOf[js.Any])
    
    inline def setTransmittingOpticalPowerUndefined: Self = StObject.set(x, "transmittingOpticalPower", js.undefined)
  }
}
