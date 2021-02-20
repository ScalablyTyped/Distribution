package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStickerResponsesFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/media.sticker-responses.feed", "MediaStickerResponsesFeed")
  @js.native
  class MediaStickerResponsesFeed[T, I] protected () extends Feed[T, I] {
    def this(client: IgApiClient) = this()
    
    var itemName: String = js.native
    
    var maxId: js.Any = js.native
    
    var mediaId: String = js.native
    
    var name: String = js.native
    
    def request(): js.Promise[T] = js.native
    
    var rootName: String = js.native
    
    var stickerId: String = js.native
  }
}
