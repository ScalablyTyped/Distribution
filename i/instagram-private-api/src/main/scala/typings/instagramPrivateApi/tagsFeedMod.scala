package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.places
import typings.instagramPrivateApi.instagramPrivateApiStrings.recent
import typings.instagramPrivateApi.instagramPrivateApiStrings.top
import typings.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponse
import typings.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponseMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/tags.feed", JSImport.Namespace)
@js.native
object tagsFeedMod extends js.Object {
  
  @js.native
  class TagsFeed () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    
    var nextMaxId: js.Any = js.native
    
    var nextMediaIds: js.Any = js.native
    
    var nextPage: js.Any = js.native
    
    def request(): js.Promise[TagsFeedResponse] = js.native
    
    var tab: top | recent | places = js.native
    
    var tag: String = js.native
  }
}
