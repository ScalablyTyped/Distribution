package typings.inquirer.mod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an input and an output-stream.
  */
@js.native
trait StreamOptions extends js.Object {
  /**
    * A stream to read the input from.
    */
  var input: js.UndefOr[ReadStream] = js.native
  /**
    * A stream to write the output to.
    */
  var output: js.UndefOr[WriteStream] = js.native
}

object StreamOptions {
  @scala.inline
  def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  @scala.inline
  implicit class StreamOptionsOps[Self <: StreamOptions] (val x: Self) extends AnyVal {
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
    def setInput(value: ReadStream): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOutput(value: WriteStream): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

