package typings.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String
  var fb_user_tags: UserFeedResponseFb_user_tags
  var id: String
  var image_versions2: UserFeedResponseImage_versions2
  var media_type: Double
  var original_height: Double
  var original_width: Double
  var pk: String
}

object UserFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    fb_user_tags: UserFeedResponseFb_user_tags,
    id: String,
    image_versions2: UserFeedResponseImage_versions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): UserFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserFeedResponseCarouselMediaItem]
  }
}

