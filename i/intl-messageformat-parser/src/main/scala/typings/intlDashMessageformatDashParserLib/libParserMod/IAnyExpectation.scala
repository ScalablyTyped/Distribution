package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnyExpectation extends Expectation {
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.any
}

object IAnyExpectation {
  @scala.inline
  def apply(`type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.any): IAnyExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAnyExpectation]
  }
}

