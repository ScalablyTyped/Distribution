package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVideoItem extends js.Object {
  var fileLastModifiedDate: String
  var sourceFileExists: Boolean
  var sourceFileIsCurrent: Boolean
  var sourceFilePath: String
  var videoType: String
  def exportToFLV(fileURI: String): Boolean
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
    val __obj = js.Dynamic.literal(exportToFLV = js.Any.fromFunction1(exportToFLV), fileLastModifiedDate = fileLastModifiedDate, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, videoType = videoType)
  
    __obj.asInstanceOf[FlashVideoItem]
  }
}

