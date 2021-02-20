package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItem extends StObject {
  
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
  implicit class WorkItemMutableBuilder[Self <: WorkItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitialReportIndex(value: String): Self = StObject.set(x, "initialReportIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialReportIndexUndefined: Self = StObject.set(x, "initialReportIndex", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLeaseExpireTime(value: String): Self = StObject.set(x, "leaseExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseExpireTimeUndefined: Self = StObject.set(x, "leaseExpireTime", js.undefined)
    
    @scala.inline
    def setMapTask(value: MapTask): Self = StObject.set(x, "mapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTaskUndefined: Self = StObject.set(x, "mapTask", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setReportStatusInterval(value: String): Self = StObject.set(x, "reportStatusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportStatusIntervalUndefined: Self = StObject.set(x, "reportStatusInterval", js.undefined)
    
    @scala.inline
    def setSeqMapTask(value: SeqMapTask): Self = StObject.set(x, "seqMapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqMapTaskUndefined: Self = StObject.set(x, "seqMapTask", js.undefined)
    
    @scala.inline
    def setShellTask(value: ShellTask): Self = StObject.set(x, "shellTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellTaskUndefined: Self = StObject.set(x, "shellTask", js.undefined)
    
    @scala.inline
    def setSourceOperationTask(value: SourceOperationRequest): Self = StObject.set(x, "sourceOperationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOperationTaskUndefined: Self = StObject.set(x, "sourceOperationTask", js.undefined)
    
    @scala.inline
    def setStreamingComputationTask(value: StreamingComputationTask): Self = StObject.set(x, "streamingComputationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingComputationTaskUndefined: Self = StObject.set(x, "streamingComputationTask", js.undefined)
    
    @scala.inline
    def setStreamingConfigTask(value: StreamingConfigTask): Self = StObject.set(x, "streamingConfigTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingConfigTaskUndefined: Self = StObject.set(x, "streamingConfigTask", js.undefined)
    
    @scala.inline
    def setStreamingSetupTask(value: StreamingSetupTask): Self = StObject.set(x, "streamingSetupTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingSetupTaskUndefined: Self = StObject.set(x, "streamingSetupTask", js.undefined)
  }
}
