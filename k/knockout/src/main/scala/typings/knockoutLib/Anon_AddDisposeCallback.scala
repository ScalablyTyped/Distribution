package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: stdLib.Node, callback: js.Function): scala.Unit
  def cleanNode(node: stdLib.Node): stdLib.Node
  def removeDisposeCallback(node: stdLib.Node, callback: js.Function): scala.Unit
  def removeNode(node: stdLib.Node): scala.Unit
}

object Anon_AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: js.Function2[stdLib.Node, js.Function, scala.Unit],
    cleanNode: js.Function1[stdLib.Node, stdLib.Node],
    removeDisposeCallback: js.Function2[stdLib.Node, js.Function, scala.Unit],
    removeNode: js.Function1[stdLib.Node, scala.Unit]
  ): Anon_AddDisposeCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDisposeCallback")(addDisposeCallback)
    __obj.updateDynamic("cleanNode")(cleanNode)
    __obj.updateDynamic("removeDisposeCallback")(removeDisposeCallback)
    __obj.updateDynamic("removeNode")(removeNode)
    __obj.asInstanceOf[Anon_AddDisposeCallback]
  }
}

