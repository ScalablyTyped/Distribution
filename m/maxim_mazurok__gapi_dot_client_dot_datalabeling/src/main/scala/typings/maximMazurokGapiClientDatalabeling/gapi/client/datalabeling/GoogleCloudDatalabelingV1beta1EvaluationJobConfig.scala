package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EvaluationJobConfig extends js.Object {
  
  /**
    * Required. Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from
    * your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide
    * the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data
    * reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`:
    * the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection.
    * Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
    */
  var bigqueryImportKeys: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1EvaluationJobConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match
    * EvaluationJob.annotationSpecSet.
    */
  var boundingPolyConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.native
  
  /**
    * Required. Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the
    * `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
    */
  var evaluationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationConfig] = js.native
  
  /**
    * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean
    * average precision during a run.
    */
  var evaluationJobAlertConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig] = js.native
  
  /**
    * Required. The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has
    * not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
    */
  var exampleCount: js.UndefOr[Double] = js.native
  
  /**
    * Required. Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to
    * BigQuery.
    */
  var exampleSamplePercentage: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide
    * your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource
    * in the `instruction` field within this configuration.
    */
  var humanAnnotationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
  
  /**
    * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match
    * EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
    */
  var imageClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.native
  
  /**
    * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or
    * `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or
    * `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You
    * must specify `bigquerySource` (not `gcsSource`).
    */
  var inputConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1InputConfig] = js.native
  
  /**
    * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in
    * this configuration must match `classificationMetadata.isMultiLabel` in input_config.
    */
  var textClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1EvaluationJobConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJobConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationJobConfigOps[Self <: GoogleCloudDatalabelingV1beta1EvaluationJobConfig] (val x: Self) extends AnyVal {
    
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
    def setBigqueryImportKeys(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1EvaluationJobConfig with TopLevel[js.Any]
    ): Self = this.set("bigqueryImportKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryImportKeys: Self = this.set("bigqueryImportKeys", js.undefined)
    
    @scala.inline
    def setBoundingPolyConfig(value: GoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = this.set("boundingPolyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPolyConfig: Self = this.set("boundingPolyConfig", js.undefined)
    
    @scala.inline
    def setEvaluationConfig(value: GoogleCloudDatalabelingV1beta1EvaluationConfig): Self = this.set("evaluationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationConfig: Self = this.set("evaluationConfig", js.undefined)
    
    @scala.inline
    def setEvaluationJobAlertConfig(value: GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig): Self = this.set("evaluationJobAlertConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationJobAlertConfig: Self = this.set("evaluationJobAlertConfig", js.undefined)
    
    @scala.inline
    def setExampleCount(value: Double): Self = this.set("exampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleCount: Self = this.set("exampleCount", js.undefined)
    
    @scala.inline
    def setExampleSamplePercentage(value: Double): Self = this.set("exampleSamplePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleSamplePercentage: Self = this.set("exampleSamplePercentage", js.undefined)
    
    @scala.inline
    def setHumanAnnotationConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = this.set("humanAnnotationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanAnnotationConfig: Self = this.set("humanAnnotationConfig", js.undefined)
    
    @scala.inline
    def setImageClassificationConfig(value: GoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = this.set("imageClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassificationConfig: Self = this.set("imageClassificationConfig", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GoogleCloudDatalabelingV1beta1InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = this.set("textClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassificationConfig: Self = this.set("textClassificationConfig", js.undefined)
  }
}
