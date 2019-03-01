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
    exportToFLV: js.Function1[java.lang.String, scala.Boolean],
    fileLastModifiedDate: java.lang.String,
    sourceFileExists: scala.Boolean,
    sourceFileIsCurrent: scala.Boolean,
    sourceFilePath: java.lang.String,
    videoType: java.lang.String
  ): FlashVideoItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportToFLV")(exportToFLV)
    __obj.updateDynamic("fileLastModifiedDate")(fileLastModifiedDate)
    __obj.updateDynamic("sourceFileExists")(sourceFileExists)
    __obj.updateDynamic("sourceFileIsCurrent")(sourceFileIsCurrent)
    __obj.updateDynamic("sourceFilePath")(sourceFilePath)
    __obj.updateDynamic("videoType")(videoType)
    __obj.asInstanceOf[FlashVideoItem]
  }
}

