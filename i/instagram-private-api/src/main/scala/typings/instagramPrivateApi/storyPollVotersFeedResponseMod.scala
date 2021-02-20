package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyPollVotersFeedResponseMod {
  
  @js.native
  trait StoryPollVotersFeedResponseFriendshipStatus extends StObject {
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object StoryPollVotersFeedResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): StoryPollVotersFeedResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryPollVotersFeedResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class StoryPollVotersFeedResponseFriendshipStatusMutableBuilder[Self <: StoryPollVotersFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
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
  trait StoryPollVotersFeedResponseRootObject extends StObject {
    
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
    implicit class StoryPollVotersFeedResponseRootObjectMutableBuilder[Self <: StoryPollVotersFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoter_info(value: StoryPollVotersFeedResponseVoterInfo): Self = StObject.set(x, "voter_info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoryPollVotersFeedResponseUser extends StObject {
    
    var friendship_status: StoryPollVotersFeedResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var latest_reel_media: Double = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object StoryPollVotersFeedResponseUser {
    
    @scala.inline
    def apply(
      friendship_status: StoryPollVotersFeedResponseFriendshipStatus,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      latest_reel_media: Double,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): StoryPollVotersFeedResponseUser = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryPollVotersFeedResponseUser]
    }
    
    @scala.inline
    implicit class StoryPollVotersFeedResponseUserMutableBuilder[Self <: StoryPollVotersFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: StoryPollVotersFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
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
  trait StoryPollVotersFeedResponseVoterInfo extends StObject {
    
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
    implicit class StoryPollVotersFeedResponseVoterInfoMutableBuilder[Self <: StoryPollVotersFeedResponseVoterInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest_poll_vote_time(value: Double): Self = StObject.set(x, "latest_poll_vote_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoll_id(value: String): Self = StObject.set(x, "poll_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoters(value: js.Array[StoryPollVotersFeedResponseVotersItem]): Self = StObject.set(x, "voters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVotersVarargs(value: StoryPollVotersFeedResponseVotersItem*): Self = StObject.set(x, "voters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StoryPollVotersFeedResponseVotersItem extends StObject {
    
    var ts: Double = js.native
    
    var user: StoryPollVotersFeedResponseUser = js.native
    
    var vote: Double = js.native
  }
  object StoryPollVotersFeedResponseVotersItem {
    
    @scala.inline
    def apply(ts: Double, user: StoryPollVotersFeedResponseUser, vote: Double): StoryPollVotersFeedResponseVotersItem = {
      val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryPollVotersFeedResponseVotersItem]
    }
    
    @scala.inline
    implicit class StoryPollVotersFeedResponseVotersItemMutableBuilder[Self <: StoryPollVotersFeedResponseVotersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: StoryPollVotersFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVote(value: Double): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    }
  }
}
