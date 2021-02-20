package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseQuestionSticker extends StObject {
  
  var background_color: String = js.native
  
  var media_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var question: String = js.native
  
  var question_id: String = js.native
  
  var question_type: String = js.native
  
  var text_color: String = js.native
  
  var viewer_can_interact: Boolean = js.native
}
object ReelsTrayFeedResponseQuestionSticker {
  
  @scala.inline
  def apply(
    background_color: String,
    media_id: String,
    profile_pic_url: String,
    question: String,
    question_id: String,
    question_type: String,
    text_color: String,
    viewer_can_interact: Boolean
  ): ReelsTrayFeedResponseQuestionSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseQuestionSticker]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseQuestionStickerMutableBuilder[Self <: ReelsTrayFeedResponseQuestionSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_id(value: String): Self = StObject.set(x, "question_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_type(value: String): Self = StObject.set(x, "question_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_interact(value: Boolean): Self = StObject.set(x, "viewer_can_interact", value.asInstanceOf[js.Any])
  }
}
