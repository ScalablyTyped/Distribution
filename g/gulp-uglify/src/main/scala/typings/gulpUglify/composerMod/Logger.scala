package typings.gulpUglify.composerMod

import typings.gulpUglify.FnMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("warn")
  var warn_Original: FnMessage = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

