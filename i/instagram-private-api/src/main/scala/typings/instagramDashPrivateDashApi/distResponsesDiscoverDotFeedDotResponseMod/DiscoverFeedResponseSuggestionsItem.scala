package typings.instagramDashPrivateDashApi.distResponsesDiscoverDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverFeedResponseSuggestionsItem extends js.Object {
  var algorithm: String
  var caption: String
  var followed_by: Boolean
  var icon: String
  var is_new_suggestion: Boolean
  var large_urls: js.Array[_]
  var media_ids: js.Array[_]
  var media_infos: js.Array[_]
  var social_context: String
  var thumbnail_urls: js.Array[_]
  var user: DiscoverFeedResponseUser
  var uuid: String
  var value: Double
}

object DiscoverFeedResponseSuggestionsItem {
  @scala.inline
  def apply(
    algorithm: String,
    caption: String,
    followed_by: Boolean,
    icon: String,
    is_new_suggestion: Boolean,
    large_urls: js.Array[_],
    media_ids: js.Array[_],
    media_infos: js.Array[_],
    social_context: String,
    thumbnail_urls: js.Array[_],
    user: DiscoverFeedResponseUser,
    uuid: String,
    value: Double
  ): DiscoverFeedResponseSuggestionsItem = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, caption = caption, followed_by = followed_by, icon = icon, is_new_suggestion = is_new_suggestion, large_urls = large_urls, media_ids = media_ids, media_infos = media_infos, social_context = social_context, thumbnail_urls = thumbnail_urls, user = user, uuid = uuid, value = value)
  
    __obj.asInstanceOf[DiscoverFeedResponseSuggestionsItem]
  }
}

