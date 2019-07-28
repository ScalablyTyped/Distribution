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
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing, compressionType = compressionType, exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate, originalCompressionType = originalCompressionType, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, useDeblocking = useDeblocking, useImportedJPEGQuality = useImportedJPEGQuality)
  
    __obj.asInstanceOf[FlashBitmapItem]
  }
}

