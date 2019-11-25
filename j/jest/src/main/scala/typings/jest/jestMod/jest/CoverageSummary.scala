package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageSummary extends js.Object {
  var branches: FileCoverageTotal
  var functions: FileCoverageTotal
  var lines: FileCoverageTotal
  var statements: FileCoverageTotal
}

object CoverageSummary {
  @scala.inline
  def apply(
    branches: FileCoverageTotal,
    functions: FileCoverageTotal,
    lines: FileCoverageTotal,
    statements: FileCoverageTotal
  ): CoverageSummary = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoverageSummary]
  }
}

