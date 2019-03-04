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

object Node {
  @scala.inline
  def apply(
    getChildren: js.Function0[js.Array[Node]],
    getCoverageSummary: js.Function1[
      scala.Boolean, 
      istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageSummary
    ],
    getFileCoverage: js.Function0[istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage],
    getParent: js.Function0[Node],
    getQualifiedName: js.Function0[java.lang.String],
    getRelativeName: js.Function0[java.lang.String],
    isRoot: js.Function0[scala.Boolean],
    isSummary: js.Function0[scala.Boolean],
    visit: js.Function2[Visitor[Node], js.Any, scala.Unit]
  ): Node = {
    val __obj = js.Dynamic.literal(getChildren = getChildren, getCoverageSummary = getCoverageSummary, getFileCoverage = getFileCoverage, getParent = getParent, getQualifiedName = getQualifiedName, getRelativeName = getRelativeName, isRoot = isRoot, isSummary = isSummary, visit = visit)
  
    __obj.asInstanceOf[Node]
  }
}

