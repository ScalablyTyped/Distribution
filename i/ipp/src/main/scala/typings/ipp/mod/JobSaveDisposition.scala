package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSaveDisposition extends js.Object {
  var `save-disposition`: js.UndefOr[SaveDisposition] = js.native
  var `save-info`: js.UndefOr[js.Array[SaveInfo]] = js.native
}

object JobSaveDisposition {
  @scala.inline
  def apply(): JobSaveDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSaveDisposition]
  }
  @scala.inline
  implicit class JobSaveDispositionOps[Self <: JobSaveDisposition] (val x: Self) extends AnyVal {
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
    def `setSave-disposition`(value: SaveDisposition): Self = this.set("save-disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-disposition`: Self = this.set("save-disposition", js.undefined)
    @scala.inline
    def `setSave-infoVarargs`(value: SaveInfo*): Self = this.set("save-info", js.Array(value :_*))
    @scala.inline
    def `setSave-info`(value: js.Array[SaveInfo]): Self = this.set("save-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-info`: Self = this.set("save-info", js.undefined)
  }
  
}

