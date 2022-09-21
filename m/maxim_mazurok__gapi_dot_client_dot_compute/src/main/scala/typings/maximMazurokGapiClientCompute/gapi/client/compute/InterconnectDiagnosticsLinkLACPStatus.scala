package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectDiagnosticsLinkLACPStatus extends StObject {
  
  /** System ID of the port on Google's side of the LACP exchange. */
  var googleSystemId: js.UndefOr[String] = js.undefined
  
  /** System ID of the port on the neighbor's side of the LACP exchange. */
  var neighborSystemId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of a LACP link, which can take one of the following values: - ACTIVE: The link is configured and active within the bundle. - DETACHED: The link is not configured within
    * the bundle. This means that the rest of the object should be empty.
    */
  var state: js.UndefOr[String] = js.undefined
}
object InterconnectDiagnosticsLinkLACPStatus {
  
  inline def apply(): InterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsLinkLACPStatus]
  }
  
  extension [Self <: InterconnectDiagnosticsLinkLACPStatus](x: Self) {
    
    inline def setGoogleSystemId(value: String): Self = StObject.set(x, "googleSystemId", value.asInstanceOf[js.Any])
    
    inline def setGoogleSystemIdUndefined: Self = StObject.set(x, "googleSystemId", js.undefined)
    
    inline def setNeighborSystemId(value: String): Self = StObject.set(x, "neighborSystemId", value.asInstanceOf[js.Any])
    
    inline def setNeighborSystemIdUndefined: Self = StObject.set(x, "neighborSystemId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
