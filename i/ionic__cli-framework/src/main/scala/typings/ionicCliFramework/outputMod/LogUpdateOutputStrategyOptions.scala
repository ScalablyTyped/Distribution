package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogUpdateOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val stream: js.UndefOr[WritableStream] = js.undefined
}

object LogUpdateOutputStrategyOptions {
  @scala.inline
  def apply(colors: Colors = null, stream: WritableStream = null): LogUpdateOutputStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogUpdateOutputStrategyOptions]
  }
}

