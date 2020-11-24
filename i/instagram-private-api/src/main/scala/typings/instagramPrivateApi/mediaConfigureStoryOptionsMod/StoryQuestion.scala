package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuestion extends StorySticker {
  
  var background_color: String = js.native
  
  var is_sticker: `true` = js.native
  
  var profile_pic_url: String = js.native
  
  var question: String = js.native
  
  var question_type: text_ = js.native
  
  var text_color: String = js.native
  
  var viewer_can_interact: `true` = js.native
}
object StoryQuestion {
  
  @scala.inline
  def apply(
    background_color: String,
    height: Double,
    is_sticker: `true`,
    profile_pic_url: String,
    question: String,
    question_type: text_,
    rotation: Double,
    text_color: String,
    viewer_can_interact: `true`,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestion]
  }
  
  @scala.inline
  implicit class StoryQuestionOps[Self <: StoryQuestion] (val x: Self) extends AnyVal {
    
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
    def setBackground_color(value: String): Self = this.set("background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: `true`): Self = this.set("is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_type(value: text_): Self = this.set("question_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = this.set("text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_interact(value: `true`): Self = this.set("viewer_can_interact", value.asInstanceOf[js.Any])
  }
}
