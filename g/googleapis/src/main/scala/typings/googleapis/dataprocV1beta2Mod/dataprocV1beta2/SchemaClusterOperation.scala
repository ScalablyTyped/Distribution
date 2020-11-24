package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The cluster operation triggered by a workflow.
  */
@js.native
trait SchemaClusterOperation extends js.Object {
  
  /**
    * Output only. Indicates the operation is done.
    */
  var done: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. Error, if operation failed.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Output only. The id of the cluster operation.
    */
  var operationId: js.UndefOr[String] = js.native
}
object SchemaClusterOperation {
  
  @scala.inline
  def apply(): SchemaClusterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperation]
  }
  
  @scala.inline
  implicit class SchemaClusterOperationOps[Self <: SchemaClusterOperation] (val x: Self) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
  }
}
