package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest extends StObject {
  
  /** Required. Annotation spec set to create. Annotation specs must be included. Only one annotation spec will be accepted for annotation specs with same display_name. */
  var annotationSpecSet: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.undefined
}
object GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSet(value: GoogleCloudDatalabelingV1beta1AnnotationSpecSet): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
