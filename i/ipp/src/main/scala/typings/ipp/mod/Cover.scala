package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cover extends js.Object {
  var `cover-type`: js.UndefOr[CoverType] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[js.Array[MediaInterface]] = js.native
}

object Cover {
  @scala.inline
  def apply(): Cover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cover]
  }
  @scala.inline
  implicit class CoverOps[Self <: Cover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setCover-type`(value: CoverType): Self = this.set("cover-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-type`: Self = this.set("cover-type", js.undefined)
    @scala.inline
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def `setMedia-colVarargs`(value: MediaInterface*): Self = this.set("media-col", js.Array(value :_*))
    @scala.inline
    def `setMedia-col`(value: js.Array[MediaInterface]): Self = this.set("media-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col`: Self = this.set("media-col", js.undefined)
  }
  
}

