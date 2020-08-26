package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PdlInitFile extends js.Object {
  var `pdl-init-file-entry`: js.UndefOr[String] = js.native
  var `pdl-init-file-location`: js.UndefOr[String] = js.native
  var `pdl-init-file-name`: js.UndefOr[String] = js.native
}

object PdlInitFile {
  @scala.inline
  def apply(): PdlInitFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdlInitFile]
  }
  @scala.inline
  implicit class PdlInitFileOps[Self <: PdlInitFile] (val x: Self) extends AnyVal {
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
    def `setPdl-init-file-entry`(value: String): Self = this.set("pdl-init-file-entry", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-entry`: Self = this.set("pdl-init-file-entry", js.undefined)
    @scala.inline
    def `setPdl-init-file-location`(value: String): Self = this.set("pdl-init-file-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-location`: Self = this.set("pdl-init-file-location", js.undefined)
    @scala.inline
    def `setPdl-init-file-name`(value: String): Self = this.set("pdl-init-file-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-name`: Self = this.set("pdl-init-file-name", js.undefined)
  }
  
}

