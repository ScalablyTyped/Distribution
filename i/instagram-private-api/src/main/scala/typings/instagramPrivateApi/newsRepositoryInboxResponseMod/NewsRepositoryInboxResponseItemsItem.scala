package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseItemsItem extends js.Object {
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
  var user: NewsRepositoryInboxResponseUser
  var uuid: String
  var value: Double
}

object NewsRepositoryInboxResponseItemsItem {
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
    user: NewsRepositoryInboxResponseUser,
    uuid: String,
    value: Double
  ): NewsRepositoryInboxResponseItemsItem = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], is_new_suggestion = is_new_suggestion.asInstanceOf[js.Any], large_urls = large_urls.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], media_infos = media_infos.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], thumbnail_urls = thumbnail_urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewsRepositoryInboxResponseItemsItem]
  }
}

