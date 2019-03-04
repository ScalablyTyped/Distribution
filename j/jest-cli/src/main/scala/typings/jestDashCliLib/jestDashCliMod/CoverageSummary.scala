package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageSummary extends js.Object {
  var branches: FileCoverageTotal
  var functions: FileCoverageTotal
  var lines: FileCoverageTotal
  var statements: FileCoverageTotal
  def merge(other: CoverageSummary): scala.Unit
}

object CoverageSummary {
  @scala.inline
  def apply(
    branches: FileCoverageTotal,
    functions: FileCoverageTotal,
    lines: FileCoverageTotal,
    merge: js.Function1[CoverageSummary, scala.Unit],
    statements: FileCoverageTotal
  ): CoverageSummary = {
    val __obj = js.Dynamic.literal(branches = branches, functions = functions, lines = lines, merge = merge, statements = statements)
  
    __obj.asInstanceOf[CoverageSummary]
  }
}

