package typings.ink.stdinContextMod

import typings.node.processMod.global.NodeJS.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * A boolean flag determining if the current `stdin` supports `setRawMode`. A component using `setRawMode` might want to use `isRawModeSupported` to nicely fall back in environments where raw mode is not supported.
    */
  val isRawModeSupported: Boolean = js.native
  /**
    * Stdin stream passed to `render()` in `options.stdin` or `process.stdin` by default. Useful if your app needs to handle user input.
    */
  val stdin: js.UndefOr[ReadStream] = js.native
  /**
    * Ink exposes this function via own `<StdinContext>` to be able to handle Ctrl+C, that's why you should use Ink's `setRawMode` instead of `process.stdin.setRawMode`.
    * If the `stdin` stream passed to Ink does not support setRawMode, this function does nothing.
    */
  def setRawMode(value: Boolean): Unit = js.native
}

object Props {
  @scala.inline
  def apply(isRawModeSupported: Boolean, setRawMode: Boolean => Unit): Props = {
    val __obj = js.Dynamic.literal(isRawModeSupported = isRawModeSupported.asInstanceOf[js.Any], setRawMode = js.Any.fromFunction1(setRawMode))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setIsRawModeSupported(value: Boolean): Self = this.set("isRawModeSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRawMode(value: Boolean => Unit): Self = this.set("setRawMode", js.Any.fromFunction1(value))
    @scala.inline
    def setStdin(value: ReadStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
  }
  
}

