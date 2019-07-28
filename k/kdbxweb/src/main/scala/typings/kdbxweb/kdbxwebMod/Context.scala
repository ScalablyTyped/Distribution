package typings.kdbxweb.kdbxwebMod

import typings.std.Date
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Context")
@js.native
class Context protected () extends js.Object {
  def this(opts: Kdbx) = this()
  def setXmlDate(node: Node, dt: Date): Unit = js.native
}

