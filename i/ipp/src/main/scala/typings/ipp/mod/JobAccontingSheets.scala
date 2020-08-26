package typings.ipp.mod

import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobAccontingSheets extends js.Object {
  var `job-accounting-output-bin`: js.UndefOr[OutputBin] = js.native
  var `job-accounting-sheets-type`: js.UndefOr[none | standard] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobAccontingSheets {
  @scala.inline
  def apply(): JobAccontingSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobAccontingSheets]
  }
  @scala.inline
  implicit class JobAccontingSheetsOps[Self <: JobAccontingSheets] (val x: Self) extends AnyVal {
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
    def `setJob-accounting-output-bin`(value: OutputBin): Self = this.set("job-accounting-output-bin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-output-bin`: Self = this.set("job-accounting-output-bin", js.undefined)
    @scala.inline
    def `setJob-accounting-sheets-type`(value: none | standard): Self = this.set("job-accounting-sheets-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-sheets-type`: Self = this.set("job-accounting-sheets-type", js.undefined)
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

