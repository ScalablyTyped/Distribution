package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnyExpectation extends Expectation {
  var `type`: any
}

object IAnyExpectation {
  @scala.inline
  def apply(`type`: any): IAnyExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnyExpectation]
  }
}

