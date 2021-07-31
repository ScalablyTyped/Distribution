package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionText extends StObject {
  
  var captionText: String
  
  var mediaId: String
}
object CaptionText {
  
  @scala.inline
  def apply(captionText: String, mediaId: String): CaptionText = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionText]
  }
  
  @scala.inline
  implicit class CaptionTextMutableBuilder[Self <: CaptionText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionText(value: String): Self = StObject.set(x, "captionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
  }
}
