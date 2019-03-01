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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildren")(getChildren)
    __obj.updateDynamic("getCoverageSummary")(getCoverageSummary)
    __obj.updateDynamic("getFileCoverage")(getFileCoverage)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getQualifiedName")(getQualifiedName)
    __obj.updateDynamic("getRelativeName")(getRelativeName)
    __obj.updateDynamic("isRoot")(isRoot)
    __obj.updateDynamic("isSummary")(isSummary)
    __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[Node]
  }
}

