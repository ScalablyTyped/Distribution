package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseItem
import typings.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reelsMediaFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/reels-media.feed", "ReelsMediaFeed")
  @js.native
  class ReelsMediaFeed protected () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    def this(client: IgApiClient) = this()
    
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
    
    var source: IgAppModule = js.native
    
    /* protected */ def state_=(body: js.Any): Unit = js.native
    
    var userIds: js.Array[Double | String] = js.native
  }
}
