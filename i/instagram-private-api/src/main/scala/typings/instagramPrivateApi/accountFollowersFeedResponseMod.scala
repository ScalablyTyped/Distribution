package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.profileEntityMod.ProfileEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFollowersFeedResponseMod {
  
  @JSImport("instagram-private-api/dist/responses/account-followers.feed.response", "AccountFollowersFeedResponseUsersItem")
  @js.native
  class AccountFollowersFeedResponseUsersItem protected () extends ProfileEntity {
    def this(client: IgApiClient) = this()
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var latest_reel_media: js.UndefOr[Double] = js.native
    
    @JSName("pk")
    var pk_AccountFollowersFeedResponseUsersItem: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  
  trait AccountFollowersFeedResponse extends StObject {
    
    var big_list: Boolean
    
    var next_max_id: String
    
    var page_size: Double
    
    var sections: Null
    
    var status: String
    
    var users: js.Array[AccountFollowersFeedResponseUsersItem]
  }
  object AccountFollowersFeedResponse {
    
    @scala.inline
    def apply(
      big_list: Boolean,
      next_max_id: String,
      page_size: Double,
      sections: Null,
      status: String,
      users: js.Array[AccountFollowersFeedResponseUsersItem]
    ): AccountFollowersFeedResponse = {
      val __obj = js.Dynamic.literal(big_list = big_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountFollowersFeedResponse]
    }
    
    @scala.inline
    implicit class AccountFollowersFeedResponseMutableBuilder[Self <: AccountFollowersFeedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBig_list(value: Boolean): Self = StObject.set(x, "big_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSections(value: Null): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[AccountFollowersFeedResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: AccountFollowersFeedResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
