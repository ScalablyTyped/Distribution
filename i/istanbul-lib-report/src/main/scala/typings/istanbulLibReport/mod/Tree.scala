package typings.istanbulLibReport.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N = js.native
  def visit(visitor: Partial[Visitor[N]], state: js.Any): Unit = js.native
}

object Tree {
  @scala.inline
  def apply[/* <: typings.istanbulLibReport.mod.Node */ N](getRoot: () => N, visit: (Partial[Visitor[N]], js.Any) => Unit): Tree[N] = {
    val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Tree[N]]
  }
  @scala.inline
  implicit class TreeOps[Self <: Tree[_], /* <: typings.istanbulLibReport.mod.Node */ N] (val x: Self with Tree[N]) extends AnyVal {
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
    def setGetRoot(value: () => N): Self = this.set("getRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setVisit(value: (Partial[Visitor[N]], js.Any) => Unit): Self = this.set("visit", js.Any.fromFunction2(value))
  }
  
}

