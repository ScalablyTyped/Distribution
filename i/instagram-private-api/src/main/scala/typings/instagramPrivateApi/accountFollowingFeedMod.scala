package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountFollowingFeedResponseMod.AccountFollowingFeedResponse
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_earliest
import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_latest
import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import typings.instagramPrivateApi.responsesMod.AccountFollowingFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFollowingFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/account-following.feed", "AccountFollowingFeed")
  @js.native
  class AccountFollowingFeed protected () extends Feed[AccountFollowingFeedResponse, AccountFollowingFeedResponseUsersItem] {
    def this(client: IgApiClient) = this()
    
    var enableGroups: Boolean = js.native
    
    var id: Double | String = js.native
    
    var includesHashtags: Boolean = js.native
    
    var nextMaxId: js.Any = js.native
    
    var order: js.UndefOr[default | date_followed_latest | date_followed_earliest] = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[AccountFollowingFeedResponse] = js.native
    
    var searchSurface: js.UndefOr[String] = js.native
  }
}
