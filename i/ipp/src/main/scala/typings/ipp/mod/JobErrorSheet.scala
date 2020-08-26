package typings.ipp.mod

import typings.ipp.ippStrings.`on-error`
import typings.ipp.ippStrings.always
import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobErrorSheet extends js.Object {
  var `job-error-sheet-type`: js.UndefOr[none | standard] = js.native
  var `job-error-sheet-when`: js.UndefOr[always | `on-error`] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobErrorSheet {
  @scala.inline
  def apply(): JobErrorSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobErrorSheet]
  }
  @scala.inline
  implicit class JobErrorSheetOps[Self <: JobErrorSheet] (val x: Self) extends AnyVal {
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
    def `setJob-error-sheet-type`(value: none | standard): Self = this.set("job-error-sheet-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet-type`: Self = this.set("job-error-sheet-type", js.undefined)
    @scala.inline
    def `setJob-error-sheet-when`(value: always | `on-error`): Self = this.set("job-error-sheet-when", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet-when`: Self = this.set("job-error-sheet-when", js.undefined)
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

