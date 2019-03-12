package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashBitmapItem extends js.Object {
  var allowSmoothing: scala.Boolean
  var compressionType: java.lang.String
  var fileLastModifiedDate: java.lang.String
  var originalCompressionType: java.lang.String
  var sourceFileExists: scala.Boolean
  var sourceFileIsCurrent: scala.Boolean
  var sourceFilePath: java.lang.String
  var useDeblocking: scala.Boolean
  var useImportedJPEGQuality: scala.Boolean
  def exportToFile(fileURI: java.lang.String): scala.Boolean
}

object FlashBitmapItem {
  @scala.inline
  def apply(
    allowSmoothing: scala.Boolean,
    compressionType: java.lang.String,
    exportToFile: java.lang.String => scala.Boolean,
    fileLastModifiedDate: java.lang.String,
    originalCompressionType: java.lang.String,
    sourceFileExists: scala.Boolean,
    sourceFileIsCurrent: scala.Boolean,
    sourceFilePath: java.lang.String,
    useDeblocking: scala.Boolean,
    useImportedJPEGQuality: scala.Boolean
  ): FlashBitmapItem = {
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing, compressionType = compressionType, exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate, originalCompressionType = originalCompressionType, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, useDeblocking = useDeblocking, useImportedJPEGQuality = useImportedJPEGQuality)
  
    __obj.asInstanceOf[FlashBitmapItem]
  }
}

