package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image context and/or feature-specific parameters.
  */
trait SchemaGoogleCloudVisionV1p1beta1ImageContext extends StObject {
  
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1CropHintsParams] = js.undefined
  
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty
    * value yields the best results since it enables automatic language
    * detection. For languages based on the Latin alphabet, setting
    * `language_hints` is not needed. In rare cases, when the language of the
    * text in the image is known, setting a hint will help get better results
    * (although it will be a significant hindrance if the hint is wrong). Text
    * detection returns an error if one or more of the specified languages is
    * not one of the [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1LatLongRect] = js.undefined
  
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ProductSearchParams] = js.undefined
  
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1WebDetectionParams] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1ImageContext {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ImageContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ImageContextMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1ImageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHintsParams(value: SchemaGoogleCloudVisionV1p1beta1CropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    @scala.inline
    def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    @scala.inline
    def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
    
    @scala.inline
    def setLatLongRect(value: SchemaGoogleCloudVisionV1p1beta1LatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    @scala.inline
    def setProductSearchParams(value: SchemaGoogleCloudVisionV1p1beta1ProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    @scala.inline
    def setWebDetectionParams(value: SchemaGoogleCloudVisionV1p1beta1WebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
