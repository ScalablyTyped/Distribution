package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSnapshotRequest extends StObject {
  
  /**
    * Required. The updated snapshot object.
    */
  var snapshot: js.UndefOr[SchemaSnapshot] = js.undefined
  
  /**
    * Required. Indicates which fields in the provided snapshot to update. Must be specified and non-empty.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateSnapshotRequest {
  
  inline def apply(): SchemaUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSnapshotRequest]
  }
  
  extension [Self <: SchemaUpdateSnapshotRequest](x: Self) {
    
    inline def setSnapshot(value: SchemaSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
