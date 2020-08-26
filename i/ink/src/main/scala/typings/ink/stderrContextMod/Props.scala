package typings.ink.stderrContextMod

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Stderr stream passed to `render()` in `options.stderr` or `process.stderr` by default.
    */
  val stderr: js.UndefOr[WriteStream] = js.native
  /**
    * Write any string to stderr, while preserving Ink's output.
    * It's useful when you want to display some external information outside of Ink's rendering and ensure there's no conflict between the two.
    * It's similar to `<Static>`, except it can't accept components, it only works with strings.
    */
  def write(data: String): Unit = js.native
}

object Props {
  @scala.inline
  def apply(write: String => Unit): Props = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
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
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
  }
  
}

