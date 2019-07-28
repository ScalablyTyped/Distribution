package typings.jqueryDotAjaxfile

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Element, callback: js.Function): Unit = js.native
  def cleanNode(node: Node): Element = js.native
  def removeDisposeCallback(node: Element, callback: js.Function): Unit = js.native
  def removeNode(node: Node): Unit = js.native
}

