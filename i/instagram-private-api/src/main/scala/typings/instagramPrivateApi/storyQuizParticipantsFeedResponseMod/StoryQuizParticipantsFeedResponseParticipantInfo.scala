package typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuizParticipantsFeedResponseParticipantInfo extends js.Object {
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem] = js.native
  
  var quiz_id: String = js.native
}
object StoryQuizParticipantsFeedResponseParticipantInfo {
  
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem],
    quiz_id: String
  ): StoryQuizParticipantsFeedResponseParticipantInfo = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantInfo]
  }
  
  @scala.inline
  implicit class StoryQuizParticipantsFeedResponseParticipantInfoOps[Self <: StoryQuizParticipantsFeedResponseParticipantInfo] (val x: Self) extends AnyVal {
    
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
    def setMax_id(value: Null): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: StoryQuizParticipantsFeedResponseParticipantsItem*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiz_id(value: String): Self = this.set("quiz_id", value.asInstanceOf[js.Any])
  }
}
