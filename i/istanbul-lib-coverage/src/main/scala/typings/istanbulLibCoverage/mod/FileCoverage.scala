package typings.istanbulLibCoverage.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-coverage", "FileCoverage")
@js.native
class FileCoverage protected () extends FileCoverageData {
  def this(data: String) = this()
  def this(data: FileCoverage) = this()
  def this(data: FileCoverageData) = this()
  /* CompleteClass */
  override var b: StringDictionary[js.Array[Double]] = js.native
  /* CompleteClass */
  override var branchMap: StringDictionary[BranchMapping] = js.native
  var data: FileCoverageData = js.native
  /* CompleteClass */
  override var f: StringDictionary[Double] = js.native
  /* CompleteClass */
  override var fnMap: StringDictionary[FunctionMapping] = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var s: StringDictionary[Double] = js.native
  /* CompleteClass */
  override var statementMap: StringDictionary[Range] = js.native
  def computeBranchTotals(): Totals = js.native
  def computeSimpleTotals(): Totals = js.native
  def getBranchCoverageByLine(): NumberDictionary[Coverage] = js.native
  def getLineCoverage(): NumberDictionary[Double] = js.native
  def getUncoveredLines(): js.Array[Double] = js.native
  def merge(other: FileCoverageData): Unit = js.native
  def resetHits(): Unit = js.native
  def toJSON(): js.Object = js.native
  def toSummary(): CoverageSummary = js.native
}

