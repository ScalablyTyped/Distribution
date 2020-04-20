package typings.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicLocationObject extends js.Object {
  var extract: String
  var firstColumn: Double
  var hiliteLength: Double
  var hiliteStart: Double
  var lastColumn: Double
  var lastLine: Double
}

object ValidationMessageBasicLocationObject {
  @scala.inline
  def apply(
    extract: String,
    firstColumn: Double,
    hiliteLength: Double,
    hiliteStart: Double,
    lastColumn: Double,
    lastLine: Double
  ): ValidationMessageBasicLocationObject = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], firstColumn = firstColumn.asInstanceOf[js.Any], hiliteLength = hiliteLength.asInstanceOf[js.Any], hiliteStart = hiliteStart.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], lastLine = lastLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicLocationObject]
  }
}

