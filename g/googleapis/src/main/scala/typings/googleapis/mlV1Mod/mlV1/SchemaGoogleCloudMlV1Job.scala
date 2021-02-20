package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a training, prediction or explanation job.
  */
@js.native
trait SchemaGoogleCloudMlV1Job extends StObject {
  
  /**
    * Output only. When the job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. When the job processing was completed.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The details of a failure or a cancellation.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a job from overwriting each other. It is
    * strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform job updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetJob`, and
    * systems are expected to put that etag in the request to `UpdateJob` to
    * ensure that their change will be applied to the same version of the job.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Required. The user-specified id of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * Optional. One or more labels that you can add, to organize your jobs.
    * Each label is a key-value pair, where both the key and the value are
    * arbitrary strings that you supply. For more information, see the
    * documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Input parameters to create a prediction job.
    */
  var predictionInput: js.UndefOr[SchemaGoogleCloudMlV1PredictionInput] = js.native
  
  /**
    * The current prediction job result.
    */
  var predictionOutput: js.UndefOr[SchemaGoogleCloudMlV1PredictionOutput] = js.native
  
  /**
    * Output only. When the job processing was started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The detailed state of a job.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Input parameters to create a training job.
    */
  var trainingInput: js.UndefOr[SchemaGoogleCloudMlV1TrainingInput] = js.native
  
  /**
    * The current training job result.
    */
  var trainingOutput: js.UndefOr[SchemaGoogleCloudMlV1TrainingOutput] = js.native
}
object SchemaGoogleCloudMlV1Job {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Job]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1JobMutableBuilder[Self <: SchemaGoogleCloudMlV1Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPredictionInput(value: SchemaGoogleCloudMlV1PredictionInput): Self = StObject.set(x, "predictionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionInputUndefined: Self = StObject.set(x, "predictionInput", js.undefined)
    
    @scala.inline
    def setPredictionOutput(value: SchemaGoogleCloudMlV1PredictionOutput): Self = StObject.set(x, "predictionOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionOutputUndefined: Self = StObject.set(x, "predictionOutput", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTrainingInput(value: SchemaGoogleCloudMlV1TrainingInput): Self = StObject.set(x, "trainingInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingInputUndefined: Self = StObject.set(x, "trainingInput", js.undefined)
    
    @scala.inline
    def setTrainingOutput(value: SchemaGoogleCloudMlV1TrainingOutput): Self = StObject.set(x, "trainingOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingOutputUndefined: Self = StObject.set(x, "trainingOutput", js.undefined)
  }
}
