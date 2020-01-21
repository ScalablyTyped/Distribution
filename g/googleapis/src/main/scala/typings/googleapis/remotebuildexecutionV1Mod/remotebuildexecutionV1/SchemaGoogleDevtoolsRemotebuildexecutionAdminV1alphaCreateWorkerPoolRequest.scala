package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `CreateWorkerPool`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest extends js.Object {
  /**
    * Resource name of the instance in which to create the new worker pool.
    * Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * ID of the created worker pool. A valid pool ID must: be 6-50 characters
    * long, contain only lowercase letters, digits, hyphens and underscores,
    * start with a lowercase letter, and end with a lowercase letter or a
    * digit.
    */
  var poolId: js.UndefOr[String] = js.native
  /**
    * Specifies the worker pool to create. The name in the worker pool, if
    * specified, is ignored.
    */
  var workerPool: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest {
  @scala.inline
  def apply(
    parent: String = null,
    poolId: String = null,
    workerPool: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = null
  ): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (poolId != null) __obj.updateDynamic("poolId")(poolId.asInstanceOf[js.Any])
    if (workerPool != null) __obj.updateDynamic("workerPool")(workerPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest]
  }
}

