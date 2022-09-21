package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Job extends StObject {
  
  /**
    * Output only. When the job was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the job processing was completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The details of a failure or a cancellation.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The user-specified id of the job.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. It's only effect when the job is in QUEUED state. If it's positive, it indicates the job's position in the job scheduler. It's 0 when the job is already scheduled.
    */
  var jobPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Input parameters to create a prediction job.
    */
  var predictionInput: js.UndefOr[SchemaGoogleCloudMlV1PredictionInput] = js.undefined
  
  /**
    * The current prediction job result.
    */
  var predictionOutput: js.UndefOr[SchemaGoogleCloudMlV1PredictionOutput] = js.undefined
  
  /**
    * Output only. When the job processing was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The detailed state of a job.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input parameters to create a training job.
    */
  var trainingInput: js.UndefOr[SchemaGoogleCloudMlV1TrainingInput] = js.undefined
  
  /**
    * The current training job result.
    */
  var trainingOutput: js.UndefOr[SchemaGoogleCloudMlV1TrainingOutput] = js.undefined
}
object SchemaGoogleCloudMlV1Job {
  
  inline def apply(): SchemaGoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Job]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1Job](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobPosition(value: String): Self = StObject.set(x, "jobPosition", value.asInstanceOf[js.Any])
    
    inline def setJobPositionNull: Self = StObject.set(x, "jobPosition", null)
    
    inline def setJobPositionUndefined: Self = StObject.set(x, "jobPosition", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPredictionInput(value: SchemaGoogleCloudMlV1PredictionInput): Self = StObject.set(x, "predictionInput", value.asInstanceOf[js.Any])
    
    inline def setPredictionInputUndefined: Self = StObject.set(x, "predictionInput", js.undefined)
    
    inline def setPredictionOutput(value: SchemaGoogleCloudMlV1PredictionOutput): Self = StObject.set(x, "predictionOutput", value.asInstanceOf[js.Any])
    
    inline def setPredictionOutputUndefined: Self = StObject.set(x, "predictionOutput", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrainingInput(value: SchemaGoogleCloudMlV1TrainingInput): Self = StObject.set(x, "trainingInput", value.asInstanceOf[js.Any])
    
    inline def setTrainingInputUndefined: Self = StObject.set(x, "trainingInput", js.undefined)
    
    inline def setTrainingOutput(value: SchemaGoogleCloudMlV1TrainingOutput): Self = StObject.set(x, "trainingOutput", value.asInstanceOf[js.Any])
    
    inline def setTrainingOutputUndefined: Self = StObject.set(x, "trainingOutput", js.undefined)
  }
}
