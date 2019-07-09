package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassExpectation extends Expectation {
  var ignoreCase: scala.Boolean
  var inverted: scala.Boolean
  var parts: IClassParts
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.`class`
}

object IClassExpectation {
  @scala.inline
  def apply(
    ignoreCase: scala.Boolean,
    inverted: scala.Boolean,
    parts: IClassParts,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.`class`
  ): IClassExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase, inverted = inverted, parts = parts)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IClassExpectation]
  }
}

