package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.places
import typings.instagramPrivateApi.instagramPrivateApiStrings.recent
import typings.instagramPrivateApi.instagramPrivateApiStrings.top
import typings.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponse
import typings.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponseMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/tags.feed", "TagsFeed")
  @js.native
  class TagsFeed protected () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    var nextMediaIds: js.Any = js.native
    
    var nextPage: js.Any = js.native
    
    def request(): js.Promise[TagsFeedResponse] = js.native
    
    var tab: top | recent | places = js.native
    
    var tag: String = js.native
  }
}
