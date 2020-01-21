package typings.gulpIstanbul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoverageVariable extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
}

object AnonCoverageVariable {
  @scala.inline
  def apply(coverageVariable: String = null): AnonCoverageVariable = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoverageVariable]
  }
}

