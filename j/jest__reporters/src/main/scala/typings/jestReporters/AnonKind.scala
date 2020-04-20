package typings.jestReporters

import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import typings.jestReporters.generateEmptyCoverageMod.SingleV8Coverage
import typings.jestReporters.jestReportersStrings.V8Coverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends CoverageWorkerResult {
  var kind: V8Coverage
  var result: SingleV8Coverage
}

object AnonKind {
  @scala.inline
  def apply(kind: V8Coverage, result: SingleV8Coverage): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKind]
  }
}

