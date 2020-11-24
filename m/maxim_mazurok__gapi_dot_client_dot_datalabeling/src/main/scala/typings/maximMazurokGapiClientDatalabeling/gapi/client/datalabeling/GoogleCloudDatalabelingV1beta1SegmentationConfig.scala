package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SegmentationConfig extends js.Object {
  
  /** Required. Annotation spec set resource name. format: projects/{project_id}/annotationSpecSets/{annotation_spec_set_id} */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Instruction message showed on labelers UI. */
  var instructionMessage: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SegmentationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SegmentationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SegmentationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SegmentationConfigOps[Self <: GoogleCloudDatalabelingV1beta1SegmentationConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSet(value: String): Self = this.set("annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSet: Self = this.set("annotationSpecSet", js.undefined)
    
    @scala.inline
    def setInstructionMessage(value: String): Self = this.set("instructionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructionMessage: Self = this.set("instructionMessage", js.undefined)
  }
}
