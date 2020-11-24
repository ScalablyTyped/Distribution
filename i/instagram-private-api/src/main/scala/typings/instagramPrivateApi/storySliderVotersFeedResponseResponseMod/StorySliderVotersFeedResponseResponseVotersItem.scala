package typings.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorySliderVotersFeedResponseResponseVotersItem extends js.Object {
  
  var ts: Double = js.native
  
  var user: StorySliderVotersFeedResponseResponseUser = js.native
  
  var vote: Double = js.native
}
object StorySliderVotersFeedResponseResponseVotersItem {
  
  @scala.inline
  def apply(ts: Double, user: StorySliderVotersFeedResponseResponseUser, vote: Double): StorySliderVotersFeedResponseResponseVotersItem = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVotersItem]
  }
  
  @scala.inline
  implicit class StorySliderVotersFeedResponseResponseVotersItemOps[Self <: StorySliderVotersFeedResponseResponseVotersItem] (val x: Self) extends AnyVal {
    
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
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: StorySliderVotersFeedResponseResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: Double): Self = this.set("vote", value.asInstanceOf[js.Any])
  }
}
