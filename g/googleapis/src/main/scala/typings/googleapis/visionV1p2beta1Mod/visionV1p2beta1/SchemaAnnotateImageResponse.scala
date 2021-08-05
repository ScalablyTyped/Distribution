package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an image annotation request.
  */
trait SchemaAnnotateImageResponse extends StObject {
  
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[SchemaImageAnnotationContext] = js.undefined
  
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[SchemaCropHintsAnnotation] = js.undefined
  
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[SchemaFaceAnnotation]] = js.undefined
  
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[SchemaTextAnnotation] = js.undefined
  
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[SchemaImageProperties] = js.undefined
  
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.undefined
  
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.undefined
  
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[SchemaLocalizedObjectAnnotation]] = js.undefined
  
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.undefined
  
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[SchemaProductSearchResults] = js.undefined
  
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[SchemaSafeSearchAnnotation] = js.undefined
  
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.undefined
  
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[SchemaWebDetection] = js.undefined
}
object SchemaAnnotateImageResponse {
  
  inline def apply(): SchemaAnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateImageResponse]
  }
  
  extension [Self <: SchemaAnnotateImageResponse](x: Self) {
    
    inline def setContext(value: SchemaImageAnnotationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCropHintsAnnotation(value: SchemaCropHintsAnnotation): Self = StObject.set(x, "cropHintsAnnotation", value.asInstanceOf[js.Any])
    
    inline def setCropHintsAnnotationUndefined: Self = StObject.set(x, "cropHintsAnnotation", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFaceAnnotations(value: js.Array[SchemaFaceAnnotation]): Self = StObject.set(x, "faceAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFaceAnnotationsUndefined: Self = StObject.set(x, "faceAnnotations", js.undefined)
    
    inline def setFaceAnnotationsVarargs(value: SchemaFaceAnnotation*): Self = StObject.set(x, "faceAnnotations", js.Array(value :_*))
    
    inline def setFullTextAnnotation(value: SchemaTextAnnotation): Self = StObject.set(x, "fullTextAnnotation", value.asInstanceOf[js.Any])
    
    inline def setFullTextAnnotationUndefined: Self = StObject.set(x, "fullTextAnnotation", js.undefined)
    
    inline def setImagePropertiesAnnotation(value: SchemaImageProperties): Self = StObject.set(x, "imagePropertiesAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesAnnotationUndefined: Self = StObject.set(x, "imagePropertiesAnnotation", js.undefined)
    
    inline def setLabelAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = StObject.set(x, "labelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLabelAnnotationsUndefined: Self = StObject.set(x, "labelAnnotations", js.undefined)
    
    inline def setLabelAnnotationsVarargs(value: SchemaEntityAnnotation*): Self = StObject.set(x, "labelAnnotations", js.Array(value :_*))
    
    inline def setLandmarkAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = StObject.set(x, "landmarkAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLandmarkAnnotationsUndefined: Self = StObject.set(x, "landmarkAnnotations", js.undefined)
    
    inline def setLandmarkAnnotationsVarargs(value: SchemaEntityAnnotation*): Self = StObject.set(x, "landmarkAnnotations", js.Array(value :_*))
    
    inline def setLocalizedObjectAnnotations(value: js.Array[SchemaLocalizedObjectAnnotation]): Self = StObject.set(x, "localizedObjectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLocalizedObjectAnnotationsUndefined: Self = StObject.set(x, "localizedObjectAnnotations", js.undefined)
    
    inline def setLocalizedObjectAnnotationsVarargs(value: SchemaLocalizedObjectAnnotation*): Self = StObject.set(x, "localizedObjectAnnotations", js.Array(value :_*))
    
    inline def setLogoAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = StObject.set(x, "logoAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLogoAnnotationsUndefined: Self = StObject.set(x, "logoAnnotations", js.undefined)
    
    inline def setLogoAnnotationsVarargs(value: SchemaEntityAnnotation*): Self = StObject.set(x, "logoAnnotations", js.Array(value :_*))
    
    inline def setProductSearchResults(value: SchemaProductSearchResults): Self = StObject.set(x, "productSearchResults", value.asInstanceOf[js.Any])
    
    inline def setProductSearchResultsUndefined: Self = StObject.set(x, "productSearchResults", js.undefined)
    
    inline def setSafeSearchAnnotation(value: SchemaSafeSearchAnnotation): Self = StObject.set(x, "safeSearchAnnotation", value.asInstanceOf[js.Any])
    
    inline def setSafeSearchAnnotationUndefined: Self = StObject.set(x, "safeSearchAnnotation", js.undefined)
    
    inline def setTextAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    inline def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    inline def setTextAnnotationsVarargs(value: SchemaEntityAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value :_*))
    
    inline def setWebDetection(value: SchemaWebDetection): Self = StObject.set(x, "webDetection", value.asInstanceOf[js.Any])
    
    inline def setWebDetectionUndefined: Self = StObject.set(x, "webDetection", js.undefined)
  }
}
