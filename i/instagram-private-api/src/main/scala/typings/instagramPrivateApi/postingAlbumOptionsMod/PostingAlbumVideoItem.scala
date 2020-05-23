package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.anon.Duration
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingAlbumVideoItem extends PostingAlbumItem {
  var coverImage: Buffer
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var video: Buffer
  var videoInfo: js.UndefOr[Duration] = js.undefined
}

object PostingAlbumVideoItem {
  @scala.inline
  def apply(
    coverImage: Buffer,
    video: Buffer,
    transcodeDelay: js.UndefOr[Double] = js.undefined,
    uploadId: String = null,
    usertags: PostingUsertags = null,
    videoInfo: Duration = null
  ): PostingAlbumVideoItem = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(transcodeDelay)) __obj.updateDynamic("transcodeDelay")(transcodeDelay.get.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (videoInfo != null) __obj.updateDynamic("videoInfo")(videoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumVideoItem]
  }
}

