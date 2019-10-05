package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SDK port API
  * @see [port API]{@link https://developer.mozilla.org/en-US/Add-ons/SDK/Guides/using_port}
  */
@js.native
trait Port extends js.Object {
  def emit(event: String): Unit = js.native
  def emit(event: String, data: js.Any): Unit = js.native
  def on(event: String, handler: js.Function1[/* data */ js.UndefOr[js.Any], _]): Unit = js.native
}

