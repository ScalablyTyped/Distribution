package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1BoundingPolyConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Optional. Instruction message showed on contributors UI. */
  var instructionMessage: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1BoundingPolyConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1BoundingPolyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BoundingPolyConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1BoundingPolyConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1BoundingPolyConfig] (val x: Self) extends AnyVal {
    
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
