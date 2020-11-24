package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImageClassificationConfig extends js.Object {
  
  /** Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one image. */
  var allowMultiLabel: js.UndefOr[Boolean] = js.native
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Optional. The type of how to aggregate answers. */
  var answerAggregationType: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ImageClassificationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImageClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageClassificationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImageClassificationConfigOps[Self <: GoogleCloudDatalabelingV1beta1ImageClassificationConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiLabel(value: Boolean): Self = this.set("allowMultiLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiLabel: Self = this.set("allowMultiLabel", js.undefined)
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = this.set("annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSet: Self = this.set("annotationSpecSet", js.undefined)
    
    @scala.inline
    def setAnswerAggregationType(value: String): Self = this.set("answerAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswerAggregationType: Self = this.set("answerAggregationType", js.undefined)
  }
}
