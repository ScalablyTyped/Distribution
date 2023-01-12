package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectDiagnosticsLinkStatus extends StObject {
  
  /** A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on this link. This will be empty if the link is bundled */
  var arpCaches: js.UndefOr[js.Array[InterconnectDiagnosticsARPEntry]] = js.undefined
  
  /** The unique ID for this link assigned during turn up by Google. */
  var circuitId: js.UndefOr[String] = js.undefined
  
  /** The Demarc address assigned by Google and provided in the LoA. */
  var googleDemarc: js.UndefOr[String] = js.undefined
  
  var lacpStatus: js.UndefOr[InterconnectDiagnosticsLinkLACPStatus] = js.undefined
  
  /** An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the received light level. */
  var receivingOpticalPower: js.UndefOr[InterconnectDiagnosticsLinkOpticalPower] = js.undefined
  
  /** An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of the transmitted light level. */
  var transmittingOpticalPower: js.UndefOr[InterconnectDiagnosticsLinkOpticalPower] = js.undefined
}
object InterconnectDiagnosticsLinkStatus {
  
  inline def apply(): InterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsLinkStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterconnectDiagnosticsLinkStatus] (val x: Self) extends AnyVal {
    
    inline def setArpCaches(value: js.Array[InterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    inline def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    inline def setArpCachesVarargs(value: InterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value*))
    
    inline def setCircuitId(value: String): Self = StObject.set(x, "circuitId", value.asInstanceOf[js.Any])
    
    inline def setCircuitIdUndefined: Self = StObject.set(x, "circuitId", js.undefined)
    
    inline def setGoogleDemarc(value: String): Self = StObject.set(x, "googleDemarc", value.asInstanceOf[js.Any])
    
    inline def setGoogleDemarcUndefined: Self = StObject.set(x, "googleDemarc", js.undefined)
    
    inline def setLacpStatus(value: InterconnectDiagnosticsLinkLACPStatus): Self = StObject.set(x, "lacpStatus", value.asInstanceOf[js.Any])
    
    inline def setLacpStatusUndefined: Self = StObject.set(x, "lacpStatus", js.undefined)
    
    inline def setReceivingOpticalPower(value: InterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "receivingOpticalPower", value.asInstanceOf[js.Any])
    
    inline def setReceivingOpticalPowerUndefined: Self = StObject.set(x, "receivingOpticalPower", js.undefined)
    
    inline def setTransmittingOpticalPower(value: InterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "transmittingOpticalPower", value.asInstanceOf[js.Any])
    
    inline def setTransmittingOpticalPowerUndefined: Self = StObject.set(x, "transmittingOpticalPower", js.undefined)
  }
}
