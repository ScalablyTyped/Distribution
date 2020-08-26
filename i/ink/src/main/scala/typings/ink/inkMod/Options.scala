package typings.ink.inkMod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var debug: Boolean = js.native
  var exitOnCtrlC: Boolean = js.native
  var patchConsole: Boolean = js.native
  var stderr: WriteStream = js.native
  var stdin: ReadStream = js.native
  var stdout: WriteStream = js.native
  var waitUntilExit: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
}

object Options {
  @scala.inline
  def apply(
    debug: Boolean,
    exitOnCtrlC: Boolean,
    patchConsole: Boolean,
    stderr: WriteStream,
    stdin: ReadStream,
    stdout: WriteStream
  ): Options = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], patchConsole = patchConsole.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitOnCtrlC(value: Boolean): Self = this.set("exitOnCtrlC", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchConsole(value: Boolean): Self = this.set("patchConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdin(value: ReadStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitUntilExit(value: () => js.Promise[Unit]): Self = this.set("waitUntilExit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWaitUntilExit: Self = this.set("waitUntilExit", js.undefined)
  }
  
}

