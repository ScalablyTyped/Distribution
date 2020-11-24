package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing existing `WorkerPools`.
  */
@js.native
trait SchemaListWorkerPoolsResponse extends js.Object {
  
  /**
    * `WorkerPools` for the project.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.native
}
object SchemaListWorkerPoolsResponse {
  
  @scala.inline
  def apply(): SchemaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkerPoolsResponse]
  }
  
  @scala.inline
  implicit class SchemaListWorkerPoolsResponseOps[Self <: SchemaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkerPoolsVarargs(value: SchemaWorkerPool*): Self = this.set("workerPools", js.Array(value :_*))
    
    @scala.inline
    def setWorkerPools(value: js.Array[SchemaWorkerPool]): Self = this.set("workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerPools: Self = this.set("workerPools", js.undefined)
  }
}
