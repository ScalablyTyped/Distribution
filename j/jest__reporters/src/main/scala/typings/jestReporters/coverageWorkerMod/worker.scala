package typings.jestReporters.coverageWorkerMod

import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_worker", "worker")
@js.native
object worker extends js.Object {
  def apply(hasConfigGlobalConfigPathOptions: CoverageWorkerData): CoverageWorkerResult | Null = js.native
}

