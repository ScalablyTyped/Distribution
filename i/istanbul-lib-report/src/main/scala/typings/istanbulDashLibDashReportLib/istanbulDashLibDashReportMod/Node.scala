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
    getChildren: () => js.Array[Node],
    getCoverageSummary: scala.Boolean => istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageSummary,
    getFileCoverage: () => istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage,
    getParent: () => Node,
    getQualifiedName: () => java.lang.String,
    getRelativeName: () => java.lang.String,
    isRoot: () => scala.Boolean,
    isSummary: () => scala.Boolean,
    visit: (Visitor[Node], js.Any) => scala.Unit
  ): Node = {
    val __obj = js.Dynamic.literal(getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), visit = js.Any.fromFunction2(visit))
  
    __obj.asInstanceOf[Node]
  }
}

