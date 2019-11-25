package typings.atJestTestDashResult

import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverageMap extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.undefined
}

object Anon_CoverageMap {
  @scala.inline
  def apply(coverageMap: CoverageMap = null): Anon_CoverageMap = {
    val __obj = js.Dynamic.literal()
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoverageMap]
  }
}

