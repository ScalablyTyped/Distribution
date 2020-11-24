package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse extends js.Object {
  
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ImageAnnotationContext] = js.native
  
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1CropHintsAnnotation] = js.native
  
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1FaceAnnotation]] = js.native
  
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextAnnotation] = js.native
  
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ImageProperties] = js.native
  
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]] = js.native
  
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]] = js.native
  
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation]] = js.native
  
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]] = js.native
  
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ProductSearchResults] = js.native
  
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1SafeSearchAnnotation] = js.native
  
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]] = js.native
  
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1WebDetection] = js.native
}
object SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponseOps[Self <: SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse] (val x: Self) extends AnyVal {
    
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
    def setContext(value: SchemaGoogleCloudVisionV1p2beta1ImageAnnotationContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCropHintsAnnotation(value: SchemaGoogleCloudVisionV1p2beta1CropHintsAnnotation): Self = this.set("cropHintsAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropHintsAnnotation: Self = this.set("cropHintsAnnotation", js.undefined)
    
    @scala.inline
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFaceAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1FaceAnnotation*): Self = this.set("faceAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFaceAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1FaceAnnotation]): Self = this.set("faceAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceAnnotations: Self = this.set("faceAnnotations", js.undefined)
    
    @scala.inline
    def setFullTextAnnotation(value: SchemaGoogleCloudVisionV1p2beta1TextAnnotation): Self = this.set("fullTextAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullTextAnnotation: Self = this.set("fullTextAnnotation", js.undefined)
    
    @scala.inline
    def setImagePropertiesAnnotation(value: SchemaGoogleCloudVisionV1p2beta1ImageProperties): Self = this.set("imagePropertiesAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePropertiesAnnotation: Self = this.set("imagePropertiesAnnotation", js.undefined)
    
    @scala.inline
    def setLabelAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1EntityAnnotation*): Self = this.set("labelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLabelAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]): Self = this.set("labelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAnnotations: Self = this.set("labelAnnotations", js.undefined)
    
    @scala.inline
    def setLandmarkAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1EntityAnnotation*): Self = this.set("landmarkAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLandmarkAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]): Self = this.set("landmarkAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmarkAnnotations: Self = this.set("landmarkAnnotations", js.undefined)
    
    @scala.inline
    def setLocalizedObjectAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation*): Self = this.set("localizedObjectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLocalizedObjectAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation]): Self = this.set("localizedObjectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedObjectAnnotations: Self = this.set("localizedObjectAnnotations", js.undefined)
    
    @scala.inline
    def setLogoAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1EntityAnnotation*): Self = this.set("logoAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLogoAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]): Self = this.set("logoAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoAnnotations: Self = this.set("logoAnnotations", js.undefined)
    
    @scala.inline
    def setProductSearchResults(value: SchemaGoogleCloudVisionV1p2beta1ProductSearchResults): Self = this.set("productSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSearchResults: Self = this.set("productSearchResults", js.undefined)
    
    @scala.inline
    def setSafeSearchAnnotation(value: SchemaGoogleCloudVisionV1p2beta1SafeSearchAnnotation): Self = this.set("safeSearchAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeSearchAnnotation: Self = this.set("safeSearchAnnotation", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p2beta1EntityAnnotation*): Self = this.set("textAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setTextAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p2beta1EntityAnnotation]): Self = this.set("textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnnotations: Self = this.set("textAnnotations", js.undefined)
    
    @scala.inline
    def setWebDetection(value: SchemaGoogleCloudVisionV1p2beta1WebDetection): Self = this.set("webDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebDetection: Self = this.set("webDetection", js.undefined)
  }
}
