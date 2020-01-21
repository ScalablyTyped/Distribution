package typings.jestTestResult

import typings.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoverageMap extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.undefined
}

object AnonCoverageMap {
  @scala.inline
  def apply(coverageMap: CoverageMap = null): AnonCoverageMap = {
    val __obj = js.Dynamic.literal()
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoverageMap]
  }
}

