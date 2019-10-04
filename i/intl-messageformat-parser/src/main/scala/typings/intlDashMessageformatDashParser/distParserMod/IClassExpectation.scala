package typings.intlDashMessageformatDashParser.distParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.`class`
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
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase, inverted = inverted, parts = parts)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IClassExpectation]
  }
}

