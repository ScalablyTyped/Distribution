package typings.istanbulLibCoverage.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-lib-coverage", "FileCoverage")
@js.native
class FileCoverage protected () extends FileCoverageData {
  def this(data: String) = this()
  def this(data: FileCoverage) = this()
  def this(data: FileCoverageData) = this()
  
  def computeBranchTotals(): Totals = js.native
  
  def computeSimpleTotals(): Totals = js.native
  
  var data: FileCoverageData = js.native
  
  def getBranchCoverageByLine(): NumberDictionary[Coverage] = js.native
  
  def getLineCoverage(): NumberDictionary[Double] = js.native
  
  def getUncoveredLines(): js.Array[Double] = js.native
  
  def merge(other: FileCoverageData): Unit = js.native
  
  def resetHits(): Unit = js.native
  
  def toJSON(): js.Object = js.native
  
  def toSummary(): CoverageSummary = js.native
}
