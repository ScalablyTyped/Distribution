package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-coverage", "FileCoverage")
@js.native
class FileCoverage protected () extends FileCoverageData {
  def this(data: FileCoverageData) = this()
  def this(data: java.lang.String) = this()
  /* CompleteClass */
  override var b: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var branchMap: org.scalablytyped.runtime.StringDictionary[BranchMapping] = js.native
  var data: FileCoverageData = js.native
  /* CompleteClass */
  override var f: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /* CompleteClass */
  override var fnMap: org.scalablytyped.runtime.StringDictionary[FunctionMapping] = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var s: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /* CompleteClass */
  override var statementMap: org.scalablytyped.runtime.StringDictionary[Range] = js.native
  def computeBranchTotals(): Totals = js.native
  def computeSimpleTotals(): Totals = js.native
  def getBranchCoverageByLine(): org.scalablytyped.runtime.NumberDictionary[Coverage] = js.native
  def getLineCoverage(): org.scalablytyped.runtime.NumberDictionary[scala.Double] = js.native
  def getUncoveredLines(): js.Array[scala.Double] = js.native
  def merge(other: FileCoverageData): scala.Unit = js.native
  def resetHits(): scala.Unit = js.native
  def toJSON(): js.Object = js.native
  def toSummary(): CoverageSummary = js.native
}

