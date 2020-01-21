package typings.intlMessageformatParser.mod

import typings.intlMessageformatParser.intlMessageformatParserStrings.literal
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
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILiteralExpectation]
  }
}

