package typings.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseThumbnailImage extends js.Object {
  var image_versions2: SavedFeedResponseImageVersions2
  var preview: Null
}

object SavedFeedResponseThumbnailImage {
  @scala.inline
  def apply(image_versions2: SavedFeedResponseImageVersions2, preview: Null): SavedFeedResponseThumbnailImage = {
    val __obj = js.Dynamic.literal(image_versions2 = image_versions2.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseThumbnailImage]
  }
}

