package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverage extends js.Object {
  def computeBranchTotals(): FileCoverageTotal
  def computeSimpleTotals(property: java.lang.String): FileCoverageTotal
  def getBranchCoverageByLine(): js.Object
  def getLineCoverage(): js.Object
  def getUncoveredLines(): js.Array[scala.Double]
  def merge(other: js.Object): scala.Unit
  def resetHits(): scala.Unit
  def toJSON(): js.Object
  def toSummary(): CoverageSummary
}

object FileCoverage {
  @scala.inline
  def apply(
    computeBranchTotals: js.Function0[FileCoverageTotal],
    computeSimpleTotals: js.Function1[java.lang.String, FileCoverageTotal],
    getBranchCoverageByLine: js.Function0[js.Object],
    getLineCoverage: js.Function0[js.Object],
    getUncoveredLines: js.Function0[js.Array[scala.Double]],
    merge: js.Function1[js.Object, scala.Unit],
    resetHits: js.Function0[scala.Unit],
    toJSON: js.Function0[js.Object],
    toSummary: js.Function0[CoverageSummary]
  ): FileCoverage = {
    val __obj = js.Dynamic.literal(computeBranchTotals = computeBranchTotals, computeSimpleTotals = computeSimpleTotals, getBranchCoverageByLine = getBranchCoverageByLine, getLineCoverage = getLineCoverage, getUncoveredLines = getUncoveredLines, merge = merge, resetHits = resetHits, toJSON = toJSON, toSummary = toSummary)
  
    __obj.asInstanceOf[FileCoverage]
  }
}

