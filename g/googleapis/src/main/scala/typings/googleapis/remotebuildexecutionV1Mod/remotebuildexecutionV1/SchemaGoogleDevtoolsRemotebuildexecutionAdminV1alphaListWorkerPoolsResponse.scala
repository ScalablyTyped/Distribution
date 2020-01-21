package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends js.Object {
  /**
    * The list of worker pools in a given instance.
    */
  var workerPools: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  @scala.inline
  def apply(workerPools: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = null): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
}

