package typings.instagramDashPrivateDashApi.distTypesPostingDotAlbumDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingUsertags
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingAlbumPhotoItem extends PostingAlbumItem {
  var file: Buffer
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PostingAlbumPhotoItem {
  @scala.inline
  def apply(
    file: Buffer,
    height: Int | Double = null,
    uploadId: String = null,
    usertags: PostingUsertags = null,
    width: Int | Double = null
  ): PostingAlbumPhotoItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumPhotoItem]
  }
}

