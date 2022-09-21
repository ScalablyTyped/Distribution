package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1Pipeline extends StObject {
  
  /**
    * Output only. Immutable. The timestamp when the pipeline was initially created. Set by the Data Pipelines service.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of jobs.
    */
  var jobCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Immutable. The timestamp when the pipeline was last modified. Set by the Data Pipelines service.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
    */
  var pipelineSources: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
    */
  var scheduleInfo: js.UndefOr[SchemaGoogleCloudDatapipelinesV1ScheduleSpec] = js.undefined
  
  /**
    * Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
    */
  var schedulerServiceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Workload information for creating new jobs.
    */
  var workload: js.UndefOr[SchemaGoogleCloudDatapipelinesV1Workload] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1Pipeline {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1Pipeline]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1Pipeline](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setJobCount(value: Double): Self = StObject.set(x, "jobCount", value.asInstanceOf[js.Any])
    
    inline def setJobCountNull: Self = StObject.set(x, "jobCount", null)
    
    inline def setJobCountUndefined: Self = StObject.set(x, "jobCount", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPipelineSources(value: StringDictionary[String]): Self = StObject.set(x, "pipelineSources", value.asInstanceOf[js.Any])
    
    inline def setPipelineSourcesNull: Self = StObject.set(x, "pipelineSources", null)
    
    inline def setPipelineSourcesUndefined: Self = StObject.set(x, "pipelineSources", js.undefined)
    
    inline def setScheduleInfo(value: SchemaGoogleCloudDatapipelinesV1ScheduleSpec): Self = StObject.set(x, "scheduleInfo", value.asInstanceOf[js.Any])
    
    inline def setScheduleInfoUndefined: Self = StObject.set(x, "scheduleInfo", js.undefined)
    
    inline def setSchedulerServiceAccountEmail(value: String): Self = StObject.set(x, "schedulerServiceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setSchedulerServiceAccountEmailNull: Self = StObject.set(x, "schedulerServiceAccountEmail", null)
    
    inline def setSchedulerServiceAccountEmailUndefined: Self = StObject.set(x, "schedulerServiceAccountEmail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWorkload(value: SchemaGoogleCloudDatapipelinesV1Workload): Self = StObject.set(x, "workload", value.asInstanceOf[js.Any])
    
    inline def setWorkloadUndefined: Self = StObject.set(x, "workload", js.undefined)
  }
}
