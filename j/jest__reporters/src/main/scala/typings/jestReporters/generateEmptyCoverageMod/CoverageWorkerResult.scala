package typings.jestReporters.generateEmptyCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageWorkerResult extends js.Object {
  var coverage: js.Any
  var sourceMapPath: js.UndefOr[String | Null] = js.undefined
}

object CoverageWorkerResult {
  @scala.inline
  def apply(coverage: js.Any, sourceMapPath: js.UndefOr[Null | String] = js.undefined): CoverageWorkerResult = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapPath)) __obj.updateDynamic("sourceMapPath")(sourceMapPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageWorkerResult]
  }
}

