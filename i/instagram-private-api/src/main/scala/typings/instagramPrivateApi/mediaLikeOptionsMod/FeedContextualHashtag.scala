package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedContextualHashtag extends js.Object {
  
  var hashtag: String = js.native
  
  var module_name: feed_contextual_hashtag = js.native
}
object FeedContextualHashtag {
  
  @scala.inline
  def apply(hashtag: String, module_name: feed_contextual_hashtag): FeedContextualHashtag = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContextualHashtag]
  }
  
  @scala.inline
  implicit class FeedContextualHashtagOps[Self <: FeedContextualHashtag] (val x: Self) extends AnyVal {
    
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
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule_name(value: feed_contextual_hashtag): Self = this.set("module_name", value.asInstanceOf[js.Any])
  }
}
