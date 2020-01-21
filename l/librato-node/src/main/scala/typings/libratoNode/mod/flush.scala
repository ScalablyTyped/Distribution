package typings.libratoNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", "flush")
@js.native
object flush extends js.Object {
  def apply(): Unit = js.native
  def apply(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

