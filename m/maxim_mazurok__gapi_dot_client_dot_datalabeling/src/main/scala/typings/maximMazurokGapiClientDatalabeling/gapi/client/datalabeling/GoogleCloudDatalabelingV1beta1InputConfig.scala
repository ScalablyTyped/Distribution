package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1InputConfig extends StObject {
  
  /** Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob. */
  var annotationType: js.UndefOr[String] = js.native
  
  /** Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob. */
  var bigquerySource: js.UndefOr[GoogleCloudDatalabelingV1beta1BigQuerySource] = js.native
  
  /**
    * Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs
    * classification.
    */
  var classificationMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1ClassificationMetadata] = js.native
  
  /** Required. Data type must be specifed when user tries to import data. */
  var dataType: js.UndefOr[String] = js.native
  
  /** Source located in Cloud Storage. */
  var gcsSource: js.UndefOr[GoogleCloudDatalabelingV1beta1GcsSource] = js.native
  
  /** Required for text import, as language code must be specified. */
  var textMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1TextMetadata] = js.native
}
object GoogleCloudDatalabelingV1beta1InputConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1InputConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1InputConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1InputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    @scala.inline
    def setBigquerySource(value: GoogleCloudDatalabelingV1beta1BigQuerySource): Self = StObject.set(x, "bigquerySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigquerySourceUndefined: Self = StObject.set(x, "bigquerySource", js.undefined)
    
    @scala.inline
    def setClassificationMetadata(value: GoogleCloudDatalabelingV1beta1ClassificationMetadata): Self = StObject.set(x, "classificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationMetadataUndefined: Self = StObject.set(x, "classificationMetadata", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleCloudDatalabelingV1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    @scala.inline
    def setTextMetadata(value: GoogleCloudDatalabelingV1beta1TextMetadata): Self = StObject.set(x, "textMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMetadataUndefined: Self = StObject.set(x, "textMetadata", js.undefined)
  }
}
