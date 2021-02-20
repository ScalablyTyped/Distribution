package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entityMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockedUsersFeedResponseMod {
  
  @JSImport("instagram-private-api/dist/responses/blocked-users.feed.response", "BlockedUsersFeedResponseBlockedListItem")
  @js.native
  class BlockedUsersFeedResponseBlockedListItem protected () extends Entity {
    def this(client: IgApiClient) = this()
    
    var block_at: Double = js.native
    
    var full_name: String = js.native
    
    var profile_pic_url: String = js.native
    
    var user_id: Double = js.native
    
    var username: String = js.native
  }
  
  @js.native
  trait BlockedUsersFeedResponseRootObject extends StObject {
    
    var blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem] = js.native
    
    var next_max_id: String = js.native
    
    var page_size: Double = js.native
    
    var status: String = js.native
  }
  object BlockedUsersFeedResponseRootObject {
    
    @scala.inline
    def apply(
      blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem],
      next_max_id: String,
      page_size: Double,
      status: String
    ): BlockedUsersFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(blocked_list = blocked_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockedUsersFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class BlockedUsersFeedResponseRootObjectMutableBuilder[Self <: BlockedUsersFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocked_list(value: js.Array[BlockedUsersFeedResponseBlockedListItem]): Self = StObject.set(x, "blocked_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocked_listVarargs(value: BlockedUsersFeedResponseBlockedListItem*): Self = StObject.set(x, "blocked_list", js.Array(value :_*))
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
