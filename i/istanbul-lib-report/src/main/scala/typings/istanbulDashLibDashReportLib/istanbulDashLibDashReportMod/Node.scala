package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node extends js.Object {
  def getChildren(): js.Array[Node]
  def getCoverageSummary(filesOnly: scala.Boolean): istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageSummary
  def getFileCoverage(): istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage
  def getParent(): Node
  def getQualifiedName(): java.lang.String
  def getRelativeName(): java.lang.String
  def isRoot(): scala.Boolean
  def isSummary(): scala.Boolean
  def visit(visitor: Visitor[Node], state: js.Any): scala.Unit
}

