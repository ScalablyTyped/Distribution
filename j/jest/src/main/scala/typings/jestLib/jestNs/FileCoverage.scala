package typings
package jestLib.jestNs

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

