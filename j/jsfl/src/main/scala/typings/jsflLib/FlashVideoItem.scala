package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVideoItem extends js.Object {
  var fileLastModifiedDate: java.lang.String
  var sourceFileExists: scala.Boolean
  var sourceFileIsCurrent: scala.Boolean
  var sourceFilePath: java.lang.String
  var videoType: java.lang.String
  def exportToFLV(fileURI: java.lang.String): scala.Boolean
}

object FlashVideoItem {
  @scala.inline
  def apply(
    exportToFLV: java.lang.String => scala.Boolean,
    fileLastModifiedDate: java.lang.String,
    sourceFileExists: scala.Boolean,
    sourceFileIsCurrent: scala.Boolean,
    sourceFilePath: java.lang.String,
    videoType: java.lang.String
  ): FlashVideoItem = {
    val __obj = js.Dynamic.literal(exportToFLV = js.Any.fromFunction1(exportToFLV), fileLastModifiedDate = fileLastModifiedDate, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, videoType = videoType)
  
    __obj.asInstanceOf[FlashVideoItem]
  }
}

