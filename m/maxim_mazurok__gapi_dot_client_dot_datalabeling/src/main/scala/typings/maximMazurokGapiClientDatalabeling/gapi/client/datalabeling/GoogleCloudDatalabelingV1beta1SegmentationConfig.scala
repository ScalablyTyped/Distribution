package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SegmentationConfig extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1SegmentationConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SegmentationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    @scala.inline
    def setInstructionMessage(value: String): Self = StObject.set(x, "instructionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionMessageUndefined: Self = StObject.set(x, "instructionMessage", js.undefined)
  }
}
