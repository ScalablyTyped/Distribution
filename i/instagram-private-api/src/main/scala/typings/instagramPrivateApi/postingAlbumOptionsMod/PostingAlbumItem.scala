package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingAlbumItem extends js.Object {
  var uploadId: js.UndefOr[String] = js.undefined
  var usertags: js.UndefOr[PostingUsertags] = js.undefined
}

object PostingAlbumItem {
  @scala.inline
  def apply(uploadId: String = null, usertags: PostingUsertags = null): PostingAlbumItem = {
    val __obj = js.Dynamic.literal()
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumItem]
  }
}

