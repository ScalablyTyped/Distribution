package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container object for image data and alt_text.
  */
@js.native
trait SchemaSurveyQuestionImage extends js.Object {
  
  /**
    * The alt text property used in image tags is required for all images.
    */
  var altText: js.UndefOr[String] = js.native
  
  /**
    * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question
    * types.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * The read-only URL for the hosted images.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaSurveyQuestionImage {
  
  @scala.inline
  def apply(): SchemaSurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyQuestionImage]
  }
  
  @scala.inline
  implicit class SchemaSurveyQuestionImageOps[Self <: SchemaSurveyQuestionImage] (val x: Self) extends AnyVal {
    
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
