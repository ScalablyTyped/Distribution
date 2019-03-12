package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N
  def visit(visitor: stdLib.Partial[Visitor[N]], state: js.Any): scala.Unit
}

object Tree {
  @scala.inline
  def apply[N /* <: Node */](getRoot: () => N, visit: (stdLib.Partial[Visitor[N]], js.Any) => scala.Unit): Tree[N] = {
    val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
  
    __obj.asInstanceOf[Tree[N]]
  }
}

