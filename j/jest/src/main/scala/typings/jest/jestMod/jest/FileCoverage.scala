package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverage extends js.Object {
  def computeBranchTotals(): FileCoverageTotal
  def computeSimpleTotals(property: String): FileCoverageTotal
  def getBranchCoverageByLine(): js.Object
  def getLineCoverage(): js.Object
  def getUncoveredLines(): js.Array[Double]
  def merge(other: js.Object): Unit
  def resetHits(): Unit
  def toJSON(): js.Object
  def toSummary(): CoverageSummary
}

object FileCoverage {
  @scala.inline
  def apply(
    computeBranchTotals: () => FileCoverageTotal,
    computeSimpleTotals: String => FileCoverageTotal,
    getBranchCoverageByLine: () => js.Object,
    getLineCoverage: () => js.Object,
    getUncoveredLines: () => js.Array[Double],
    merge: js.Object => Unit,
    resetHits: () => Unit,
    toJSON: () => js.Object,
    toSummary: () => CoverageSummary
  ): FileCoverage = {
    val __obj = js.Dynamic.literal(computeBranchTotals = js.Any.fromFunction0(computeBranchTotals), computeSimpleTotals = js.Any.fromFunction1(computeSimpleTotals), getBranchCoverageByLine = js.Any.fromFunction0(getBranchCoverageByLine), getLineCoverage = js.Any.fromFunction0(getLineCoverage), getUncoveredLines = js.Any.fromFunction0(getUncoveredLines), merge = js.Any.fromFunction1(merge), resetHits = js.Any.fromFunction0(resetHits), toJSON = js.Any.fromFunction0(toJSON), toSummary = js.Any.fromFunction0(toSummary))
  
    __obj.asInstanceOf[FileCoverage]
  }
}

