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
  def apply(
    currentWorkerTime: String = null,
    location: String = null,
    requestedLeaseDuration: String = null,
    unifiedWorkerRequest: StringDictionary[js.Any] = null,
    workItemTypes: js.Array[String] = null,
    workerCapabilities: js.Array[String] = null,
    workerId: String = null
  ): SchemaLeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    if (currentWorkerTime != null) __obj.updateDynamic("currentWorkerTime")(currentWorkerTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (requestedLeaseDuration != null) __obj.updateDynamic("requestedLeaseDuration")(requestedLeaseDuration.asInstanceOf[js.Any])
    if (unifiedWorkerRequest != null) __obj.updateDynamic("unifiedWorkerRequest")(unifiedWorkerRequest.asInstanceOf[js.Any])
    if (workItemTypes != null) __obj.updateDynamic("workItemTypes")(workItemTypes.asInstanceOf[js.Any])
    if (workerCapabilities != null) __obj.updateDynamic("workerCapabilities")(workerCapabilities.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLeaseWorkItemRequest]
  }
}

