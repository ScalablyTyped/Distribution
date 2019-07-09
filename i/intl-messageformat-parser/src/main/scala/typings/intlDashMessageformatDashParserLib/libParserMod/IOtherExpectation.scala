package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOtherExpectation extends Expectation {
  var description: java.lang.String
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.other
}

object IOtherExpectation {
  @scala.inline
  def apply(
    description: java.lang.String,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.other
  ): IOtherExpectation = {
    val __obj = js.Dynamic.literal(description = description)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOtherExpectation]
  }
}

