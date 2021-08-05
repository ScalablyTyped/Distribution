package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryQuestion
  extends StObject
     with StorySticker {
  
  var background_color: String
  
  var is_sticker: `true`
  
  var profile_pic_url: String
  
  var question: String
  
  var question_type: text_
  
  var text_color: String
  
  var viewer_can_interact: `true`
}
object StoryQuestion {
  
  inline def apply(
    background_color: String,
    height: Double,
    profile_pic_url: String,
    question: String,
    rotation: Double,
    text_color: String,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = true, profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_type = "text", rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = true, width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestion]
  }
  
  extension [Self <: StoryQuestion](x: Self) {
    
    inline def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestion_type(value: text_): Self = StObject.set(x, "question_type", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setViewer_can_interact(value: `true`): Self = StObject.set(x, "viewer_can_interact", value.asInstanceOf[js.Any])
  }
}
