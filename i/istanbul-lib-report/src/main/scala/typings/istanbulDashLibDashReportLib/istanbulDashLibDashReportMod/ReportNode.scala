package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportNode extends Node {
  var children: js.Array[ReportNode]
  var fileCoverage: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage
  var parent: ReportNode | scala.Null
  var path: java.lang.String
  def addChild(child: ReportNode): scala.Unit
  def asRelative(p: java.lang.String): java.lang.String
}

object ReportNode {
  @scala.inline
  def apply(
    addChild: js.Function1[ReportNode, scala.Unit],
    asRelative: js.Function1[java.lang.String, java.lang.String],
    children: js.Array[ReportNode],
    fileCoverage: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage,
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
    path: java.lang.String,
    visit: js.Function2[Visitor[ReportNode], js.Any, scala.Unit],
    parent: ReportNode = null
  ): ReportNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addChild")(addChild)
    __obj.updateDynamic("asRelative")(asRelative)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("fileCoverage")(fileCoverage)
    __obj.updateDynamic("getChildren")(getChildren)
    __obj.updateDynamic("getCoverageSummary")(getCoverageSummary)
    __obj.updateDynamic("getFileCoverage")(getFileCoverage)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getQualifiedName")(getQualifiedName)
    __obj.updateDynamic("getRelativeName")(getRelativeName)
    __obj.updateDynamic("isRoot")(isRoot)
    __obj.updateDynamic("isSummary")(isSummary)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("visit")(visit)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ReportNode]
  }
}

