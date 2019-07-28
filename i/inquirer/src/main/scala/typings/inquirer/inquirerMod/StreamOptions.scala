package typings.inquirer.inquirerMod

import typings.node.NodeJSNs.ReadStream
import typings.node.NodeJSNs.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  var input: js.UndefOr[ReadStream] = js.undefined
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

