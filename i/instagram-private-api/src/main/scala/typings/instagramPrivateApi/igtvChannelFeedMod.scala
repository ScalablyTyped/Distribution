package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.igtvChannelFeedResponseMod.IgtvChannelFeedResponseItemsItem
import typings.instagramPrivateApi.igtvChannelFeedResponseMod.IgtvChannelFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvChannelFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/igtv.channel.feed", "IgtvChannelFeed")
  @js.native
  class IgtvChannelFeed protected () extends Feed[IgtvChannelFeedResponseRootObject, IgtvChannelFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var channelId: String = js.native
    
    var maxId: js.Any = js.native
    
    def request(): js.Promise[IgtvChannelFeedResponseRootObject] = js.native
  }
}
