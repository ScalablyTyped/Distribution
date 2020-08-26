package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  def isRoot(): Boolean = js.native
  def visit(visitor: Visitor[Node], state: js.Any): Unit = js.native
}

object Node {
  @scala.inline
  def apply(isRoot: () => Boolean, visit: (Visitor[Node], js.Any) => Unit): Node = {
    val __obj = js.Dynamic.literal(isRoot = js.Any.fromFunction0(isRoot), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setIsRoot(value: () => Boolean): Self = this.set("isRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setVisit(value: (Visitor[Node], js.Any) => Unit): Self = this.set("visit", js.Any.fromFunction2(value))
  }
  
}

