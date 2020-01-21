package typings.intlMessageformatParser.parserMod

import typings.intlMessageformatParser.intlMessageformatParserStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassExpectation extends Expectation {
  var ignoreCase: Boolean
  var inverted: Boolean
  var parts: IClassParts
  var `type`: `class`
}

object IClassExpectation {
  @scala.inline
  def apply(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): IClassExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassExpectation]
  }
}

