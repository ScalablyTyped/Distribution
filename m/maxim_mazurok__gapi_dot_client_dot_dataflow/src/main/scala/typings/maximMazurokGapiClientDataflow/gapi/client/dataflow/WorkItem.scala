package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItem extends js.Object {
  
  /** Work item-specific configuration as an opaque blob. */
  var configuration: js.UndefOr[String] = js.native
  
  /** Identifies this WorkItem. */
  var id: js.UndefOr[String] = js.native
  
  /** The initial index to use when reporting the status of the WorkItem. */
  var initialReportIndex: js.UndefOr[String] = js.native
  
  /** Identifies the workflow job this WorkItem belongs to. */
  var jobId: js.UndefOr[String] = js.native
  
  /** Time when the lease on this Work will expire. */
  var leaseExpireTime: js.UndefOr[String] = js.native
  
  /** Additional information for MapTask WorkItems. */
  var mapTask: js.UndefOr[MapTask] = js.native
  
  /** Any required packages that need to be fetched in order to execute this WorkItem. */
  var packages: js.UndefOr[js.Array[Package]] = js.native
  
  /** Identifies the cloud project this WorkItem belongs to. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[String] = js.native
  
  /** Additional information for SeqMapTask WorkItems. */
  var seqMapTask: js.UndefOr[SeqMapTask] = js.native
  
  /** Additional information for ShellTask WorkItems. */
  var shellTask: js.UndefOr[ShellTask] = js.native
  
  /** Additional information for source operation WorkItems. */
  var sourceOperationTask: js.UndefOr[SourceOperationRequest] = js.native
  
  /** Additional information for StreamingComputationTask WorkItems. */
  var streamingComputationTask: js.UndefOr[StreamingComputationTask] = js.native
  
  /** Additional information for StreamingConfigTask WorkItems. */
  var streamingConfigTask: js.UndefOr[StreamingConfigTask] = js.native
  
  /** Additional information for StreamingSetupTask WorkItems. */
  var streamingSetupTask: js.UndefOr[StreamingSetupTask] = js.native
}
object WorkItem {
  
  @scala.inline
  def apply(): WorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitialReportIndex(value: String): Self = this.set("initialReportIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialReportIndex: Self = this.set("initialReportIndex", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLeaseExpireTime(value: String): Self = this.set("leaseExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseExpireTime: Self = this.set("leaseExpireTime", js.undefined)
    
    @scala.inline
    def setMapTask(value: MapTask): Self = this.set("mapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapTask: Self = this.set("mapTask", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = this.set("packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setReportStatusInterval(value: String): Self = this.set("reportStatusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportStatusInterval: Self = this.set("reportStatusInterval", js.undefined)
    
    @scala.inline
    def setSeqMapTask(value: SeqMapTask): Self = this.set("seqMapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeqMapTask: Self = this.set("seqMapTask", js.undefined)
    
    @scala.inline
    def setShellTask(value: ShellTask): Self = this.set("shellTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShellTask: Self = this.set("shellTask", js.undefined)
    
    @scala.inline
    def setSourceOperationTask(value: SourceOperationRequest): Self = this.set("sourceOperationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceOperationTask: Self = this.set("sourceOperationTask", js.undefined)
    
    @scala.inline
    def setStreamingComputationTask(value: StreamingComputationTask): Self = this.set("streamingComputationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingComputationTask: Self = this.set("streamingComputationTask", js.undefined)
    
    @scala.inline
    def setStreamingConfigTask(value: StreamingConfigTask): Self = this.set("streamingConfigTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingConfigTask: Self = this.set("streamingConfigTask", js.undefined)
    
    @scala.inline
    def setStreamingSetupTask(value: StreamingSetupTask): Self = this.set("streamingSetupTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingSetupTask: Self = this.set("streamingSetupTask", js.undefined)
  }
}
