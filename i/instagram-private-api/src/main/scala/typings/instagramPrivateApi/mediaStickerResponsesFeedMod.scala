package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/media.sticker-responses.feed", JSImport.Namespace)
@js.native
object mediaStickerResponsesFeedMod extends js.Object {
  
  @js.native
  class MediaStickerResponsesFeed[T, I] () extends Feed[T, I] {
    
    var itemName: String = js.native
    
    var maxId: js.Any = js.native
    
    var mediaId: String = js.native
    
    var name: String = js.native
    
    def request(): js.Promise[T] = js.native
    
    var rootName: String = js.native
    
    var stickerId: String = js.native
  }
}
