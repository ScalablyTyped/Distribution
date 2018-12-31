package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SDK port API
  * @see [port API]{@link https://developer.mozilla.org/en-US/Add-ons/SDK/Guides/using_port}
  */
@js.native
trait Port extends js.Object {
  def emit(event: java.lang.String): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* data */ js.UndefOr[js.Any], _]): scala.Unit = js.native
}

