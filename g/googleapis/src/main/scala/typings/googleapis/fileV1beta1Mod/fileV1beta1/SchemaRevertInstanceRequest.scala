package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevertInstanceRequest extends StObject {
  
  /**
    * Required. The snapshot resource ID, in the format 'my-snapshot', where the specified ID is the {snapshot_id\} of the fully qualified name like projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}/snapshots/{snapshot_id\}
    */
  var targetSnapshotId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevertInstanceRequest {
  
  inline def apply(): SchemaRevertInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertInstanceRequest]
  }
  
  extension [Self <: SchemaRevertInstanceRequest](x: Self) {
    
    inline def setTargetSnapshotId(value: String): Self = StObject.set(x, "targetSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotIdNull: Self = StObject.set(x, "targetSnapshotId", null)
    
    inline def setTargetSnapshotIdUndefined: Self = StObject.set(x, "targetSnapshotId", js.undefined)
  }
}
