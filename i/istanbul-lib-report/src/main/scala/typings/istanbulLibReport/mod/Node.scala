package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def isRoot(): Boolean
  def visit(visitor: Visitor[Node], state: js.Any): Unit
}

object Node {
  @scala.inline
  def apply(isRoot: () => Boolean, visit: (Visitor[Node], js.Any) => Unit): Node = {
    val __obj = js.Dynamic.literal(isRoot = js.Any.fromFunction0(isRoot), visit = js.Any.fromFunction2(visit))
  
    __obj.asInstanceOf[Node]
  }
}

