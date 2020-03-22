package typings.jpm

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnError extends js.Object {
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var window: Window_ = js.native
  def onError(): js.Any = js.native
  def onError(data: js.Any): js.Any = js.native
  def onMessage(): js.Any = js.native
  def onMessage(data: js.Any): js.Any = js.native
}

