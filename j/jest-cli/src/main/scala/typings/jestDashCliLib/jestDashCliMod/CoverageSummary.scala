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

