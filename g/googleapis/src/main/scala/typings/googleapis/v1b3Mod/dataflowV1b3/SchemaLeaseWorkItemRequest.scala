package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to lease WorkItems.
  */
@js.native
trait SchemaLeaseWorkItemRequest extends js.Object {
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the WorkItem&#39;s job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The initial lease period.
    */
  var requestedLeaseDuration: js.UndefOr[String] = js.native
  /**
    * Untranslated bag-of-bytes WorkRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Filter for WorkItem type.
    */
  var workItemTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific
    * capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies the worker leasing work -- typically the ID of the virtual
    * machine running the worker.
    */
  var workerId: js.UndefOr[String] = js.native
}

object SchemaLeaseWorkItemRequest {
  @scala.inline
  def apply(): SchemaLeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemRequest]
  }
  @scala.inline
  implicit class SchemaLeaseWorkItemRequestOps[Self <: SchemaLeaseWorkItemRequest] (val x: Self) extends AnyVal {
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
    def setCurrentWorkerTime(value: String): Self = this.set("currentWorkerTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentWorkerTime: Self = this.set("currentWorkerTime", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRequestedLeaseDuration(value: String): Self = this.set("requestedLeaseDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedLeaseDuration: Self = this.set("requestedLeaseDuration", js.undefined)
    @scala.inline
    def setUnifiedWorkerRequest(value: StringDictionary[js.Any]): Self = this.set("unifiedWorkerRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnifiedWorkerRequest: Self = this.set("unifiedWorkerRequest", js.undefined)
    @scala.inline
    def setWorkItemTypesVarargs(value: String*): Self = this.set("workItemTypes", js.Array(value :_*))
    @scala.inline
    def setWorkItemTypes(value: js.Array[String]): Self = this.set("workItemTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkItemTypes: Self = this.set("workItemTypes", js.undefined)
    @scala.inline
    def setWorkerCapabilitiesVarargs(value: String*): Self = this.set("workerCapabilities", js.Array(value :_*))
    @scala.inline
    def setWorkerCapabilities(value: js.Array[String]): Self = this.set("workerCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerCapabilities: Self = this.set("workerCapabilities", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

