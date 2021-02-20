package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation extends StObject {
  
  /** Label of this polyline. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  var normalizedPolyline: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedPolyline] = js.native
  
  var polyline: js.UndefOr[GoogleCloudDatalabelingV1beta1Polyline] = js.native
}
object GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImagePolylineAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setNormalizedPolyline(value: GoogleCloudDatalabelingV1beta1NormalizedPolyline): Self = StObject.set(x, "normalizedPolyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedPolylineUndefined: Self = StObject.set(x, "normalizedPolyline", js.undefined)
    
    @scala.inline
    def setPolyline(value: GoogleCloudDatalabelingV1beta1Polyline): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
  }
}
