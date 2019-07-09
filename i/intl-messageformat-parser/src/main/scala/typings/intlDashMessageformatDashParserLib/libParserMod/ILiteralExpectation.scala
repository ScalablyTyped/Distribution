package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILiteralExpectation extends Expectation {
  var ignoreCase: scala.Boolean
  var text: java.lang.String
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.literal
}

object ILiteralExpectation {
  @scala.inline
  def apply(
    ignoreCase: scala.Boolean,
    text: java.lang.String,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.literal
  ): ILiteralExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILiteralExpectation]
  }
}

