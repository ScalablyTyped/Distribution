package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storySliderVotersFeedResponseResponseMod {
  
  @js.native
  trait StorySliderVotersFeedResponseResponseFriendshipStatus extends StObject {
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object StorySliderVotersFeedResponseResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): StorySliderVotersFeedResponseResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorySliderVotersFeedResponseResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class StorySliderVotersFeedResponseResponseFriendshipStatusMutableBuilder[Self <: StorySliderVotersFeedResponseResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorySliderVotersFeedResponseResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var voter_info: StorySliderVotersFeedResponseResponseVoterInfo = js.native
  }
  object StorySliderVotersFeedResponseResponseRootObject {
    
    @scala.inline
    def apply(status: String, voter_info: StorySliderVotersFeedResponseResponseVoterInfo): StorySliderVotersFeedResponseResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorySliderVotersFeedResponseResponseRootObject]
    }
    
    @scala.inline
    implicit class StorySliderVotersFeedResponseResponseRootObjectMutableBuilder[Self <: StorySliderVotersFeedResponseResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoter_info(value: StorySliderVotersFeedResponseResponseVoterInfo): Self = StObject.set(x, "voter_info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorySliderVotersFeedResponseResponseUser extends StObject {
    
    var friendship_status: StorySliderVotersFeedResponseResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object StorySliderVotersFeedResponseResponseUser {
    
    @scala.inline
    def apply(
      friendship_status: StorySliderVotersFeedResponseResponseFriendshipStatus,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): StorySliderVotersFeedResponseResponseUser = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorySliderVotersFeedResponseResponseUser]
    }
    
    @scala.inline
    implicit class StorySliderVotersFeedResponseResponseUserMutableBuilder[Self <: StorySliderVotersFeedResponseResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: StorySliderVotersFeedResponseResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorySliderVotersFeedResponseResponseVoterInfo extends StObject {
    
    var latest_slider_vote_time: Double = js.native
    
    var max_id: Null = js.native
    
    var more_available: Boolean = js.native
    
    var slider_id: String = js.native
    
    var voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem] = js.native
  }
  object StorySliderVotersFeedResponseResponseVoterInfo {
    
    @scala.inline
    def apply(
      latest_slider_vote_time: Double,
      max_id: Null,
      more_available: Boolean,
      slider_id: String,
      voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem]
    ): StorySliderVotersFeedResponseResponseVoterInfo = {
      val __obj = js.Dynamic.literal(latest_slider_vote_time = latest_slider_vote_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], voters = voters.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVoterInfo]
    }
    
    @scala.inline
    implicit class StorySliderVotersFeedResponseResponseVoterInfoMutableBuilder[Self <: StorySliderVotersFeedResponseResponseVoterInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest_slider_vote_time(value: Double): Self = StObject.set(x, "latest_slider_vote_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlider_id(value: String): Self = StObject.set(x, "slider_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoters(value: js.Array[StorySliderVotersFeedResponseResponseVotersItem]): Self = StObject.set(x, "voters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVotersVarargs(value: StorySliderVotersFeedResponseResponseVotersItem*): Self = StObject.set(x, "voters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StorySliderVotersFeedResponseResponseVotersItem extends StObject {
    
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
    implicit class StorySliderVotersFeedResponseResponseVotersItemMutableBuilder[Self <: StorySliderVotersFeedResponseResponseVotersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: StorySliderVotersFeedResponseResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVote(value: Double): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    }
  }
}
