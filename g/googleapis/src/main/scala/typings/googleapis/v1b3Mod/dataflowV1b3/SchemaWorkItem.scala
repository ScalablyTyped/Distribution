package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkItem represents basic information about a WorkItem to be executed in
  * the cloud.
  */
trait SchemaWorkItem extends StObject {
  
  /**
    * Work item-specific configuration as an opaque blob.
    */
  var configuration: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies this WorkItem.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The initial index to use when reporting the status of the WorkItem.
    */
  var initialReportIndex: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the workflow job this WorkItem belongs to.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * Time when the lease on this Work will expire.
    */
  var leaseExpireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information for MapTask WorkItems.
    */
  var mapTask: js.UndefOr[SchemaMapTask] = js.undefined
  
  /**
    * Any required packages that need to be fetched in order to execute this
    * WorkItem.
    */
  var packages: js.UndefOr[js.Array[SchemaPackage]] = js.undefined
  
  /**
    * Identifies the cloud project this WorkItem belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Recommended reporting interval.
    */
  var reportStatusInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information for SeqMapTask WorkItems.
    */
  var seqMapTask: js.UndefOr[SchemaSeqMapTask] = js.undefined
  
  /**
    * Additional information for ShellTask WorkItems.
    */
  var shellTask: js.UndefOr[SchemaShellTask] = js.undefined
  
  /**
    * Additional information for source operation WorkItems.
    */
  var sourceOperationTask: js.UndefOr[SchemaSourceOperationRequest] = js.undefined
  
  /**
    * Additional information for StreamingComputationTask WorkItems.
    */
  var streamingComputationTask: js.UndefOr[SchemaStreamingComputationTask] = js.undefined
  
  /**
    * Additional information for StreamingConfigTask WorkItems.
    */
  var streamingConfigTask: js.UndefOr[SchemaStreamingConfigTask] = js.undefined
  
  /**
    * Additional information for StreamingSetupTask WorkItems.
    */
  var streamingSetupTask: js.UndefOr[SchemaStreamingSetupTask] = js.undefined
}
object SchemaWorkItem {
  
  @scala.inline
  def apply(): SchemaWorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkItem]
  }
  
  @scala.inline
  implicit class SchemaWorkItemMutableBuilder[Self <: SchemaWorkItem] (val x: Self) extends AnyVal {
    
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
    def setMapTask(value: SchemaMapTask): Self = StObject.set(x, "mapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTaskUndefined: Self = StObject.set(x, "mapTask", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Array[SchemaPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: SchemaPackage*): Self = StObject.set(x, "packages", js.Array(value :_*))
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setReportStatusInterval(value: String): Self = StObject.set(x, "reportStatusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportStatusIntervalUndefined: Self = StObject.set(x, "reportStatusInterval", js.undefined)
    
    @scala.inline
    def setSeqMapTask(value: SchemaSeqMapTask): Self = StObject.set(x, "seqMapTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqMapTaskUndefined: Self = StObject.set(x, "seqMapTask", js.undefined)
    
    @scala.inline
    def setShellTask(value: SchemaShellTask): Self = StObject.set(x, "shellTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellTaskUndefined: Self = StObject.set(x, "shellTask", js.undefined)
    
    @scala.inline
    def setSourceOperationTask(value: SchemaSourceOperationRequest): Self = StObject.set(x, "sourceOperationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOperationTaskUndefined: Self = StObject.set(x, "sourceOperationTask", js.undefined)
    
    @scala.inline
    def setStreamingComputationTask(value: SchemaStreamingComputationTask): Self = StObject.set(x, "streamingComputationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingComputationTaskUndefined: Self = StObject.set(x, "streamingComputationTask", js.undefined)
    
    @scala.inline
    def setStreamingConfigTask(value: SchemaStreamingConfigTask): Self = StObject.set(x, "streamingConfigTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingConfigTaskUndefined: Self = StObject.set(x, "streamingConfigTask", js.undefined)
    
    @scala.inline
    def setStreamingSetupTask(value: SchemaStreamingSetupTask): Self = StObject.set(x, "streamingSetupTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingSetupTaskUndefined: Self = StObject.set(x, "streamingSetupTask", js.undefined)
  }
}
