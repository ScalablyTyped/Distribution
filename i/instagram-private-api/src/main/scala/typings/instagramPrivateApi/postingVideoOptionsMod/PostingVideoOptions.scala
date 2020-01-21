package typings.instagramPrivateApi.postingVideoOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
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
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingVideoOptions]
  }
}

