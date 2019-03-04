package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomBarOutputStrategyOptions extends js.Object {
  val BottomBar: inquirerLib.Anon_BottomBar
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val input: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  val output: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
}

object BottomBarOutputStrategyOptions {
  @scala.inline
  def apply(
    BottomBar: inquirerLib.Anon_BottomBar,
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    input: nodeLib.NodeJSNs.ReadableStream = null,
    output: nodeLib.NodeJSNs.WritableStream = null
  ): BottomBarOutputStrategyOptions = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[BottomBarOutputStrategyOptions]
  }
}

