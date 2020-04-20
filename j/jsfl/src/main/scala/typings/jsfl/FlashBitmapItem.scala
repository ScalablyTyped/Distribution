package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashBitmapItem extends js.Object {
  var allowSmoothing: Boolean
  var compressionType: String
  var fileLastModifiedDate: String
  var originalCompressionType: String
  var sourceFileExists: Boolean
  var sourceFileIsCurrent: Boolean
  var sourceFilePath: String
  var useDeblocking: Boolean
  var useImportedJPEGQuality: Boolean
  def exportToFile(fileURI: String): Boolean
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
}

