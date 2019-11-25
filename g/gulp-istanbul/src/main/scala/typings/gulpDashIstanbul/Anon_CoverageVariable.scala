package typings.gulpDashIstanbul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverageVariable extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
}

object Anon_CoverageVariable {
  @scala.inline
  def apply(coverageVariable: String = null): Anon_CoverageVariable = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoverageVariable]
  }
}

