package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/media.sticker-responses.feed", JSImport.Namespace)
@js.native
object distFeedsMediaDotStickerDashResponsesDotFeedMod extends js.Object {
  @js.native
  class MediaStickerResponsesFeed[T, I] () extends Feed[T, I] {
    var itemName: String = js.native
    var maxId: js.Any = js.native
    var mediaId: String = js.native
    var name: String = js.native
    var rootName: String = js.native
    var stickerId: String = js.native
    def request(): js.Promise[T] = js.native
  }
  
}

