package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadAbortedEventUIParam extends js.Object {
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.native
  /**
    * Gets the name of the uploaded file.
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * Gets the current file status.
    */
  var fileStatus: js.UndefOr[Double] = js.native
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the file size of the uploaded file.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * Gets the uploaded bytes.
    */
  var uploadedBytes: js.UndefOr[Double] = js.native
}

object FileUploadAbortedEventUIParam {
  @scala.inline
  def apply(): FileUploadAbortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadAbortedEventUIParam]
  }
  @scala.inline
  implicit class FileUploadAbortedEventUIParamOps[Self <: FileUploadAbortedEventUIParam] (val x: Self) extends AnyVal {
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
    def setFileId(value: Double): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFileStatus(value: Double): Self = this.set("fileStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileStatus: Self = this.set("fileStatus", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
    @scala.inline
    def setUploadedBytes(value: Double): Self = this.set("uploadedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadedBytes: Self = this.set("uploadedBytes", js.undefined)
  }
  
}

