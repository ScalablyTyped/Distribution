package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseChildCommentsItem
import typings.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaInlineChildCommentsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/media.inline-child-comments.feed", "MediaInlineChildCommentsFeed")
  @js.native
  class MediaInlineChildCommentsFeed protected () extends Feed[
          MediaInlineChildCommentsFeedResponseRootObject, 
          MediaInlineChildCommentsFeedResponseChildCommentsItem
        ] {
    def this(client: IgApiClient) = this()
    
    var commentId: String = js.native
    
    var mediaId: String = js.native
    
    var nextMaxId: js.Any = js.native
    
    var nextMinId: js.Any = js.native
    
    def request(): js.Promise[MediaInlineChildCommentsFeedResponseRootObject] = js.native
  }
}
