package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJob extends StObject {
  
  /**
    * The configuration for this job.
    */
  var config: js.UndefOr[SchemaJobConfig] = js.undefined
  
  /**
    * Output only. The time the job was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the transcoding finished.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An error object that describes the reason for the failure. This property is always present when `state` is `FAILED`.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
    */
  var inputUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels associated with this job. You can use these to organize and group your jobs.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The resource name of the job. Format: `projects/{project_number\}/locations/{location\}/jobs/{job\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example, `gs://my-bucket/outputs/`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
    */
  var outputUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the transcoding started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the job.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id\}` - User defined JobTemplate: `{job_template_id\}`
    */
  var templateId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Job time to live value in days, which will be effective after job completion. Job should be deleted automatically after the given TTL. Enter a value between 1 and 90. The default is 30.
    */
  var ttlAfterCompletionDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaJob {
  
  inline def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  extension [Self <: SchemaJob](x: Self) {
    
    inline def setConfig(value: SchemaJobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriNull: Self = StObject.set(x, "inputUri", null)
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriNull: Self = StObject.set(x, "outputUri", null)
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTtlAfterCompletionDays(value: Double): Self = StObject.set(x, "ttlAfterCompletionDays", value.asInstanceOf[js.Any])
    
    inline def setTtlAfterCompletionDaysNull: Self = StObject.set(x, "ttlAfterCompletionDays", null)
    
    inline def setTtlAfterCompletionDaysUndefined: Self = StObject.set(x, "ttlAfterCompletionDays", js.undefined)
  }
}
