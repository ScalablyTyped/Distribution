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

