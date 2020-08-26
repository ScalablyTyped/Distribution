package typings.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipLoadOptions extends js.Object {
  var base64: js.UndefOr[Boolean] = js.native
  var checkCRC32: js.UndefOr[Boolean] = js.native
  var createFolders: js.UndefOr[Boolean] = js.native
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
}

object JSZipLoadOptions {
  @scala.inline
  def apply(): JSZipLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSZipLoadOptions]
  }
  @scala.inline
  implicit class JSZipLoadOptionsOps[Self <: JSZipLoadOptions] (val x: Self) extends AnyVal {
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
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    @scala.inline
    def setCheckCRC32(value: Boolean): Self = this.set("checkCRC32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckCRC32: Self = this.set("checkCRC32", js.undefined)
    @scala.inline
    def setCreateFolders(value: Boolean): Self = this.set("createFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateFolders: Self = this.set("createFolders", js.undefined)
    @scala.inline
    def setOptimizedBinaryString(value: Boolean): Self = this.set("optimizedBinaryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizedBinaryString: Self = this.set("optimizedBinaryString", js.undefined)
  }
  
}

