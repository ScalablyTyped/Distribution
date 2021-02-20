package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInterconnectDiagnosticsLinkLACPStatus extends StObject {
  
  /**
    * System ID of the port on Google?s side of the LACP exchange.
    */
  var googleSystemId: js.UndefOr[String] = js.native
  
  /**
    * System ID of the port on the neighbor?s side of the LACP exchange.
    */
  var neighborSystemId: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object SchemaInterconnectDiagnosticsLinkLACPStatus {
  
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkLACPStatus]
  }
  
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkLACPStatusMutableBuilder[Self <: SchemaInterconnectDiagnosticsLinkLACPStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleSystemId(value: String): Self = StObject.set(x, "googleSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleSystemIdUndefined: Self = StObject.set(x, "googleSystemId", js.undefined)
    
    @scala.inline
    def setNeighborSystemId(value: String): Self = StObject.set(x, "neighborSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborSystemIdUndefined: Self = StObject.set(x, "neighborSystemId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
