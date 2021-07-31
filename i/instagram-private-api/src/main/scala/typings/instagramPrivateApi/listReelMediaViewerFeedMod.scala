package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseRootObject
import typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listReelMediaViewerFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/list-reel-media-viewer.feed", "ListReelMediaViewerFeed")
  @js.native
  class ListReelMediaViewerFeed protected () extends Feed[
          ListReelMediaViewerFeedResponseRootObject, 
          ListReelMediaViewerFeedResponseUsersItem
        ] {
    def this(client: IgApiClient) = this()
    
    var mediaId: js.Any = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[ListReelMediaViewerFeedResponseRootObject] = js.native
  }
}
