package typings.gulpIstanbul.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageVariable extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
}

object CoverageVariable {
  @scala.inline
  def apply(coverageVariable: String = null): CoverageVariable = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageVariable]
  }
}

