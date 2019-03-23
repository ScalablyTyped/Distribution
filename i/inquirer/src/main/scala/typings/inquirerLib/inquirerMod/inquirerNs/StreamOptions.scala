package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  var input: js.UndefOr[nodeLib.NodeJSNs.ReadStream] = js.undefined
  var output: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(input: nodeLib.NodeJSNs.ReadStream = null, output: nodeLib.NodeJSNs.WriteStream = null): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[StreamOptions]
  }
}

