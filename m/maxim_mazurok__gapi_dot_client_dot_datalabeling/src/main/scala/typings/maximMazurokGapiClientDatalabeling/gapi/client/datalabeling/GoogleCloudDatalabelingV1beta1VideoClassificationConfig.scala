package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1VideoClassificationConfig extends js.Object {
  
  /**
    * Required. The list of annotation spec set configs. Since watching a video clip takes much longer time than an image, we support label with multiple AnnotationSpecSet at the same
    * time. Labels in each AnnotationSpecSet will be shown in a group to contributors. Contributors can select one or more (depending on whether to allow multi label) from each group.
    */
  var annotationSpecSetConfigs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]] = js.native
  
  /** Optional. Option to apply shot detection on the video. */
  var applyShotDetection: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDatalabelingV1beta1VideoClassificationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoClassificationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoClassificationConfigOps[Self <: GoogleCloudDatalabelingV1beta1VideoClassificationConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSetConfigsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig*): Self = this.set("annotationSpecSetConfigs", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationSpecSetConfigs(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]): Self = this.set("annotationSpecSetConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSetConfigs: Self = this.set("annotationSpecSetConfigs", js.undefined)
    
    @scala.inline
    def setApplyShotDetection(value: Boolean): Self = this.set("applyShotDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyShotDetection: Self = this.set("applyShotDetection", js.undefined)
  }
}
