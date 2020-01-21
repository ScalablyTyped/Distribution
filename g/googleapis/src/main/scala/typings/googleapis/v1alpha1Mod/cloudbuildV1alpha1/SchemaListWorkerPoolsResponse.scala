package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(workerPools: js.Array[SchemaWorkerPool] = null): SchemaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListWorkerPoolsResponse]
  }
}

