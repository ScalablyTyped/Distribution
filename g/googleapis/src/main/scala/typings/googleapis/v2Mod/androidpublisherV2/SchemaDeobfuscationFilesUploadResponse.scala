package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeobfuscationFilesUploadResponse extends js.Object {
  var deobfuscationFile: js.UndefOr[SchemaDeobfuscationFile] = js.native
}

object SchemaDeobfuscationFilesUploadResponse {
  @scala.inline
  def apply(): SchemaDeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFilesUploadResponse]
  }
  @scala.inline
  implicit class SchemaDeobfuscationFilesUploadResponseOps[Self <: SchemaDeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
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
    def setDeobfuscationFile(value: SchemaDeobfuscationFile): Self = this.set("deobfuscationFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeobfuscationFile: Self = this.set("deobfuscationFile", js.undefined)
  }
  
}

