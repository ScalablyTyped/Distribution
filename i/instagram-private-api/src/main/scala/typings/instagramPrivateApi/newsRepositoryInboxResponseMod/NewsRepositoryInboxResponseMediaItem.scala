package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseMediaItem extends js.Object {
  var comment_threading_enabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var image: String
}

object NewsRepositoryInboxResponseMediaItem {
  @scala.inline
  def apply(id: String, image: String, comment_threading_enabled: js.UndefOr[Boolean] = js.undefined): NewsRepositoryInboxResponseMediaItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_threading_enabled)) __obj.updateDynamic("comment_threading_enabled")(comment_threading_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseMediaItem]
  }
}

