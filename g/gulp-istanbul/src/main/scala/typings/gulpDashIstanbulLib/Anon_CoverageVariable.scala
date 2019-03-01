package typings
package gulpDashIstanbulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverageVariable extends js.Object {
  var coverageVariable: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CoverageVariable {
  @scala.inline
  def apply(coverageVariable: java.lang.String = null): Anon_CoverageVariable = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable)
    __obj.asInstanceOf[Anon_CoverageVariable]
  }
}

