package typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod

import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageSummary
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def getChildren(): js.Array[Node]
  def getCoverageSummary(filesOnly: Boolean): CoverageSummary
  def getFileCoverage(): FileCoverage
  def getParent(): Node
  def getQualifiedName(): String
  def getRelativeName(): String
  def isRoot(): Boolean
  def isSummary(): Boolean
  def visit(visitor: Visitor[Node], state: js.Any): Unit
}

object Node {
  @scala.inline
  def apply(
    getChildren: () => js.Array[Node],
    getCoverageSummary: Boolean => CoverageSummary,
    getFileCoverage: () => FileCoverage,
    getParent: () => Node,
    getQualifiedName: () => String,
    getRelativeName: () => String,
    isRoot: () => Boolean,
    isSummary: () => Boolean,
    visit: (Visitor[Node], js.Any) => Unit
  ): Node = {
    val __obj = js.Dynamic.literal(getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), visit = js.Any.fromFunction2(visit))
  
    __obj.asInstanceOf[Node]
  }
}

