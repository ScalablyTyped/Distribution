package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object friendshipRepositoryShowResponseMod {
  
  trait FriendshipRepositoryShowResponseRootObject extends StObject {
    
    var blocking: Boolean
    
    var followed_by: Boolean
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_blocking_reel: Boolean
    
    var is_muting_reel: Boolean
    
    var is_private: Boolean
    
    var muting: Boolean
    
    var outgoing_request: Boolean
    
    var status: String
  }
  object FriendshipRepositoryShowResponseRootObject {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      followed_by: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_blocking_reel: Boolean,
      is_muting_reel: Boolean,
      is_private: Boolean,
      muting: Boolean,
      outgoing_request: Boolean,
      status: String
    ): FriendshipRepositoryShowResponseRootObject = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_blocking_reel = is_blocking_reel.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FriendshipRepositoryShowResponseRootObject]
    }
    
    @scala.inline
    implicit class FriendshipRepositoryShowResponseRootObjectMutableBuilder[Self <: FriendshipRepositoryShowResponseRootObject] (val x: Self) extends AnyVal {
      
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
      def setIs_blocking_reel(value: Boolean): Self = StObject.set(x, "is_blocking_reel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_muting_reel(value: Boolean): Self = StObject.set(x, "is_muting_reel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
