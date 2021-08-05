package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.profileEntityMod.ProfileEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFriendshipsBestiesFeedResponseMod {
  
  @JSImport("instagram-private-api/dist/responses/account-friendships-besties.feed.response", "BestiesFeedResponseUsersItem")
  @js.native
  class BestiesFeedResponseUsersItem protected () extends ProfileEntity {
    def this(client: IgApiClient) = this()
    
    var friendship_status: js.Object = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var latest_reel_media: js.UndefOr[Double] = js.native
    
    @JSName("pk")
    var pk_BestiesFeedResponseUsersItem: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  
  trait BestiesFeedResponse extends StObject {
    
    var big_list: Boolean
    
    var next_max_id: Null
    
    var page_size: Double
    
    var sections: Null
    
    var status: String
    
    var users: js.Array[BestiesFeedResponseUsersItem]
  }
  object BestiesFeedResponse {
    
    inline def apply(
      big_list: Boolean,
      next_max_id: Null,
      page_size: Double,
      sections: Null,
      status: String,
      users: js.Array[BestiesFeedResponseUsersItem]
    ): BestiesFeedResponse = {
      val __obj = js.Dynamic.literal(big_list = big_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[BestiesFeedResponse]
    }
    
    extension [Self <: BestiesFeedResponse](x: Self) {
      
      inline def setBig_list(value: Boolean): Self = StObject.set(x, "big_list", value.asInstanceOf[js.Any])
      
      inline def setNext_max_id(value: Null): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setSections(value: Null): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[BestiesFeedResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: BestiesFeedResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
