package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2Job extends StObject {
  
  /**
    * KRM-style annotations for the resource. Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects. Cloud Run will populate some annotations using 'run.googleapis.com' or 'serving.knative.dev' namespaces. This field follows Kubernetes annotations' namespacing, limits, and rules. More info: https://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Settings for the Binary Authorization feature.
    */
  var binaryAuthorization: js.UndefOr[SchemaGoogleCloudRunV2BinaryAuthorization] = js.undefined
  
  /**
    * Arbitrary identifier for the API client.
    */
  var client: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Arbitrary version identifier for the API client.
    */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job does not reach its desired state. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Condition]] = js.undefined
  
  /**
    * Output only. The creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Email address of the authenticated creator.
    */
  var creator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The deletion time.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of executions created for this job.
    */
  var executionCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. For a deleted resource, the time after which it will be permamently deleted.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A number that monotonically increases every time the user modifies the desired state.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * KRM-style labels for the resource. User-provided labels are shared with Google's billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev' namespaces. Those labels are read-only, and user changes will not be preserved.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Email address of the last authenticated modifier.
    */
  var lastModifier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the last created execution.
    */
  var latestCreatedExecution: js.UndefOr[SchemaGoogleCloudRunV2ExecutionReference] = js.undefined
  
  /**
    * The launch stage as defined by [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA is assumed.
    */
  var launchStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified name of this Job. Format: projects/{project\}/locations/{location\}/jobs/{job\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The generation of this Job. See comments in `reconciling` for additional information on reconciliation process in Cloud Run.
    */
  var observedGeneration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to the desired state. This process is called reconciliation. While reconciliation is in process, `observed_generation` and `latest_succeeded_execution`, will have transient values that might mismatch the intended state: Once reconciliation is over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job, or there was an error, and reconciliation failed. This state can be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will match: `observed_generation` and `generation`, `latest_succeeded_execution` and `latest_created_execution`. If reconciliation failed, `observed_generation` and `latest_succeeded_execution` will have the state of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in `terminal_condition` and `conditions`.
    */
  var reconciling: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The template used to create executions for this Job.
    */
  var template: js.UndefOr[SchemaGoogleCloudRunV2ExecutionTemplate] = js.undefined
  
  /**
    * Output only. The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the desired state.
    */
  var terminalCondition: js.UndefOr[SchemaGoogleCloudRunV2Condition] = js.undefined
  
  /**
    * Output only. Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last-modified time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2Job {
  
  inline def apply(): SchemaGoogleCloudRunV2Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2Job]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2Job](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setBinaryAuthorization(value: SchemaGoogleCloudRunV2BinaryAuthorization): Self = StObject.set(x, "binaryAuthorization", value.asInstanceOf[js.Any])
    
    inline def setBinaryAuthorizationUndefined: Self = StObject.set(x, "binaryAuthorization", js.undefined)
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientNull: Self = StObject.set(x, "client", null)
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV2Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExecutionCount(value: Double): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
    
    inline def setExecutionCountUndefined: Self = StObject.set(x, "executionCount", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifier(value: String): Self = StObject.set(x, "lastModifier", value.asInstanceOf[js.Any])
    
    inline def setLastModifierNull: Self = StObject.set(x, "lastModifier", null)
    
    inline def setLastModifierUndefined: Self = StObject.set(x, "lastModifier", js.undefined)
    
    inline def setLatestCreatedExecution(value: SchemaGoogleCloudRunV2ExecutionReference): Self = StObject.set(x, "latestCreatedExecution", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedExecutionUndefined: Self = StObject.set(x, "latestCreatedExecution", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageNull: Self = StObject.set(x, "launchStage", null)
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservedGeneration(value: String): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
    
    inline def setReconcilingNull: Self = StObject.set(x, "reconciling", null)
    
    inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
    
    inline def setTemplate(value: SchemaGoogleCloudRunV2ExecutionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTerminalCondition(value: SchemaGoogleCloudRunV2Condition): Self = StObject.set(x, "terminalCondition", value.asInstanceOf[js.Any])
    
    inline def setTerminalConditionUndefined: Self = StObject.set(x, "terminalCondition", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
