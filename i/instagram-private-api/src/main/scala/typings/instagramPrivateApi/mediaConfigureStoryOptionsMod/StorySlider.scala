package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorySlider
  extends StObject
     with StorySticker {
  
  var background_color: String
  
  var emoji: String
  
  var is_sticker: `true`
  
  var question: String
  
  var text_color: String
}
object StorySlider {
  
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    height: Double,
    question: String,
    rotation: Double,
    text_color: String,
    width: Double,
    x: Double,
    y: Double
  ): StorySlider = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = true, question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySlider]
  }
  
  @scala.inline
  implicit class StorySliderMutableBuilder[Self <: StorySlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
  }
}
