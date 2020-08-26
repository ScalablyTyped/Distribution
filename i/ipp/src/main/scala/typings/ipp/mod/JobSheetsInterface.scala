package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSheetsInterface extends js.Object {
  var `job-sheets`: js.UndefOr[JobSheets] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobSheetsInterface {
  @scala.inline
  def apply(): JobSheetsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSheetsInterface]
  }
  @scala.inline
  implicit class JobSheetsInterfaceOps[Self <: JobSheetsInterface] (val x: Self) extends AnyVal {
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
    def `setJob-sheets`(value: JobSheets): Self = this.set("job-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets`: Self = this.set("job-sheets", js.undefined)
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

