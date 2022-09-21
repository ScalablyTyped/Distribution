package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1EvaluationJobConfig extends StObject {
  
  /**
    * Required. Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
    */
  var bigqueryImportKeys: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
    */
  var boundingPolyConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.undefined
  
  /**
    * Required. Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
    */
  var evaluationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig] = js.undefined
  
  /**
    * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
    */
  var evaluationJobAlertConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig] = js.undefined
  
  /**
    * Required. The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
    */
  var exampleCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
    */
  var exampleSamplePercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
    */
  var humanAnnotationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /**
    * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
    */
  var imageClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.undefined
  
  /**
    * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1InputConfig] = js.undefined
  
  /**
    * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
    */
  var textClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1EvaluationJobConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1EvaluationJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1EvaluationJobConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1EvaluationJobConfig](x: Self) {
    
    inline def setBigqueryImportKeys(value: StringDictionary[String]): Self = StObject.set(x, "bigqueryImportKeys", value.asInstanceOf[js.Any])
    
    inline def setBigqueryImportKeysNull: Self = StObject.set(x, "bigqueryImportKeys", null)
    
    inline def setBigqueryImportKeysUndefined: Self = StObject.set(x, "bigqueryImportKeys", js.undefined)
    
    inline def setBoundingPolyConfig(value: SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = StObject.set(x, "boundingPolyConfig", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyConfigUndefined: Self = StObject.set(x, "boundingPolyConfig", js.undefined)
    
    inline def setEvaluationConfig(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig): Self = StObject.set(x, "evaluationConfig", value.asInstanceOf[js.Any])
    
    inline def setEvaluationConfigUndefined: Self = StObject.set(x, "evaluationConfig", js.undefined)
    
    inline def setEvaluationJobAlertConfig(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig): Self = StObject.set(x, "evaluationJobAlertConfig", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobAlertConfigUndefined: Self = StObject.set(x, "evaluationJobAlertConfig", js.undefined)
    
    inline def setExampleCount(value: Double): Self = StObject.set(x, "exampleCount", value.asInstanceOf[js.Any])
    
    inline def setExampleCountNull: Self = StObject.set(x, "exampleCount", null)
    
    inline def setExampleCountUndefined: Self = StObject.set(x, "exampleCount", js.undefined)
    
    inline def setExampleSamplePercentage(value: Double): Self = StObject.set(x, "exampleSamplePercentage", value.asInstanceOf[js.Any])
    
    inline def setExampleSamplePercentageNull: Self = StObject.set(x, "exampleSamplePercentage", null)
    
    inline def setExampleSamplePercentageUndefined: Self = StObject.set(x, "exampleSamplePercentage", js.undefined)
    
    inline def setHumanAnnotationConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "humanAnnotationConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanAnnotationConfigUndefined: Self = StObject.set(x, "humanAnnotationConfig", js.undefined)
    
    inline def setImageClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = StObject.set(x, "imageClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationConfigUndefined: Self = StObject.set(x, "imageClassificationConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudDatalabelingV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setTextClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
  }
}
