package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.tagFeedResponseMod.TagFeedResponse
import typings.instagramPrivateApi.tagFeedResponseMod.TagFeedResponseItemsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/tag.feed", "TagFeed")
  @js.native
  class TagFeed protected () extends Feed[TagFeedResponse, TagFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[TagFeedResponse] = js.native
    
    var tag: String = js.native
  }
}
