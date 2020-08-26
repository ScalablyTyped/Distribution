package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExpansionFilesUploadResponse extends js.Object {
  var expansionFile: js.UndefOr[SchemaExpansionFile] = js.native
}

object SchemaExpansionFilesUploadResponse {
  @scala.inline
  def apply(): SchemaExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFilesUploadResponse]
  }
  @scala.inline
  implicit class SchemaExpansionFilesUploadResponseOps[Self <: SchemaExpansionFilesUploadResponse] (val x: Self) extends AnyVal {
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
    def setExpansionFile(value: SchemaExpansionFile): Self = this.set("expansionFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpansionFile: Self = this.set("expansionFile", js.undefined)
  }
  
}

