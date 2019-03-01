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
  def apply[N /* <: Node */](getRoot: js.Function0[N], visit: js.Function2[stdLib.Partial[Visitor[N]], js.Any, scala.Unit]): Tree[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRoot")(getRoot)
    __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[Tree[N]]
  }
}

