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
    addChild: ReportNode => scala.Unit,
    asRelative: java.lang.String => java.lang.String,
    children: js.Array[ReportNode],
    fileCoverage: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage,
    getChildren: () => js.Array[Node],
    getCoverageSummary: scala.Boolean => istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageSummary,
    getFileCoverage: () => istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage,
    getParent: () => Node,
    getQualifiedName: () => java.lang.String,
    getRelativeName: () => java.lang.String,
    isRoot: () => scala.Boolean,
    isSummary: () => scala.Boolean,
    path: java.lang.String,
    visit: (Visitor[ReportNode], js.Any) => scala.Unit,
    parent: ReportNode = null
  ): ReportNode = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children, fileCoverage = fileCoverage, getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path, visit = js.Any.fromFunction2(visit))
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ReportNode]
  }
}

