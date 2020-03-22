package typings.intlMessageformatParser.mod

import typings.intlMessageformatParser.intlMessageformatParserStrings.`class`
import typings.intlMessageformatParser.intlMessageformatParserStrings.any
import typings.intlMessageformatParser.intlMessageformatParserStrings.end
import typings.intlMessageformatParser.intlMessageformatParserStrings.literal
import typings.intlMessageformatParser.intlMessageformatParserStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformatParser.mod.ILiteralExpectation
  - typings.intlMessageformatParser.mod.IClassExpectation
  - typings.intlMessageformatParser.mod.IAnyExpectation
  - typings.intlMessageformatParser.mod.IEndExpectation
  - typings.intlMessageformatParser.mod.IOtherExpectation
*/
trait Expectation extends js.Object

object Expectation {
  @scala.inline
  def IOtherExpectation(description: String, `type`: other): Expectation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def ILiteralExpectation(ignoreCase: Boolean, text: String, `type`: literal): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IEndExpectation(`type`: end): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IAnyExpectation(`type`: any): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
}

