package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotationValue extends StObject {
  
  /** Annotation value for image bounding box, oriented bounding box and polygon cases. */
  var imageBoundingPolyAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation] = js.native
  
  /** Annotation value for image classification case. */
  var imageClassificationAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation] = js.native
  
  /**
    * Annotation value for image polyline cases. Polyline here is different from BoundingPoly. It is formed by line segments connected to each other but not closed form(Bounding Poly).
    * The line segments can cross each other.
    */
  var imagePolylineAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation] = js.native
  
  /** Annotation value for image segmentation. */
  var imageSegmentationAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation] = js.native
  
  /** Annotation value for text classification case. */
  var textClassificationAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1TextClassificationAnnotation] = js.native
  
  /** Annotation value for text entity extraction case. */
  var textEntityExtractionAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation] = js.native
  
  /** Annotation value for video classification case. */
  var videoClassificationAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation] = js.native
  
  /** Annotation value for video event case. */
  var videoEventAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoEventAnnotation] = js.native
  
  /** Annotation value for video object detection and tracking case. */
  var videoObjectTrackingAnnotation: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotationValue {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationValueMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBoundingPolyAnnotation(value: GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation): Self = StObject.set(x, "imageBoundingPolyAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBoundingPolyAnnotationUndefined: Self = StObject.set(x, "imageBoundingPolyAnnotation", js.undefined)
    
    @scala.inline
    def setImageClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation): Self = StObject.set(x, "imageClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassificationAnnotationUndefined: Self = StObject.set(x, "imageClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setImagePolylineAnnotation(value: GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation): Self = StObject.set(x, "imagePolylineAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePolylineAnnotationUndefined: Self = StObject.set(x, "imagePolylineAnnotation", js.undefined)
    
    @scala.inline
    def setImageSegmentationAnnotation(value: GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation): Self = StObject.set(x, "imageSegmentationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSegmentationAnnotationUndefined: Self = StObject.set(x, "imageSegmentationAnnotation", js.undefined)
    
    @scala.inline
    def setTextClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1TextClassificationAnnotation): Self = StObject.set(x, "textClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClassificationAnnotationUndefined: Self = StObject.set(x, "textClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionAnnotation(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation): Self = StObject.set(x, "textEntityExtractionAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEntityExtractionAnnotationUndefined: Self = StObject.set(x, "textEntityExtractionAnnotation", js.undefined)
    
    @scala.inline
    def setVideoClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation): Self = StObject.set(x, "videoClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClassificationAnnotationUndefined: Self = StObject.set(x, "videoClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setVideoEventAnnotation(value: GoogleCloudDatalabelingV1beta1VideoEventAnnotation): Self = StObject.set(x, "videoEventAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEventAnnotationUndefined: Self = StObject.set(x, "videoEventAnnotation", js.undefined)
    
    @scala.inline
    def setVideoObjectTrackingAnnotation(value: GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation): Self = StObject.set(x, "videoObjectTrackingAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoObjectTrackingAnnotationUndefined: Self = StObject.set(x, "videoObjectTrackingAnnotation", js.undefined)
  }
}
