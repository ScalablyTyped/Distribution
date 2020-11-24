package typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuizParticipantsFeedResponseParticipantsItem extends js.Object {
  
  var answer: Double = js.native
  
  var ts: Double = js.native
  
  var user: StoryQuizParticipantsFeedResponseUser = js.native
}
object StoryQuizParticipantsFeedResponseParticipantsItem {
  
  @scala.inline
  def apply(answer: Double, ts: Double, user: StoryQuizParticipantsFeedResponseUser): StoryQuizParticipantsFeedResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantsItem]
  }
  
  @scala.inline
  implicit class StoryQuizParticipantsFeedResponseParticipantsItemOps[Self <: StoryQuizParticipantsFeedResponseParticipantsItem] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: Double): Self = this.set("answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: StoryQuizParticipantsFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
