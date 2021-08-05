package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1EvaluationJob extends StObject {
  
  /**
    * Required. Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and
    * provide its name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
    */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Output only. Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array. */
  var attempts: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Attempt]] = js.undefined
  
  /** Output only. Timestamp of when this evaluation job was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. Description of the job. The description can be up to 25,000 characters long. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. Configuration details for the evaluation job. */
  var evaluationJobConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationJobConfig] = js.undefined
  
  /**
    * Required. Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set
    * this to `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery table, set this to `false`.
    */
  var labelMissingGroundTruth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When
    * creating an evaluation job, specify the model version in the following format: "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one evaluation
    * job per model version.
    */
  var modelVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. After you create a job, Data Labeling Service assigns a name to the job with the following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}" */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval,
    * the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like
    * format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is
    * used, not the specific time of day.
    */
  var schedule: js.UndefOr[String] = js.undefined
  
  /** Output only. Describes the current state of the job. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1EvaluationJob {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1EvaluationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJob]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1EvaluationJob](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setAttempts(value: js.Array[GoogleCloudDatalabelingV1beta1Attempt]): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setAttemptsVarargs(value: GoogleCloudDatalabelingV1beta1Attempt*): Self = StObject.set(x, "attempts", js.Array(value :_*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvaluationJobConfig(value: GoogleCloudDatalabelingV1beta1EvaluationJobConfig): Self = StObject.set(x, "evaluationJobConfig", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobConfigUndefined: Self = StObject.set(x, "evaluationJobConfig", js.undefined)
    
    inline def setLabelMissingGroundTruth(value: Boolean): Self = StObject.set(x, "labelMissingGroundTruth", value.asInstanceOf[js.Any])
    
    inline def setLabelMissingGroundTruthUndefined: Self = StObject.set(x, "labelMissingGroundTruth", js.undefined)
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
