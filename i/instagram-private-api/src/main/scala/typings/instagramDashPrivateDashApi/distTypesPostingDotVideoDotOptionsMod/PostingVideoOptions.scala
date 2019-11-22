package typings.instagramDashPrivateDashApi.distTypesPostingDotVideoDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingLocation
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingUsertags
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingVideoOptions extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var coverImage: Buffer
  var location: js.UndefOr[PostingLocation] = js.undefined
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var usertags: js.UndefOr[PostingUsertags] = js.undefined
  var video: Buffer
}

object PostingVideoOptions {
  @scala.inline
  def apply(
    coverImage: Buffer,
    video: Buffer,
    caption: String = null,
    location: PostingLocation = null,
    transcodeDelay: Int | Double = null,
    usertags: PostingUsertags = null
  ): PostingVideoOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage, video = video)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (location != null) __obj.updateDynamic("location")(location)
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags)
    __obj.asInstanceOf[PostingVideoOptions]
  }
}

