package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1InputConfig extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1InputConfigOps[Self <: GoogleCloudDatalabelingV1beta1InputConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setBigquerySource(value: GoogleCloudDatalabelingV1beta1BigQuerySource): Self = this.set("bigquerySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigquerySource: Self = this.set("bigquerySource", js.undefined)
    
    @scala.inline
    def setClassificationMetadata(value: GoogleCloudDatalabelingV1beta1ClassificationMetadata): Self = this.set("classificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassificationMetadata: Self = this.set("classificationMetadata", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleCloudDatalabelingV1beta1GcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
    
    @scala.inline
    def setTextMetadata(value: GoogleCloudDatalabelingV1beta1TextMetadata): Self = this.set("textMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMetadata: Self = this.set("textMetadata", js.undefined)
  }
}
