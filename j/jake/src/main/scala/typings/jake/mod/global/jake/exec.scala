package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake.exec")
@js.native
object exec extends js.Object {
  def apply(cmds: js.Array[String]): Unit = js.native
  def apply(cmds: js.Array[String], callback: js.UndefOr[scala.Nothing], opts: ExecOptions): Unit = js.native
  def apply(cmds: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def apply(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Unit = js.native
}

