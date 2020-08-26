package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A worker pool resource in the Remote Build Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends js.Object {
  /**
    * WorkerPool resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. State of the worker pool.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Specifies the properties, such as machine type and disk size, used for
    * creating workers in a worker pool.
    */
  var workerConfig: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] = js.native
  /**
    * The desired number of workers in the worker pool. Must be a value between
    * 0 and 1000.
    */
  var workerCount: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPoolOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWorkerConfig(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig): Self = this.set("workerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerConfig: Self = this.set("workerConfig", js.undefined)
    @scala.inline
    def setWorkerCount(value: String): Self = this.set("workerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerCount: Self = this.set("workerCount", js.undefined)
  }
  
}

