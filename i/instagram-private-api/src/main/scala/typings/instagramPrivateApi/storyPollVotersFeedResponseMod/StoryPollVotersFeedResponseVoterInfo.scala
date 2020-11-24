package typings.instagramPrivateApi.storyPollVotersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryPollVotersFeedResponseVoterInfo extends js.Object {
  
  var latest_poll_vote_time: Double = js.native
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var poll_id: String = js.native
  
  var voters: js.Array[StoryPollVotersFeedResponseVotersItem] = js.native
}
object StoryPollVotersFeedResponseVoterInfo {
  
  @scala.inline
  def apply(
    latest_poll_vote_time: Double,
    max_id: Null,
    more_available: Boolean,
    poll_id: String,
    voters: js.Array[StoryPollVotersFeedResponseVotersItem]
  ): StoryPollVotersFeedResponseVoterInfo = {
    val __obj = js.Dynamic.literal(latest_poll_vote_time = latest_poll_vote_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], voters = voters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPollVotersFeedResponseVoterInfo]
  }
  
  @scala.inline
  implicit class StoryPollVotersFeedResponseVoterInfoOps[Self <: StoryPollVotersFeedResponseVoterInfo] (val x: Self) extends AnyVal {
    
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
    def setLatest_poll_vote_time(value: Double): Self = this.set("latest_poll_vote_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: Null): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoll_id(value: String): Self = this.set("poll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotersVarargs(value: StoryPollVotersFeedResponseVotersItem*): Self = this.set("voters", js.Array(value :_*))
    
    @scala.inline
    def setVoters(value: js.Array[StoryPollVotersFeedResponseVotersItem]): Self = this.set("voters", value.asInstanceOf[js.Any])
  }
}
