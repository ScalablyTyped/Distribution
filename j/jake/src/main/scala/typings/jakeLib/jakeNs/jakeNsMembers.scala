package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake")
@js.native
object jakeNsMembers extends js.Object {
  var logger: Logger = js.native
  var program: jakeLib.Anon_TaskArgs = js.native
  def addListener(event: java.lang.String, listener: js.Function): nodeLib.NodeJSNs.EventEmitter = js.native
  def cpR(path: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def cpR(
    path: java.lang.String,
    destination: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def cpR(path: java.lang.String, destination: java.lang.String, opts: UtilOptions): scala.Unit = js.native
  def cpR(
    path: java.lang.String,
    destination: java.lang.String,
    opts: UtilOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createExec(cmds: java.lang.String): Exec = js.native
  def createExec(cmds: java.lang.String, callback: js.Function0[scala.Unit]): Exec = js.native
  def createExec(cmds: java.lang.String, callback: js.Function0[scala.Unit], opts: ExecOptions): Exec = js.native
  def createExec(cmds: java.lang.String, opts: ExecOptions): Exec = js.native
  def createExec(cmds: java.lang.String, opts: ExecOptions, callback: js.Function0[scala.Unit]): Exec = js.native
  def createExec(cmds: js.Array[java.lang.String]): Exec = js.native
  def createExec(cmds: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): Exec = js.native
  def createExec(cmds: js.Array[java.lang.String], callback: js.Function0[scala.Unit], opts: ExecOptions): Exec = js.native
  def createExec(cmds: js.Array[java.lang.String], opts: ExecOptions): Exec = js.native
  def createExec(cmds: js.Array[java.lang.String], opts: ExecOptions, callback: js.Function0[scala.Unit]): Exec = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def exec(cmds: js.Array[java.lang.String]): scala.Unit = js.native
  def exec(cmds: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def exec(cmds: js.Array[java.lang.String], callback: js.Function0[scala.Unit], opts: ExecOptions): scala.Unit = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def mkdirP(name: java.lang.String): scala.Unit = js.native
  def mkdirP(name: java.lang.String, f: js.Function2[/* er */ nodeLib.Error, /* made */ js.Any, scala.Unit]): scala.Unit = js.native
  def mkdirP(name: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdirP(
    name: java.lang.String,
    mode: java.lang.String,
    f: js.Function2[/* er */ nodeLib.Error, /* made */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): nodeLib.NodeJSNs.EventEmitter = js.native
  def once(event: java.lang.String, listener: js.Function): nodeLib.NodeJSNs.EventEmitter = js.native
  def readdirR(name: java.lang.String): js.Array[java.lang.String] = js.native
  def readdirR(name: java.lang.String, opts: UtilOptions): js.Array[java.lang.String] = js.native
  def removeAllListener(event: java.lang.String): nodeLib.NodeJSNs.EventEmitter = js.native
  def removeListener(event: java.lang.String, listener: js.Function): nodeLib.NodeJSNs.EventEmitter = js.native
  def rmRf(name: java.lang.String): scala.Unit = js.native
  def rmRf(name: java.lang.String, opts: UtilOptions): scala.Unit = js.native
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
}

