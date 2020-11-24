package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseChildCommentsItem
import typings.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/media.inline-child-comments.feed", JSImport.Namespace)
@js.native
object mediaInlineChildCommentsFeedMod extends js.Object {
  
  @js.native
  class MediaInlineChildCommentsFeed () extends Feed[
          MediaInlineChildCommentsFeedResponseRootObject, 
          MediaInlineChildCommentsFeedResponseChildCommentsItem
        ] {
    
    var commentId: String = js.native
    
    var mediaId: String = js.native
    
    var nextMaxId: js.Any = js.native
    
    var nextMinId: js.Any = js.native
    
    def request(): js.Promise[MediaInlineChildCommentsFeedResponseRootObject] = js.native
  }
}
