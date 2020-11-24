package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typings.instagramPrivateApi.instagramPrivateApiStrings.recent
import typings.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponse
import typings.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponseMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/location.feed", JSImport.Namespace)
@js.native
object locationFeedMod extends js.Object {
  
  @js.native
  class LocationFeed () extends Feed[LocationFeedResponse, LocationFeedResponseMedia] {
    
    var id: String | Double = js.native
    
    var nextMaxId: js.Any = js.native
    
    var nextMediaIds: js.Any = js.native
    
    var nextPage: js.Any = js.native
    
    def request(): js.Promise[LocationFeedResponse] = js.native
    
    var tab: recent | ranked = js.native
  }
}
