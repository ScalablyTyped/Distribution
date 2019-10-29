package typings.htmlDashValidator.htmlDashValidatorMod

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
    val __obj = js.Dynamic.literal(extract = extract, firstColumn = firstColumn, hiliteLength = hiliteLength, hiliteStart = hiliteStart, lastColumn = lastColumn, lastLine = lastLine)
  
    __obj.asInstanceOf[ValidationMessageBasicLocationObject]
  }
}

