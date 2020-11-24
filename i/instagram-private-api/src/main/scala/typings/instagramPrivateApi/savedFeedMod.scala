package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.savedFeedResponseMod.SavedFeedResponseMedia
import typings.instagramPrivateApi.savedFeedResponseMod.SavedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/saved.feed", JSImport.Namespace)
@js.native
object savedFeedMod extends js.Object {
  
  @js.native
  class SavedFeed () extends Feed[SavedFeedResponseRootObject, SavedFeedResponseMedia] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[SavedFeedResponseRootObject] = js.native
  }
}
