package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertSheet extends js.Object {
  var `insert-after-page-number`: js.UndefOr[Double] = js.native
  var `insert-count`: js.UndefOr[Double] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object InsertSheet {
  @scala.inline
  def apply(): InsertSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertSheet]
  }
  @scala.inline
  implicit class InsertSheetOps[Self <: InsertSheet] (val x: Self) extends AnyVal {
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
    def `setInsert-after-page-number`(value: Double): Self = this.set("insert-after-page-number", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-after-page-number`: Self = this.set("insert-after-page-number", js.undefined)
    @scala.inline
    def `setInsert-count`(value: Double): Self = this.set("insert-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-count`: Self = this.set("insert-count", js.undefined)
    @scala.inline
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = this.set("media-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col`: Self = this.set("media-col", js.undefined)
  }
  
}

