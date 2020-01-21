package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkItem represents basic information about a WorkItem to be executed in
  * the cloud.
  */
@js.native
trait SchemaWorkItem extends js.Object {
  /**
    * Work item-specific configuration as an opaque blob.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Identifies this WorkItem.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial index to use when reporting the status of the WorkItem.
    */
  var initialReportIndex: js.UndefOr[String] = js.native
  /**
    * Identifies the workflow job this WorkItem belongs to.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Time when the lease on this Work will expire.
    */
  var leaseExpireTime: js.UndefOr[String] = js.native
  /**
    * Additional information for MapTask WorkItems.
    */
  var mapTask: js.UndefOr[SchemaMapTask] = js.native
  /**
    * Any required packages that need to be fetched in order to execute this
    * WorkItem.
    */
  var packages: js.UndefOr[js.Array[SchemaPackage]] = js.native
  /**
    * Identifies the cloud project this WorkItem belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Recommended reporting interval.
    */
  var reportStatusInterval: js.UndefOr[String] = js.native
  /**
    * Additional information for SeqMapTask WorkItems.
    */
  var seqMapTask: js.UndefOr[SchemaSeqMapTask] = js.native
  /**
    * Additional information for ShellTask WorkItems.
    */
  var shellTask: js.UndefOr[SchemaShellTask] = js.native
  /**
    * Additional information for source operation WorkItems.
    */
  var sourceOperationTask: js.UndefOr[SchemaSourceOperationRequest] = js.native
  /**
    * Additional information for StreamingComputationTask WorkItems.
    */
  var streamingComputationTask: js.UndefOr[SchemaStreamingComputationTask] = js.native
  /**
    * Additional information for StreamingConfigTask WorkItems.
    */
  var streamingConfigTask: js.UndefOr[SchemaStreamingConfigTask] = js.native
  /**
    * Additional information for StreamingSetupTask WorkItems.
    */
  var streamingSetupTask: js.UndefOr[SchemaStreamingSetupTask] = js.native
}

object SchemaWorkItem {
  @scala.inline
  def apply(
    configuration: String = null,
    id: String = null,
    initialReportIndex: String = null,
    jobId: String = null,
    leaseExpireTime: String = null,
    mapTask: SchemaMapTask = null,
    packages: js.Array[SchemaPackage] = null,
    projectId: String = null,
    reportStatusInterval: String = null,
    seqMapTask: SchemaSeqMapTask = null,
    shellTask: SchemaShellTask = null,
    sourceOperationTask: SchemaSourceOperationRequest = null,
    streamingComputationTask: SchemaStreamingComputationTask = null,
    streamingConfigTask: SchemaStreamingConfigTask = null,
    streamingSetupTask: SchemaStreamingSetupTask = null
  ): SchemaWorkItem = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialReportIndex != null) __obj.updateDynamic("initialReportIndex")(initialReportIndex.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (leaseExpireTime != null) __obj.updateDynamic("leaseExpireTime")(leaseExpireTime.asInstanceOf[js.Any])
    if (mapTask != null) __obj.updateDynamic("mapTask")(mapTask.asInstanceOf[js.Any])
    if (packages != null) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (reportStatusInterval != null) __obj.updateDynamic("reportStatusInterval")(reportStatusInterval.asInstanceOf[js.Any])
    if (seqMapTask != null) __obj.updateDynamic("seqMapTask")(seqMapTask.asInstanceOf[js.Any])
    if (shellTask != null) __obj.updateDynamic("shellTask")(shellTask.asInstanceOf[js.Any])
    if (sourceOperationTask != null) __obj.updateDynamic("sourceOperationTask")(sourceOperationTask.asInstanceOf[js.Any])
    if (streamingComputationTask != null) __obj.updateDynamic("streamingComputationTask")(streamingComputationTask.asInstanceOf[js.Any])
    if (streamingConfigTask != null) __obj.updateDynamic("streamingConfigTask")(streamingConfigTask.asInstanceOf[js.Any])
    if (streamingSetupTask != null) __obj.updateDynamic("streamingSetupTask")(streamingSetupTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkItem]
  }
}

