package typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuizParticipantsFeedResponseRootObject extends js.Object {
  
  var participant_info: StoryQuizParticipantsFeedResponseParticipantInfo = js.native
  
  var status: String = js.native
}
object StoryQuizParticipantsFeedResponseRootObject {
  
  @scala.inline
  def apply(participant_info: StoryQuizParticipantsFeedResponseParticipantInfo, status: String): StoryQuizParticipantsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(participant_info = participant_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class StoryQuizParticipantsFeedResponseRootObjectOps[Self <: StoryQuizParticipantsFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setParticipant_info(value: StoryQuizParticipantsFeedResponseParticipantInfo): Self = this.set("participant_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
