package typings.jake.jake

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec extends EventEmitter {
  def append(cmd: String): Unit = js.native
  def run(): Unit = js.native
}

@JSGlobal("jake.exec")
@js.native
object exec extends js.Object {
  def apply(cmds: js.Array[String]): Unit = js.native
  def apply(cmds: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def apply(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Unit = js.native
}

