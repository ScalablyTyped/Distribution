package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1ImageContext extends StObject {
  
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1CropHintsParams] = js.undefined
  
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best results since it enables automatic language detection. For languages based on the Latin alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text in the image is known, setting a hint will help get better results (although it will be a significant hindrance if the hint is wrong). Text detection returns an error if one or more of the specified languages is not one of the [supported languages](https://cloud.google.com/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1LatLongRect] = js.undefined
  
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ProductSearchParams] = js.undefined
  
  /**
    * Parameters for text detection and document text detection.
    */
  var textDetectionParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextDetectionParams] = js.undefined
  
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1WebDetectionParams] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ImageContext {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageContext]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ImageContext](x: Self) {
    
    inline def setCropHintsParams(value: SchemaGoogleCloudVisionV1p2beta1CropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    inline def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    inline def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintsNull: Self = StObject.set(x, "languageHints", null)
    
    inline def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    inline def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value*))
    
    inline def setLatLongRect(value: SchemaGoogleCloudVisionV1p2beta1LatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    inline def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    inline def setProductSearchParams(value: SchemaGoogleCloudVisionV1p2beta1ProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    inline def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    inline def setTextDetectionParams(value: SchemaGoogleCloudVisionV1p2beta1TextDetectionParams): Self = StObject.set(x, "textDetectionParams", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionParamsUndefined: Self = StObject.set(x, "textDetectionParams", js.undefined)
    
    inline def setWebDetectionParams(value: SchemaGoogleCloudVisionV1p2beta1WebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    inline def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
