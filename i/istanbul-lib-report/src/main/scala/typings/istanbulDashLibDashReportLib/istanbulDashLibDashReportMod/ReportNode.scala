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
    val __obj = js.Dynamic.literal(addChild = addChild, asRelative = asRelative, children = children, fileCoverage = fileCoverage, getChildren = getChildren, getCoverageSummary = getCoverageSummary, getFileCoverage = getFileCoverage, getParent = getParent, getQualifiedName = getQualifiedName, getRelativeName = getRelativeName, isRoot = isRoot, isSummary = isSummary, path = path, visit = visit)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ReportNode]
  }
}

