package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the UpdateSnapshot method.
  */
trait SchemaUpdateSnapshotRequest extends StObject {
  
  /**
    * The updated snapshot object.
    */
  var snapshot: js.UndefOr[SchemaSnapshot] = js.undefined
  
  /**
    * Indicates which fields in the provided snapshot to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateSnapshotRequest {
  
  @scala.inline
  def apply(): SchemaUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSnapshotRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateSnapshotRequestMutableBuilder[Self <: SchemaUpdateSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: SchemaSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
