package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingApplianceSnapshotConfig extends StObject {
  
  /** Indicates which endpoint is used to import appliance state. */
  var importStateEndpoint: js.UndefOr[String] = js.undefined
  
  /** If set, indicates the snapshot id for the snapshot being performed. */
  var snapshotId: js.UndefOr[String] = js.undefined
}
object StreamingApplianceSnapshotConfig {
  
  inline def apply(): StreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingApplianceSnapshotConfig]
  }
  
  extension [Self <: StreamingApplianceSnapshotConfig](x: Self) {
    
    inline def setImportStateEndpoint(value: String): Self = StObject.set(x, "importStateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setImportStateEndpointUndefined: Self = StObject.set(x, "importStateEndpoint", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
