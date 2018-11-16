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
  override var b: ScalablyTyped.runtime.StringDictionary[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var branchMap: ScalablyTyped.runtime.StringDictionary[BranchMapping] = js.native
  var data: FileCoverageData = js.native
  /* CompleteClass */
  override var f: ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /* CompleteClass */
  override var fnMap: ScalablyTyped.runtime.StringDictionary[FunctionMapping] = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var s: ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /* CompleteClass */
  override var statementMap: ScalablyTyped.runtime.StringDictionary[Range] = js.native
  def computeBranchTotals(): Totals = js.native
  def computeSimpleTotals(): Totals = js.native
  def getBranchCoverageByLine(): ScalablyTyped.runtime.NumberDictionary[Coverage] = js.native
  def getLineCoverage(): ScalablyTyped.runtime.NumberDictionary[scala.Double] = js.native
  def getUncoveredLines(): js.Array[scala.Double] = js.native
  def merge(other: FileCoverageData): scala.Unit = js.native
  def resetHits(): scala.Unit = js.native
  def toJSON(): js.Object = js.native
  def toSummary(): CoverageSummary = js.native
}

