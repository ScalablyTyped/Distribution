package typings.jestReporters.typesMod

import typings.jestReporters.coverageWorkerMod.CoverageWorkerData
import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageWorker extends js.Object {
  @JSName("worker")
  var worker_Original: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ] = js.native
  def worker(hasConfigGlobalConfigPathOptions: CoverageWorkerData): CoverageWorkerResult | Null = js.native
}

