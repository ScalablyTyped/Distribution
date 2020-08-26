package typings.ink.renderMod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  /**
    * If true, each update will be rendered as a separate output, without replacing the previous one.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Configure whether Ink should listen to Ctrl+C keyboard input and exit the app. This is needed in case `process.stdin` is in raw mode, because then Ctrl+C is ignored by default and process is expected to handle it manually.
    *
    * @default true
    */
  var exitOnCtrlC: js.UndefOr[Boolean] = js.native
  /**
    * Patch console methods to ensure console output doesn't mix with Ink output.
    *
    * @default true
    */
  var patchConsole: js.UndefOr[Boolean] = js.native
  /**
    * Error stream.
    * @default process.stderr
    */
  var stderr: js.UndefOr[WriteStream] = js.native
  /**
    * Input stream where app will listen for input.
    *
    * @default process.stdin
    */
  var stdin: js.UndefOr[ReadStream] = js.native
  /**
    * Output stream where app will be rendered.
    *
    * @default process.stdout
    */
  var stdout: js.UndefOr[WriteStream] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
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
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setExitOnCtrlC(value: Boolean): Self = this.set("exitOnCtrlC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitOnCtrlC: Self = this.set("exitOnCtrlC", js.undefined)
    @scala.inline
    def setPatchConsole(value: Boolean): Self = this.set("patchConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchConsole: Self = this.set("patchConsole", js.undefined)
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdin(value: ReadStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
  
}

