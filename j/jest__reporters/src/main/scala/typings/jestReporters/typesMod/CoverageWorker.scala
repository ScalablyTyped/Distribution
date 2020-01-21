package typings.jestReporters.typesMod

import typings.jestReporters.coverageWorkerMod.CoverageWorkerData
import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageWorker extends js.Object {
  var worker: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ]
}

object CoverageWorker {
  @scala.inline
  def apply(worker: /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData => CoverageWorkerResult | Null): CoverageWorker = {
    val __obj = js.Dynamic.literal(worker = js.Any.fromFunction1(worker))
  
    __obj.asInstanceOf[CoverageWorker]
  }
}

