package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an image annotation request.
  */
@js.native
trait SchemaAnnotateImageResponse extends js.Object {
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[SchemaImageAnnotationContext] = js.native
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[SchemaCropHintsAnnotation] = js.native
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[SchemaFaceAnnotation]] = js.native
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[SchemaTextAnnotation] = js.native
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[SchemaLocalizedObjectAnnotation]] = js.native
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[SchemaProductSearchResults] = js.native
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[SchemaSafeSearchAnnotation] = js.native
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[SchemaWebDetection] = js.native
}

object SchemaAnnotateImageResponse {
  @scala.inline
  def apply(
    context: SchemaImageAnnotationContext = null,
    cropHintsAnnotation: SchemaCropHintsAnnotation = null,
    error: SchemaStatus = null,
    faceAnnotations: js.Array[SchemaFaceAnnotation] = null,
    fullTextAnnotation: SchemaTextAnnotation = null,
    imagePropertiesAnnotation: SchemaImageProperties = null,
    labelAnnotations: js.Array[SchemaEntityAnnotation] = null,
    landmarkAnnotations: js.Array[SchemaEntityAnnotation] = null,
    localizedObjectAnnotations: js.Array[SchemaLocalizedObjectAnnotation] = null,
    logoAnnotations: js.Array[SchemaEntityAnnotation] = null,
    productSearchResults: SchemaProductSearchResults = null,
    safeSearchAnnotation: SchemaSafeSearchAnnotation = null,
    textAnnotations: js.Array[SchemaEntityAnnotation] = null,
    webDetection: SchemaWebDetection = null
  ): SchemaAnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cropHintsAnnotation != null) __obj.updateDynamic("cropHintsAnnotation")(cropHintsAnnotation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (faceAnnotations != null) __obj.updateDynamic("faceAnnotations")(faceAnnotations.asInstanceOf[js.Any])
    if (fullTextAnnotation != null) __obj.updateDynamic("fullTextAnnotation")(fullTextAnnotation.asInstanceOf[js.Any])
    if (imagePropertiesAnnotation != null) __obj.updateDynamic("imagePropertiesAnnotation")(imagePropertiesAnnotation.asInstanceOf[js.Any])
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations.asInstanceOf[js.Any])
    if (landmarkAnnotations != null) __obj.updateDynamic("landmarkAnnotations")(landmarkAnnotations.asInstanceOf[js.Any])
    if (localizedObjectAnnotations != null) __obj.updateDynamic("localizedObjectAnnotations")(localizedObjectAnnotations.asInstanceOf[js.Any])
    if (logoAnnotations != null) __obj.updateDynamic("logoAnnotations")(logoAnnotations.asInstanceOf[js.Any])
    if (productSearchResults != null) __obj.updateDynamic("productSearchResults")(productSearchResults.asInstanceOf[js.Any])
    if (safeSearchAnnotation != null) __obj.updateDynamic("safeSearchAnnotation")(safeSearchAnnotation.asInstanceOf[js.Any])
    if (textAnnotations != null) __obj.updateDynamic("textAnnotations")(textAnnotations.asInstanceOf[js.Any])
    if (webDetection != null) __obj.updateDynamic("webDetection")(webDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotateImageResponse]
  }
}

