package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1PolylineConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Optional. Instruction message showed on contributors UI. */
  var instructionMessage: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1PolylineConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1PolylineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1PolylineConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PolylineConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1PolylineConfig] (val x: Self) extends AnyVal {
    
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
