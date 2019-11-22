package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILiteralExpectation extends Expectation {
  var ignoreCase: Boolean
  var text: String
  var `type`: literal
}

object ILiteralExpectation {
  @scala.inline
  def apply(ignoreCase: Boolean, text: String, `type`: literal): ILiteralExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILiteralExpectation]
  }
}

