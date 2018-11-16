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

