package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashBitmapItem extends js.Object {
  var allowSmoothing: Boolean = js.native
  var compressionType: String = js.native
  var fileLastModifiedDate: String = js.native
  var originalCompressionType: String = js.native
  var sourceFileExists: Boolean = js.native
  var sourceFileIsCurrent: Boolean = js.native
  var sourceFilePath: String = js.native
  var useDeblocking: Boolean = js.native
  var useImportedJPEGQuality: Boolean = js.native
  def exportToFile(fileURI: String): Boolean = js.native
}

object FlashBitmapItem {
  @scala.inline
  def apply(
    allowSmoothing: Boolean,
    compressionType: String,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    useDeblocking: Boolean,
    useImportedJPEGQuality: Boolean
  ): FlashBitmapItem = {
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], useDeblocking = useDeblocking.asInstanceOf[js.Any], useImportedJPEGQuality = useImportedJPEGQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapItem]
  }
  @scala.inline
  implicit class FlashBitmapItemOps[Self <: FlashBitmapItem] (val x: Self) extends AnyVal {
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
    def setAllowSmoothing(value: Boolean): Self = this.set("allowSmoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompressionType(value: String): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportToFile(value: String => Boolean): Self = this.set("exportToFile", js.Any.fromFunction1(value))
    @scala.inline
    def setFileLastModifiedDate(value: String): Self = this.set("fileLastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalCompressionType(value: String): Self = this.set("originalCompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFileExists(value: Boolean): Self = this.set("sourceFileExists", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFileIsCurrent(value: Boolean): Self = this.set("sourceFileIsCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFilePath(value: String): Self = this.set("sourceFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDeblocking(value: Boolean): Self = this.set("useDeblocking", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseImportedJPEGQuality(value: Boolean): Self = this.set("useImportedJPEGQuality", value.asInstanceOf[js.Any])
  }
  
}

