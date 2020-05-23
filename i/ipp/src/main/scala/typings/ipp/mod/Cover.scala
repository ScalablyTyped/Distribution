package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cover extends js.Object {
  var `cover-type`: js.UndefOr[CoverType] = js.undefined
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[js.Array[MediaInterface]] = js.undefined
}

object Cover {
  @scala.inline
  def apply(`cover-type`: CoverType = null, media: Media = null, `media-col`: js.Array[MediaInterface] = null): Cover = {
    val __obj = js.Dynamic.literal()
    if (`cover-type` != null) __obj.updateDynamic("cover-type")(`cover-type`.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cover]
  }
}

