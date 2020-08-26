package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageSummary
import typings.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportNode extends Node {
  var children: js.Array[ReportNode] = js.native
  var fileCoverage: FileCoverage = js.native
  var parent: ReportNode | Null = js.native
  var path: String = js.native
  def addChild(child: ReportNode): Unit = js.native
  def asRelative(p: String): String = js.native
  def getChildren(): js.Array[Node] = js.native
  def getCoverageSummary(filesOnly: Boolean): CoverageSummary = js.native
  def getFileCoverage(): FileCoverage = js.native
  def getParent(): Node = js.native
  def getQualifiedName(): String = js.native
  def getRelativeName(): String = js.native
  def isSummary(): Boolean = js.native
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
    visit: (Visitor[Node], js.Any) => Unit
  ): ReportNode = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[ReportNode]
  }
  @scala.inline
  implicit class ReportNodeOps[Self <: ReportNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddChild(value: ReportNode => Unit): Self = this.set("addChild", js.Any.fromFunction1(value))
    @scala.inline
    def setAsRelative(value: String => String): Self = this.set("asRelative", js.Any.fromFunction1(value))
    @scala.inline
    def setChildrenVarargs(value: ReportNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReportNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileCoverage(value: FileCoverage): Self = this.set("fileCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetChildren(value: () => js.Array[Node]): Self = this.set("getChildren", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCoverageSummary(value: Boolean => CoverageSummary): Self = this.set("getCoverageSummary", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFileCoverage(value: () => FileCoverage): Self = this.set("getFileCoverage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => Node): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQualifiedName(value: () => String): Self = this.set("getQualifiedName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRelativeName(value: () => String): Self = this.set("getRelativeName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSummary(value: () => Boolean): Self = this.set("isSummary", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ReportNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

