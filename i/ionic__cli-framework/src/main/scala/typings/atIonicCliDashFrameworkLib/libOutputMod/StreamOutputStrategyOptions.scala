package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val stream: nodeLib.NodeJSNs.WritableStream
}

object StreamOutputStrategyOptions {
  @scala.inline
  def apply(
    stream: nodeLib.NodeJSNs.WritableStream,
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null
  ): StreamOutputStrategyOptions = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[StreamOutputStrategyOptions]
  }
}

