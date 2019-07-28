package typings.atIonicCliDashFramework.libOutputMod

import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val stream: WritableStream
}

object StreamOutputStrategyOptions {
  @scala.inline
  def apply(stream: WritableStream, colors: Colors = null): StreamOutputStrategyOptions = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[StreamOutputStrategyOptions]
  }
}

