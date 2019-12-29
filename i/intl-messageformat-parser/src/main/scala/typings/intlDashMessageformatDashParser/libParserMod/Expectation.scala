package typings.intlDashMessageformatDashParser.libParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.`class`
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.any
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.end
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.literal
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intlDashMessageformatDashParser.libParserMod.ILiteralExpectation
  - typings.intlDashMessageformatDashParser.libParserMod.IClassExpectation
  - typings.intlDashMessageformatDashParser.libParserMod.IAnyExpectation
  - typings.intlDashMessageformatDashParser.libParserMod.IEndExpectation
  - typings.intlDashMessageformatDashParser.libParserMod.IOtherExpectation
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
  def IEndExpectation(`type`: end): Expectation = {
    val __obj = js.Dynamic.literal()
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
  def IAnyExpectation(`type`: any): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
}

