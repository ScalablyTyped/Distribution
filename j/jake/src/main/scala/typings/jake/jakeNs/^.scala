package typings.jake.jakeNs

import typings.node.NodeJSNs.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake")
@js.native
object ^ extends js.Object {
  var logger: Logger = js.native
  def addListener(event: String, listener: js.Function): EventEmitter = js.native
  def cpR(path: String, destination: String): Unit = js.native
  def cpR(path: String, destination: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def cpR(path: String, destination: String, opts: UtilOptions): Unit = js.native
  def cpR(path: String, destination: String, opts: UtilOptions, callback: js.Function0[Unit]): Unit = js.native
  def createExec(cmds: String): Exec = js.native
  def createExec(cmds: String, callback: js.Function0[Unit]): Exec = js.native
  def createExec(cmds: String, callback: js.Function0[Unit], opts: ExecOptions): Exec = js.native
  def createExec(cmds: String, opts: ExecOptions): Exec = js.native
  def createExec(cmds: String, opts: ExecOptions, callback: js.Function0[Unit]): Exec = js.native
  def createExec(cmds: js.Array[String]): Exec = js.native
  def createExec(cmds: js.Array[String], callback: js.Function0[Unit]): Exec = js.native
  def createExec(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Exec = js.native
  def createExec(cmds: js.Array[String], opts: ExecOptions): Exec = js.native
  def createExec(cmds: js.Array[String], opts: ExecOptions, callback: js.Function0[Unit]): Exec = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def exec(cmds: js.Array[String]): Unit = js.native
  def exec(cmds: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def exec(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Unit = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def mkdirP(name: String): Unit = js.native
  def mkdirP(name: String, f: js.Function2[/* er */ Error, /* made */ js.Any, Unit]): Unit = js.native
  def mkdirP(name: String, mode: String): Unit = js.native
  def mkdirP(name: String, mode: String, f: js.Function2[/* er */ Error, /* made */ js.Any, Unit]): Unit = js.native
  def on(event: String, listener: js.Function): EventEmitter = js.native
  def once(event: String, listener: js.Function): EventEmitter = js.native
  def readdirR(name: String): js.Array[String] = js.native
  def readdirR(name: String, opts: UtilOptions): js.Array[String] = js.native
  def removeAllListener(event: String): EventEmitter = js.native
  def removeListener(event: String, listener: js.Function): EventEmitter = js.native
  def rmRf(name: String): Unit = js.native
  def rmRf(name: String, opts: UtilOptions): Unit = js.native
  def setMaxListeners(n: Double): Unit = js.native
}

