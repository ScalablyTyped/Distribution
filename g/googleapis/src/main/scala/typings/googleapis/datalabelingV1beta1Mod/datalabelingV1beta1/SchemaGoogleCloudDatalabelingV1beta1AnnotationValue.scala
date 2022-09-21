package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1AnnotationValue extends StObject {
  
  /**
    * Annotation value for image bounding box, oriented bounding box and polygon cases.
    */
  var imageBoundingPolyAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation] = js.undefined
  
  /**
    * Annotation value for image classification case.
    */
  var imageClassificationAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation] = js.undefined
  
  /**
    * Annotation value for image polyline cases. Polyline here is different from BoundingPoly. It is formed by line segments connected to each other but not closed form(Bounding Poly). The line segments can cross each other.
    */
  var imagePolylineAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation] = js.undefined
  
  /**
    * Annotation value for image segmentation.
    */
  var imageSegmentationAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation] = js.undefined
  
  /**
    * Annotation value for text classification case.
    */
  var textClassificationAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation] = js.undefined
  
  /**
    * Annotation value for text entity extraction case.
    */
  var textEntityExtractionAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation] = js.undefined
  
  /**
    * Annotation value for video classification case.
    */
  var videoClassificationAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoClassificationAnnotation] = js.undefined
  
  /**
    * Annotation value for video event case.
    */
  var videoEventAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation] = js.undefined
  
  /**
    * Annotation value for video object detection and tracking case.
    */
  var videoObjectTrackingAnnotation: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1AnnotationValue {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1AnnotationValue]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1AnnotationValue](x: Self) {
    
    inline def setImageBoundingPolyAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1ImageBoundingPolyAnnotation): Self = StObject.set(x, "imageBoundingPolyAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImageBoundingPolyAnnotationUndefined: Self = StObject.set(x, "imageBoundingPolyAnnotation", js.undefined)
    
    inline def setImageClassificationAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationAnnotation): Self = StObject.set(x, "imageClassificationAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationAnnotationUndefined: Self = StObject.set(x, "imageClassificationAnnotation", js.undefined)
    
    inline def setImagePolylineAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation): Self = StObject.set(x, "imagePolylineAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImagePolylineAnnotationUndefined: Self = StObject.set(x, "imagePolylineAnnotation", js.undefined)
    
    inline def setImageSegmentationAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation): Self = StObject.set(x, "imageSegmentationAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImageSegmentationAnnotationUndefined: Self = StObject.set(x, "imageSegmentationAnnotation", js.undefined)
    
    inline def setTextClassificationAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1TextClassificationAnnotation): Self = StObject.set(x, "textClassificationAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationAnnotationUndefined: Self = StObject.set(x, "textClassificationAnnotation", js.undefined)
    
    inline def setTextEntityExtractionAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionAnnotation): Self = StObject.set(x, "textEntityExtractionAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionAnnotationUndefined: Self = StObject.set(x, "textEntityExtractionAnnotation", js.undefined)
    
    inline def setVideoClassificationAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1VideoClassificationAnnotation): Self = StObject.set(x, "videoClassificationAnnotation", value.asInstanceOf[js.Any])
    
    inline def setVideoClassificationAnnotationUndefined: Self = StObject.set(x, "videoClassificationAnnotation", js.undefined)
    
    inline def setVideoEventAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1VideoEventAnnotation): Self = StObject.set(x, "videoEventAnnotation", value.asInstanceOf[js.Any])
    
    inline def setVideoEventAnnotationUndefined: Self = StObject.set(x, "videoEventAnnotation", js.undefined)
    
    inline def setVideoObjectTrackingAnnotation(value: SchemaGoogleCloudDatalabelingV1beta1VideoObjectTrackingAnnotation): Self = StObject.set(x, "videoObjectTrackingAnnotation", value.asInstanceOf[js.Any])
    
    inline def setVideoObjectTrackingAnnotationUndefined: Self = StObject.set(x, "videoObjectTrackingAnnotation", js.undefined)
  }
}
