package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userRepositorySearchResponseMod {
  
  trait UserRepositorySearchResponseFriendshipStatus extends StObject {
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var outgoing_request: Boolean
  }
  object UserRepositorySearchResponseFriendshipStatus {
    
    inline def apply(
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      outgoing_request: Boolean
    ): UserRepositorySearchResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositorySearchResponseFriendshipStatus]
    }
    
    extension [Self <: UserRepositorySearchResponseFriendshipStatus](x: Self) {
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositorySearchResponseRootObject extends StObject {
    
    var has_more: Boolean
    
    var num_results: Double
    
    var rank_token: String
    
    var status: String
    
    var users: js.Array[UserRepositorySearchResponseUsersItem]
  }
  object UserRepositorySearchResponseRootObject {
    
    inline def apply(
      has_more: Boolean,
      num_results: Double,
      rank_token: String,
      status: String,
      users: js.Array[UserRepositorySearchResponseUsersItem]
    ): UserRepositorySearchResponseRootObject = {
      val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositorySearchResponseRootObject]
    }
    
    extension [Self <: UserRepositorySearchResponseRootObject](x: Self) {
      
      inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      inline def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
      
      inline def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[UserRepositorySearchResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserRepositorySearchResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait UserRepositorySearchResponseUsersItem extends StObject {
    
    var byline: String
    
    var follower_count: Double
    
    var friendship_status: UserRepositorySearchResponseFriendshipStatus
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var latest_reel_media: js.UndefOr[Double] = js.undefined
    
    var mutual_followers_count: Double
    
    var pk: Double
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: String
    
    var search_social_context: js.UndefOr[String] = js.undefined
    
    var social_context: js.UndefOr[String] = js.undefined
    
    var unseen_count: js.UndefOr[Double] = js.undefined
    
    var username: String
  }
  object UserRepositorySearchResponseUsersItem {
    
    inline def apply(
      byline: String,
      follower_count: Double,
      friendship_status: UserRepositorySearchResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      mutual_followers_count: Double,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): UserRepositorySearchResponseUsersItem = {
      val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], mutual_followers_count = mutual_followers_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositorySearchResponseUsersItem]
    }
    
    extension [Self <: UserRepositorySearchResponseUsersItem](x: Self) {
      
      inline def setByline(value: String): Self = StObject.set(x, "byline", value.asInstanceOf[js.Any])
      
      inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
      
      inline def setFriendship_status(value: UserRepositorySearchResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      inline def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
      
      inline def setMutual_followers_count(value: Double): Self = StObject.set(x, "mutual_followers_count", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setSearch_social_context(value: String): Self = StObject.set(x, "search_social_context", value.asInstanceOf[js.Any])
      
      inline def setSearch_social_contextUndefined: Self = StObject.set(x, "search_social_context", js.undefined)
      
      inline def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      inline def setSocial_contextUndefined: Self = StObject.set(x, "social_context", js.undefined)
      
      inline def setUnseen_count(value: Double): Self = StObject.set(x, "unseen_count", value.asInstanceOf[js.Any])
      
      inline def setUnseen_countUndefined: Self = StObject.set(x, "unseen_count", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
