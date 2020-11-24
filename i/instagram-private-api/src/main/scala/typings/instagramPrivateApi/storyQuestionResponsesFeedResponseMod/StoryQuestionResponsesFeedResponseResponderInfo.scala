package typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuestionResponsesFeedResponseResponderInfo extends js.Object {
  
  var background_color: String = js.native
  
  var latest_question_response_time: Double = js.native
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var question: String = js.native
  
  var question_id: String = js.native
  
  var question_response_count: Double = js.native
  
  var question_type: String = js.native
  
  var responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem] = js.native
  
  var text_color: String = js.native
  
  var unanswered_response_count: Double = js.native
}
object StoryQuestionResponsesFeedResponseResponderInfo {
  
  @scala.inline
  def apply(
    background_color: String,
    latest_question_response_time: Double,
    max_id: Null,
    more_available: Boolean,
    question: String,
    question_id: String,
    question_response_count: Double,
    question_type: String,
    responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem],
    text_color: String,
    unanswered_response_count: Double
  ): StoryQuestionResponsesFeedResponseResponderInfo = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], latest_question_response_time = latest_question_response_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_response_count = question_response_count.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], responders = responders.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], unanswered_response_count = unanswered_response_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseResponderInfo]
  }
  
  @scala.inline
  implicit class StoryQuestionResponsesFeedResponseResponderInfoOps[Self <: StoryQuestionResponsesFeedResponseResponderInfo] (val x: Self) extends AnyVal {
    
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
    def setLatest_question_response_time(value: Double): Self = this.set("latest_question_response_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: Null): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_id(value: String): Self = this.set("question_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_response_count(value: Double): Self = this.set("question_response_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion_type(value: String): Self = this.set("question_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondersVarargs(value: StoryQuestionResponsesFeedResponseRespondersItem*): Self = this.set("responders", js.Array(value :_*))
    
    @scala.inline
    def setResponders(value: js.Array[StoryQuestionResponsesFeedResponseRespondersItem]): Self = this.set("responders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = this.set("text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnanswered_response_count(value: Double): Self = this.set("unanswered_response_count", value.asInstanceOf[js.Any])
  }
}
