package typings.inquirer.inquirerMod

import typings.node.processMod.Global.NodeJS.ReadStream
import typings.node.processMod.Global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an input and an output-stream.
  */
trait StreamOptions extends js.Object {
  /**
    * A stream to read the input from.
    */
  var input: js.UndefOr[ReadStream] = js.undefined
  /**
    * A stream to write the output to.
    */
  var output: js.UndefOr[WriteStream] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(input: ReadStream = null, output: WriteStream = null): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[StreamOptions]
  }
}

