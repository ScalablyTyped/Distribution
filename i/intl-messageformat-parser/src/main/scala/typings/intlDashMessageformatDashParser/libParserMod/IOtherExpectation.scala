package typings.intlDashMessageformatDashParser.libParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOtherExpectation extends Expectation {
  var description: String
  var `type`: other
}

object IOtherExpectation {
  @scala.inline
  def apply(description: String, `type`: other): IOtherExpectation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherExpectation]
  }
}

