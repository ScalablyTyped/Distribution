package typings.jestReporters

import typings.istanbulLibCoverage.mod.FileCoverage
import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import typings.jestReporters.jestReportersStrings.BabelCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoverage extends CoverageWorkerResult {
  var coverage: FileCoverage
  var kind: BabelCoverage
  var sourceMapPath: js.UndefOr[String | Null] = js.undefined
}

object AnonCoverage {
  @scala.inline
  def apply(coverage: FileCoverage, kind: BabelCoverage, sourceMapPath: String = null): AnonCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (sourceMapPath != null) __obj.updateDynamic("sourceMapPath")(sourceMapPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoverage]
  }
}

