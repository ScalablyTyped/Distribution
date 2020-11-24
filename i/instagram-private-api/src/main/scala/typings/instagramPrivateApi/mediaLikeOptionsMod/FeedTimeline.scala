package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_newsfeed_multi_media_liked
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_post
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_timeline
import typings.instagramPrivateApi.instagramPrivateApiStrings.newsfeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedTimeline extends js.Object {
  
  var module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked = js.native
}
object FeedTimeline {
  
  @scala.inline
  def apply(
    module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
  ): FeedTimeline = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedTimeline]
  }
  
  @scala.inline
  implicit class FeedTimelineOps[Self <: FeedTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModule_name(
      value: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
    ): Self = this.set("module_name", value.asInstanceOf[js.Any])
  }
}
