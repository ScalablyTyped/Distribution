package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingApplianceSnapshotConfig extends StObject {
  
  /**
    * Indicates which endpoint is used to import appliance state.
    */
  var importStateEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, indicates the snapshot id for the snapshot being performed.
    */
  var snapshotId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamingApplianceSnapshotConfig {
  
  inline def apply(): SchemaStreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingApplianceSnapshotConfig]
  }
  
  extension [Self <: SchemaStreamingApplianceSnapshotConfig](x: Self) {
    
    inline def setImportStateEndpoint(value: String): Self = StObject.set(x, "importStateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setImportStateEndpointNull: Self = StObject.set(x, "importStateEndpoint", null)
    
    inline def setImportStateEndpointUndefined: Self = StObject.set(x, "importStateEndpoint", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdNull: Self = StObject.set(x, "snapshotId", null)
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
