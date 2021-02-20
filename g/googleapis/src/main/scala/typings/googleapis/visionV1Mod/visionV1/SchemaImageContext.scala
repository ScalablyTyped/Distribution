package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image context and/or feature-specific parameters.
  */
@js.native
trait SchemaImageContext extends StObject {
  
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaCropHintsParams] = js.native
  
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
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[SchemaLatLongRect] = js.native
  
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaProductSearchParams] = js.native
  
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaWebDetectionParams] = js.native
}
object SchemaImageContext {
  
  @scala.inline
  def apply(): SchemaImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageContext]
  }
  
  @scala.inline
  implicit class SchemaImageContextMutableBuilder[Self <: SchemaImageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHintsParams(value: SchemaCropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    @scala.inline
    def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    @scala.inline
    def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
    
    @scala.inline
    def setLatLongRect(value: SchemaLatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    @scala.inline
    def setProductSearchParams(value: SchemaProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    @scala.inline
    def setWebDetectionParams(value: SchemaWebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
