package typings.lwip.mod

import typings.lwip.AnonHeight
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lwip", "open")
@js.native
object open extends js.Object {
  def apply(source: String, callback: ImageCallback): Unit = js.native
  def apply(source: String, `type`: String, callback: ImageCallback): Unit = js.native
  def apply(source: Buffer, `type`: String, callback: ImageCallback): js.Any = js.native
  def apply(source: Buffer, `type`: AnonHeight, callback: ImageCallback): js.Any = js.native
}

