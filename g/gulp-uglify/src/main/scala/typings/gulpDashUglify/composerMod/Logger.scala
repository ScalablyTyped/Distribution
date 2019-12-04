package typings.gulpDashUglify.composerMod

import typings.gulpDashUglify.Fn_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("warn")
  var warn_Original: Fn_Message = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

