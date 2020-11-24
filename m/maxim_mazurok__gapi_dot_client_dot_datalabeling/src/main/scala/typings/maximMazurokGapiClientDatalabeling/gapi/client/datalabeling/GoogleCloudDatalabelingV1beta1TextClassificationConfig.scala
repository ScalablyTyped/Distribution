package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1TextClassificationConfig extends js.Object {
  
  /** Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment. */
  var allowMultiLabel: js.UndefOr[Boolean] = js.native
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Optional. Configs for sentiment selection. */
  var sentimentConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1SentimentConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1TextClassificationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextClassificationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextClassificationConfigOps[Self <: GoogleCloudDatalabelingV1beta1TextClassificationConfig] (val x: Self) extends AnyVal {
    
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
    def setSentimentConfig(value: GoogleCloudDatalabelingV1beta1SentimentConfig): Self = this.set("sentimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentConfig: Self = this.set("sentimentConfig", js.undefined)
  }
}
