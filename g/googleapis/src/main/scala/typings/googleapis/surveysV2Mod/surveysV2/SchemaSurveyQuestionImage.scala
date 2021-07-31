package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container object for image data and alt_text.
  */
trait SchemaSurveyQuestionImage extends StObject {
  
  /**
    * The alt text property used in image tags is required for all images.
    */
  var altText: js.UndefOr[String] = js.undefined
  
  /**
    * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question
    * types.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The read-only URL for the hosted images.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaSurveyQuestionImage {
  
  @scala.inline
  def apply(): SchemaSurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyQuestionImage]
  }
  
  @scala.inline
  implicit class SchemaSurveyQuestionImageMutableBuilder[Self <: SchemaSurveyQuestionImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
