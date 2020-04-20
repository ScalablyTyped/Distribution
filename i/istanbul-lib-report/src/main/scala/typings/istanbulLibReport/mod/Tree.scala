package typings.istanbulLibReport.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N
  def visit(visitor: Partial[Visitor[N]], state: js.Any): Unit
}

object Tree {
  @scala.inline
  def apply[N /* <: Node */](getRoot: () => N, visit: (Partial[Visitor[N]], js.Any) => Unit): Tree[N] = {
    val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Tree[N]]
  }
}

