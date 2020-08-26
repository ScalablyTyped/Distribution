package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashVideoItem extends js.Object {
  var fileLastModifiedDate: String = js.native
  var sourceFileExists: Boolean = js.native
  var sourceFileIsCurrent: Boolean = js.native
  var sourceFilePath: String = js.native
  var videoType: String = js.native
  def exportToFLV(fileURI: String): Boolean = js.native
}

object FlashVideoItem {
  @scala.inline
  def apply(
    exportToFLV: String => Boolean,
    fileLastModifiedDate: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    videoType: String
  ): FlashVideoItem = {
    val __obj = js.Dynamic.literal(exportToFLV = js.Any.fromFunction1(exportToFLV), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], videoType = videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVideoItem]
  }
  @scala.inline
  implicit class FlashVideoItemOps[Self <: FlashVideoItem] (val x: Self) extends AnyVal {
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
    def setExportToFLV(value: String => Boolean): Self = this.set("exportToFLV", js.Any.fromFunction1(value))
    @scala.inline
    def setFileLastModifiedDate(value: String): Self = this.set("fileLastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFileExists(value: Boolean): Self = this.set("sourceFileExists", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFileIsCurrent(value: Boolean): Self = this.set("sourceFileIsCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFilePath(value: String): Self = this.set("sourceFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoType(value: String): Self = this.set("videoType", value.asInstanceOf[js.Any])
  }
  
}

