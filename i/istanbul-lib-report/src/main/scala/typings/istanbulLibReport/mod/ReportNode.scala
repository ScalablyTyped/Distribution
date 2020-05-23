package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageSummary
import typings.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportNode extends Node {
  var children: js.Array[ReportNode]
  var fileCoverage: FileCoverage
  var parent: ReportNode | Null
  var path: String
  def addChild(child: ReportNode): Unit
  def asRelative(p: String): String
  def getChildren(): js.Array[Node]
  def getCoverageSummary(filesOnly: Boolean): CoverageSummary
  def getFileCoverage(): FileCoverage
  def getParent(): Node
  def getQualifiedName(): String
  def getRelativeName(): String
  def isSummary(): Boolean
}

object ReportNode {
  @scala.inline
  def apply(
    addChild: ReportNode => Unit,
    asRelative: String => String,
    children: js.Array[ReportNode],
    fileCoverage: FileCoverage,
    getChildren: () => js.Array[Node],
    getCoverageSummary: Boolean => CoverageSummary,
    getFileCoverage: () => FileCoverage,
    getParent: () => Node,
    getQualifiedName: () => String,
    getRelativeName: () => String,
    isRoot: () => Boolean,
    isSummary: () => Boolean,
    path: String,
    visit: (Visitor[Node], js.Any) => Unit,
    parent: ReportNode = null
  ): ReportNode = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit), parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportNode]
  }
}

