package typings.instagramPrivateApi.storyPollVotersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryPollVotersFeedResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var voter_info: StoryPollVotersFeedResponseVoterInfo = js.native
}
object StoryPollVotersFeedResponseRootObject {
  
  @scala.inline
  def apply(status: String, voter_info: StoryPollVotersFeedResponseVoterInfo): StoryPollVotersFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPollVotersFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class StoryPollVotersFeedResponseRootObjectOps[Self <: StoryPollVotersFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoter_info(value: StoryPollVotersFeedResponseVoterInfo): Self = this.set("voter_info", value.asInstanceOf[js.Any])
  }
}
