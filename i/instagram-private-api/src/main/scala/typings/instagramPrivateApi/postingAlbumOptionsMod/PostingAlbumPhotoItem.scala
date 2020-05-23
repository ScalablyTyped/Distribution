package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
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
    height: js.UndefOr[Double] = js.undefined,
    uploadId: String = null,
    usertags: PostingUsertags = null,
    width: js.UndefOr[Double] = js.undefined
  ): PostingAlbumPhotoItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumPhotoItem]
  }
}

