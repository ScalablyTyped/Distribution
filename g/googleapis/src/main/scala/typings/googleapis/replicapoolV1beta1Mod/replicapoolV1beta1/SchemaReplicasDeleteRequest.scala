package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReplicasDeleteRequest extends js.Object {
  
  /**
    * Whether the instance resource represented by this replica should be
    * deleted or abandoned. If abandoned, the replica will be deleted but the
    * virtual machine instance will remain. By default, this is set to false
    * and the instance will be deleted along with the replica.
    */
  var abandonInstance: js.UndefOr[Boolean] = js.native
}
object SchemaReplicasDeleteRequest {
  
  @scala.inline
  def apply(): SchemaReplicasDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicasDeleteRequest]
  }
  
  @scala.inline
  implicit class SchemaReplicasDeleteRequestOps[Self <: SchemaReplicasDeleteRequest] (val x: Self) extends AnyVal {
    
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
    def setAbandonInstance(value: Boolean): Self = this.set("abandonInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbandonInstance: Self = this.set("abandonInstance", js.undefined)
  }
}
