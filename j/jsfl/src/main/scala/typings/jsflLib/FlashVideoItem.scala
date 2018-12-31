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

