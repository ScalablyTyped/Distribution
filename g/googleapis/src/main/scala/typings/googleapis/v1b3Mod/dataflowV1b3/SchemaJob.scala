package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a job to be run by the Cloud Dataflow service.
  */
trait SchemaJob extends StObject {
  
  /**
    * The client&#39;s unique identifier of the job, re-used across retried
    * attempts. If this field is set, the service will ensure its uniqueness.
    * The request to create a job will fail if the service has knowledge of a
    * previously submitted job with the same client&#39;s ID and job name. The
    * caller may use this field to ensure idempotence of job creation across
    * retried attempts to create a job. By default, the field is empty and, in
    * that case, the service ignores it.
    */
  var clientRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the job was initially created. Immutable and set by
    * the Cloud Dataflow service.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * If this is specified, the job&#39;s initial state is populated from the
    * given snapshot.
    */
  var createdFromSnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the job.  Jobs are created in the
    * `JOB_STATE_STOPPED` state unless otherwise specified.  A job in the
    * `JOB_STATE_RUNNING` state may asynchronously enter a terminal state.
    * After a job has reached a terminal state, no further state updates may be
    * made.  This field may be mutated by the Cloud Dataflow service; callers
    * cannot mutate it.
    */
  var currentState: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp associated with the current state.
    */
  var currentStateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The environment for the job.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.undefined
  
  /**
    * Deprecated.
    */
  var executionInfo: js.UndefOr[SchemaJobExecutionInfo] = js.undefined
  
  /**
    * The unique ID of this job.  This field is set by the Cloud Dataflow
    * service when the Job is created, and is immutable for the life of the
    * job.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This field is populated by the Dataflow service to support filtering jobs
    * by the metadata values provided here. Populated for ListJobs and all
    * GetJob views SUMMARY and higher.
    */
  var jobMetadata: js.UndefOr[SchemaJobMetadata] = js.undefined
  
  /**
    * User-defined labels for this job.  The labels map can contain no more
    * than 64 entries.  Entries of the labels map are UTF8 strings that comply
    * with the following restrictions:  * Keys must conform to regexp:
    * \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally
    * constrained to be &lt;= 128 bytes in size.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains this job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The user-specified Cloud Dataflow job name.  Only one Job with a given
    * name may exist in a project at any given time. If a caller attempts to
    * create a Job with the same name as an already-existing Job, the attempt
    * returns the existing Job.  The name must match the regular expression
    * `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Preliminary field: The format of this data may change at any time. A
    * description of the user pipeline and stages through which it is executed.
    * Created by Cloud Dataflow service.  Only retrieved with
    * JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
    */
  var pipelineDescription: js.UndefOr[SchemaPipelineDescription] = js.undefined
  
  /**
    * The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * If this job is an update of an existing job, this field is the job ID of
    * the job it replaced.  When sending a `CreateJobRequest`, you can update a
    * job by specifying it here. The job named here is stopped, and its
    * intermediate state is transferred to this job.
    */
  var replaceJobId: js.UndefOr[String] = js.undefined
  
  /**
    * If another job is an update of this job (and thus, this job is in
    * `JOB_STATE_UPDATED`), this field contains the ID of that job.
    */
  var replacedByJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The job&#39;s requested state.  `UpdateJob` may be used to switch between
    * the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING` states, by setting
    * requested_state.  `UpdateJob` may also be used to directly set a
    * job&#39;s requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`,
    * irrevocably terminating the job if it has not already reached a terminal
    * state.
    */
  var requestedState: js.UndefOr[String] = js.undefined
  
  /**
    * This field may be mutated by the Cloud Dataflow service; callers cannot
    * mutate it.
    */
  var stageStates: js.UndefOr[js.Array[SchemaExecutionStageState]] = js.undefined
  
  /**
    * The timestamp when the job was started (transitioned to
    * JOB_STATE_PENDING). Flexible resource scheduling jobs are started with
    * some delay after job creation, so start_time is unset before start and is
    * updated when the job is started by the Cloud Dataflow service. For other
    * jobs, start_time always equals to create_time and is immutable and set by
    * the Cloud Dataflow service.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Exactly one of step or steps_location should be specified.  The top-level
    * steps that constitute the entire job.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.undefined
  
  /**
    * The GCS location where the steps are stored.
    */
  var stepsLocation: js.UndefOr[String] = js.undefined
  
  /**
    * A set of files the system should be aware of that are used for temporary
    * storage. These temporary files will be removed on job completion. No
    * duplicates are allowed. No file patterns are supported.  The supported
    * files are:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The map of transform name prefixes of the job to be replaced to the
    * corresponding name prefixes of the new job.
    */
  var transformNameMapping: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The type of Cloud Dataflow job.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaJob {
  
  inline def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  extension [Self <: SchemaJob](x: Self) {
    
    inline def setClientRequestId(value: String): Self = StObject.set(x, "clientRequestId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestIdUndefined: Self = StObject.set(x, "clientRequestId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatedFromSnapshotId(value: String): Self = StObject.set(x, "createdFromSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setCreatedFromSnapshotIdUndefined: Self = StObject.set(x, "createdFromSnapshotId", js.undefined)
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateTime(value: String): Self = StObject.set(x, "currentStateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateTimeUndefined: Self = StObject.set(x, "currentStateTime", js.undefined)
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExecutionInfo(value: SchemaJobExecutionInfo): Self = StObject.set(x, "executionInfo", value.asInstanceOf[js.Any])
    
    inline def setExecutionInfoUndefined: Self = StObject.set(x, "executionInfo", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobMetadata(value: SchemaJobMetadata): Self = StObject.set(x, "jobMetadata", value.asInstanceOf[js.Any])
    
    inline def setJobMetadataUndefined: Self = StObject.set(x, "jobMetadata", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPipelineDescription(value: SchemaPipelineDescription): Self = StObject.set(x, "pipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "pipelineDescription", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setReplaceJobId(value: String): Self = StObject.set(x, "replaceJobId", value.asInstanceOf[js.Any])
    
    inline def setReplaceJobIdUndefined: Self = StObject.set(x, "replaceJobId", js.undefined)
    
    inline def setReplacedByJobId(value: String): Self = StObject.set(x, "replacedByJobId", value.asInstanceOf[js.Any])
    
    inline def setReplacedByJobIdUndefined: Self = StObject.set(x, "replacedByJobId", js.undefined)
    
    inline def setRequestedState(value: String): Self = StObject.set(x, "requestedState", value.asInstanceOf[js.Any])
    
    inline def setRequestedStateUndefined: Self = StObject.set(x, "requestedState", js.undefined)
    
    inline def setStageStates(value: js.Array[SchemaExecutionStageState]): Self = StObject.set(x, "stageStates", value.asInstanceOf[js.Any])
    
    inline def setStageStatesUndefined: Self = StObject.set(x, "stageStates", js.undefined)
    
    inline def setStageStatesVarargs(value: SchemaExecutionStageState*): Self = StObject.set(x, "stageStates", js.Array(value :_*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSteps(value: js.Array[SchemaStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsLocation(value: String): Self = StObject.set(x, "stepsLocation", value.asInstanceOf[js.Any])
    
    inline def setStepsLocationUndefined: Self = StObject.set(x, "stepsLocation", js.undefined)
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: SchemaStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setTempFiles(value: js.Array[String]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesUndefined: Self = StObject.set(x, "tempFiles", js.undefined)
    
    inline def setTempFilesVarargs(value: String*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
    
    inline def setTransformNameMapping(value: StringDictionary[String]): Self = StObject.set(x, "transformNameMapping", value.asInstanceOf[js.Any])
    
    inline def setTransformNameMappingUndefined: Self = StObject.set(x, "transformNameMapping", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
