package typings.instagramPrivateApi

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object friendshipRepositoryBestiesResponseMod {
  
  @js.native
  trait FriendshipRepositorySetBestiesResponseRootObject extends StObject {
    
    var friendship_statuses: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus] = js.native
    
    var status: String = js.native
  }
  object FriendshipRepositorySetBestiesResponseRootObject {
    
    @scala.inline
    def apply(
      friendship_statuses: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus],
      status: String
    ): FriendshipRepositorySetBestiesResponseRootObject = {
      val __obj = js.Dynamic.literal(friendship_statuses = friendship_statuses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FriendshipRepositorySetBestiesResponseRootObject]
    }
    
    @scala.inline
    implicit class FriendshipRepositorySetBestiesResponseRootObjectMutableBuilder[Self <: FriendshipRepositorySetBestiesResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_statuses(value: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus]): Self = StObject.set(x, "friendship_statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FriendshipRepositorySetBestiesResponseRootObjectStatus extends StObject {
    
    var blocking: Boolean = js.native
    
    var followed_by: Boolean = js.native
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var muting: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object FriendshipRepositorySetBestiesResponseRootObjectStatus {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      followed_by: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      muting: Boolean,
      outgoing_request: Boolean
    ): FriendshipRepositorySetBestiesResponseRootObjectStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[FriendshipRepositorySetBestiesResponseRootObjectStatus]
    }
    
    @scala.inline
    implicit class FriendshipRepositorySetBestiesResponseRootObjectStatusMutableBuilder[Self <: FriendshipRepositorySetBestiesResponseRootObjectStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
}
