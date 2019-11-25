package typings.instagramDashPrivateDashApi.distTypesPostingDotPhotoDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingLocation
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingUsertags
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingPhotoOptions extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var file: Buffer
  var location: js.UndefOr[PostingLocation] = js.undefined
  var usertags: js.UndefOr[PostingUsertags] = js.undefined
}

object PostingPhotoOptions {
  @scala.inline
  def apply(
    file: Buffer,
    caption: String = null,
    location: PostingLocation = null,
    usertags: PostingUsertags = null
  ): PostingPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingPhotoOptions]
  }
}

