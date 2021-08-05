package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image context and/or feature-specific parameters.
  */
trait SchemaImageContext extends StObject {
  
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaCropHintsParams] = js.undefined
  
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
  var latLongRect: js.UndefOr[SchemaLatLongRect] = js.undefined
  
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaProductSearchParams] = js.undefined
  
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaWebDetectionParams] = js.undefined
}
object SchemaImageContext {
  
  inline def apply(): SchemaImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageContext]
  }
  
  extension [Self <: SchemaImageContext](x: Self) {
    
    inline def setCropHintsParams(value: SchemaCropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    inline def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    inline def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    inline def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
    
    inline def setLatLongRect(value: SchemaLatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    inline def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    inline def setProductSearchParams(value: SchemaProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    inline def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    inline def setWebDetectionParams(value: SchemaWebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    inline def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
