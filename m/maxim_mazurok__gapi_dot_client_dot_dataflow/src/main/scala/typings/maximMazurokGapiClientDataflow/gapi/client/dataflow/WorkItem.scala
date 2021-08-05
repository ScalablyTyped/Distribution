package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItem extends StObject {
  
  /** Work item-specific configuration as an opaque blob. */
  var configuration: js.UndefOr[String] = js.undefined
  
  /** Identifies this WorkItem. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The initial index to use when reporting the status of the WorkItem. */
  var initialReportIndex: js.UndefOr[String] = js.undefined
  
  /** Identifies the workflow job this WorkItem belongs to. */
  var jobId: js.UndefOr[String] = js.undefined
  
  /** Time when the lease on this Work will expire. */
  var leaseExpireTime: js.UndefOr[String] = js.undefined
  
  /** Additional information for MapTask WorkItems. */
  var mapTask: js.UndefOr[MapTask] = js.undefined
  
  /** Any required packages that need to be fetched in order to execute this WorkItem. */
  var packages: js.UndefOr[js.Array[Package]] = js.undefined
  
  /** Identifies the cloud project this WorkItem belongs to. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[String] = js.undefined
  
  /** Additional information for SeqMapTask WorkItems. */
  var seqMapTask: js.UndefOr[SeqMapTask] = js.undefined
  
  /** Additional information for ShellTask WorkItems. */
  var shellTask: js.UndefOr[ShellTask] = js.undefined
  
  /** Additional information for source operation WorkItems. */
  var sourceOperationTask: js.UndefOr[SourceOperationRequest] = js.undefined
  
  /** Additional information for StreamingComputationTask WorkItems. */
  var streamingComputationTask: js.UndefOr[StreamingComputationTask] = js.undefined
  
  /** Additional information for StreamingConfigTask WorkItems. */
  var streamingConfigTask: js.UndefOr[StreamingConfigTask] = js.undefined
  
  /** Additional information for StreamingSetupTask WorkItems. */
  var streamingSetupTask: js.UndefOr[StreamingSetupTask] = js.undefined
}
object WorkItem {
  
  inline def apply(): WorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItem]
  }
  
  extension [Self <: WorkItem](x: Self) {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialReportIndex(value: String): Self = StObject.set(x, "initialReportIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialReportIndexUndefined: Self = StObject.set(x, "initialReportIndex", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLeaseExpireTime(value: String): Self = StObject.set(x, "leaseExpireTime", value.asInstanceOf[js.Any])
    
    inline def setLeaseExpireTimeUndefined: Self = StObject.set(x, "leaseExpireTime", js.undefined)
    
    inline def setMapTask(value: MapTask): Self = StObject.set(x, "mapTask", value.asInstanceOf[js.Any])
    
    inline def setMapTaskUndefined: Self = StObject.set(x, "mapTask", js.undefined)
    
    inline def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setReportStatusInterval(value: String): Self = StObject.set(x, "reportStatusInterval", value.asInstanceOf[js.Any])
    
    inline def setReportStatusIntervalUndefined: Self = StObject.set(x, "reportStatusInterval", js.undefined)
    
    inline def setSeqMapTask(value: SeqMapTask): Self = StObject.set(x, "seqMapTask", value.asInstanceOf[js.Any])
    
    inline def setSeqMapTaskUndefined: Self = StObject.set(x, "seqMapTask", js.undefined)
    
    inline def setShellTask(value: ShellTask): Self = StObject.set(x, "shellTask", value.asInstanceOf[js.Any])
    
    inline def setShellTaskUndefined: Self = StObject.set(x, "shellTask", js.undefined)
    
    inline def setSourceOperationTask(value: SourceOperationRequest): Self = StObject.set(x, "sourceOperationTask", value.asInstanceOf[js.Any])
    
    inline def setSourceOperationTaskUndefined: Self = StObject.set(x, "sourceOperationTask", js.undefined)
    
    inline def setStreamingComputationTask(value: StreamingComputationTask): Self = StObject.set(x, "streamingComputationTask", value.asInstanceOf[js.Any])
    
    inline def setStreamingComputationTaskUndefined: Self = StObject.set(x, "streamingComputationTask", js.undefined)
    
    inline def setStreamingConfigTask(value: StreamingConfigTask): Self = StObject.set(x, "streamingConfigTask", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigTaskUndefined: Self = StObject.set(x, "streamingConfigTask", js.undefined)
    
    inline def setStreamingSetupTask(value: StreamingSetupTask): Self = StObject.set(x, "streamingSetupTask", value.asInstanceOf[js.Any])
    
    inline def setStreamingSetupTaskUndefined: Self = StObject.set(x, "streamingSetupTask", js.undefined)
  }
}
