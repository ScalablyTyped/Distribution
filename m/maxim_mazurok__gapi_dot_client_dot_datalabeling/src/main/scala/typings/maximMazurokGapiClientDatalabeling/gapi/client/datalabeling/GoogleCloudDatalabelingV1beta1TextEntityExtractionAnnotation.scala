package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation extends StObject {
  
  /** Label of the text entities. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** Position of the entity. */
  var sequentialSegment: js.UndefOr[GoogleCloudDatalabelingV1beta1SequentialSegment] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setSequentialSegment(value: GoogleCloudDatalabelingV1beta1SequentialSegment): Self = StObject.set(x, "sequentialSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequentialSegmentUndefined: Self = StObject.set(x, "sequentialSegment", js.undefined)
  }
}
