package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation extends StObject {
  
  /** Label of object in this bounding polygon. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  var boundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPoly] = js.native
  
  var normalizedBoundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] = js.native
}
object GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudDatalabelingV1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingPoly(value: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly): Self = StObject.set(x, "normalizedBoundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingPolyUndefined: Self = StObject.set(x, "normalizedBoundingPoly", js.undefined)
  }
}
