package typings.jestReporters.anon

import typings.istanbulLibCoverage.mod.FileCoverage
import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import typings.jestReporters.jestReportersStrings.BabelCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coverage extends CoverageWorkerResult {
  var coverage: FileCoverage = js.native
  var kind: BabelCoverage = js.native
}

object Coverage {
  @scala.inline
  def apply(coverage: FileCoverage, kind: BabelCoverage): Coverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoverage(value: FileCoverage): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: BabelCoverage): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

