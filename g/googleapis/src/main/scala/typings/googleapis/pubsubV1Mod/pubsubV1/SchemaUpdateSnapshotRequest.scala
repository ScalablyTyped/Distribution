package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the UpdateSnapshot method.
  */
@js.native
trait SchemaUpdateSnapshotRequest extends js.Object {
  
  /**
    * The updated snapshot object.
    */
  var snapshot: js.UndefOr[SchemaSnapshot] = js.native
  
  /**
    * Indicates which fields in the provided snapshot to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateSnapshotRequest {
  
  @scala.inline
  def apply(): SchemaUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSnapshotRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateSnapshotRequestOps[Self <: SchemaUpdateSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSnapshot(value: SchemaSnapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
