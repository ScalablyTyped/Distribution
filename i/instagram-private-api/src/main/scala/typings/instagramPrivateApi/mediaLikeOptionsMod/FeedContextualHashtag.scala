package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedContextualHashtag extends js.Object {
  var hashtag: String
  var module_name: feed_contextual_hashtag
}

object FeedContextualHashtag {
  @scala.inline
  def apply(hashtag: String, module_name: feed_contextual_hashtag): FeedContextualHashtag = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContextualHashtag]
  }
}

