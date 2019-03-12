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
    addDisposeCallback: (stdLib.Node, js.Function) => scala.Unit,
    cleanNode: stdLib.Node => stdLib.Node,
    removeDisposeCallback: (stdLib.Node, js.Function) => scala.Unit,
    removeNode: stdLib.Node => scala.Unit
  ): Anon_AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
  
    __obj.asInstanceOf[Anon_AddDisposeCallback]
  }
}

