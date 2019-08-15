package typings.htmlDashValidator.htmlDashValidatorMod

import typings.htmlDashValidator.htmlDashValidatorStrings.error
import typings.htmlDashValidator.htmlDashValidatorStrings.info
import typings.htmlDashValidator.htmlDashValidatorStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageObject extends js.Object {
  var extract: String
  var firstColumn: Double
  var hiliteLength: Double
  var hiliteStart: Double
  var lastColumn: Double
  var lastLine: Double
  var message: String
  var subType: js.UndefOr[warning] = js.undefined
  var `type`: error | info
}

object ValidationMessageObject {
  @scala.inline
  def apply(
    extract: String,
    firstColumn: Double,
    hiliteLength: Double,
    hiliteStart: Double,
    lastColumn: Double,
    lastLine: Double,
    message: String,
    `type`: error | info,
    subType: warning = null
  ): ValidationMessageObject = {
    val __obj = js.Dynamic.literal(extract = extract, firstColumn = firstColumn, hiliteLength = hiliteLength, hiliteStart = hiliteStart, lastColumn = lastColumn, lastLine = lastLine, message = message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType)
    __obj.asInstanceOf[ValidationMessageObject]
  }
}

