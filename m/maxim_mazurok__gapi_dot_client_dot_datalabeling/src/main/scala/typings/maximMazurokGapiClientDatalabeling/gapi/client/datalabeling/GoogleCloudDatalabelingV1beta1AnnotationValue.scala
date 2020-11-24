package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotationValue extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1AnnotationValueOps[Self <: GoogleCloudDatalabelingV1beta1AnnotationValue] (val x: Self) extends AnyVal {
    
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
    def setImageBoundingPolyAnnotation(value: GoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation): Self = this.set("imageBoundingPolyAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBoundingPolyAnnotation: Self = this.set("imageBoundingPolyAnnotation", js.undefined)
    
    @scala.inline
    def setImageClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1ImageClassificationAnnotation): Self = this.set("imageClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassificationAnnotation: Self = this.set("imageClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setImagePolylineAnnotation(value: GoogleCloudDatalabelingV1beta1ImagePolylineAnnotation): Self = this.set("imagePolylineAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePolylineAnnotation: Self = this.set("imagePolylineAnnotation", js.undefined)
    
    @scala.inline
    def setImageSegmentationAnnotation(value: GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation): Self = this.set("imageSegmentationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSegmentationAnnotation: Self = this.set("imageSegmentationAnnotation", js.undefined)
    
    @scala.inline
    def setTextClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1TextClassificationAnnotation): Self = this.set("textClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassificationAnnotation: Self = this.set("textClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionAnnotation(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation): Self = this.set("textEntityExtractionAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEntityExtractionAnnotation: Self = this.set("textEntityExtractionAnnotation", js.undefined)
    
    @scala.inline
    def setVideoClassificationAnnotation(value: GoogleCloudDatalabelingV1beta1VideoClassificationAnnotation): Self = this.set("videoClassificationAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoClassificationAnnotation: Self = this.set("videoClassificationAnnotation", js.undefined)
    
    @scala.inline
    def setVideoEventAnnotation(value: GoogleCloudDatalabelingV1beta1VideoEventAnnotation): Self = this.set("videoEventAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoEventAnnotation: Self = this.set("videoEventAnnotation", js.undefined)
    
    @scala.inline
    def setVideoObjectTrackingAnnotation(value: GoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation): Self = this.set("videoObjectTrackingAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoObjectTrackingAnnotation: Self = this.set("videoObjectTrackingAnnotation", js.undefined)
  }
}
