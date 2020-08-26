package typings.jestCore.anon

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stdin extends js.Object {
  var stdin: ReadStream = js.native
  var stdout: WriteStream = js.native
}

object Stdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): Stdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdin]
  }
  @scala.inline
  implicit class StdinOps[Self <: Stdin] (val x: Self) extends AnyVal {
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
    def setStdin(value: ReadStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

