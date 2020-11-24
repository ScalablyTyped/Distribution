package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EvaluationJob extends js.Object {
  
  /**
    * Required. Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and
    * provide its name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
    */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Output only. Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array. */
  var attempts: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Attempt]] = js.native
  
  /** Output only. Timestamp of when this evaluation job was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Required. Description of the job. The description can be up to 25,000 characters long. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. Configuration details for the evaluation job. */
  var evaluationJobConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationJobConfig] = js.native
  
  /**
    * Required. Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set
    * this to `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery table, set this to `false`.
    */
  var labelMissingGroundTruth: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When
    * creating an evaluation job, specify the model version in the following format: "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one evaluation
    * job per model version.
    */
  var modelVersion: js.UndefOr[String] = js.native
  
  /** Output only. After you create a job, Data Labeling Service assigns a name to the job with the following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}" */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required. Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval,
    * the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like
    * format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is
    * used, not the specific time of day.
    */
  var schedule: js.UndefOr[String] = js.native
  
  /** Output only. Describes the current state of the job. */
  var state: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1EvaluationJob {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJob]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationJobOps[Self <: GoogleCloudDatalabelingV1beta1EvaluationJob] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSet(value: String): Self = this.set("annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSet: Self = this.set("annotationSpecSet", js.undefined)
    
    @scala.inline
    def setAttemptsVarargs(value: GoogleCloudDatalabelingV1beta1Attempt*): Self = this.set("attempts", js.Array(value :_*))
    
    @scala.inline
    def setAttempts(value: js.Array[GoogleCloudDatalabelingV1beta1Attempt]): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEvaluationJobConfig(value: GoogleCloudDatalabelingV1beta1EvaluationJobConfig): Self = this.set("evaluationJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationJobConfig: Self = this.set("evaluationJobConfig", js.undefined)
    
    @scala.inline
    def setLabelMissingGroundTruth(value: Boolean): Self = this.set("labelMissingGroundTruth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMissingGroundTruth: Self = this.set("labelMissingGroundTruth", js.undefined)
    
    @scala.inline
    def setModelVersion(value: String): Self = this.set("modelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersion: Self = this.set("modelVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
