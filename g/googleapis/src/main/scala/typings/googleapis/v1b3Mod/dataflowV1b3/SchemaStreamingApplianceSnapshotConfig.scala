package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Streaming appliance snapshot configuration.
  */
trait SchemaStreamingApplianceSnapshotConfig extends StObject {
  
  /**
    * Indicates which endpoint is used to import appliance state.
    */
  var importStateEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * If set, indicates the snapshot id for the snapshot being performed.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
}
object SchemaStreamingApplianceSnapshotConfig {
  
  @scala.inline
  def apply(): SchemaStreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingApplianceSnapshotConfig]
  }
  
  @scala.inline
  implicit class SchemaStreamingApplianceSnapshotConfigMutableBuilder[Self <: SchemaStreamingApplianceSnapshotConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportStateEndpoint(value: String): Self = StObject.set(x, "importStateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportStateEndpointUndefined: Self = StObject.set(x, "importStateEndpoint", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
