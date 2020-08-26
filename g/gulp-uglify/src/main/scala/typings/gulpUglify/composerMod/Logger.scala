package typings.gulpUglify.composerMod

import typings.gulpUglify.anon.FnCallMessageOptionalParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("warn")
  var warn_Original: FnCallMessageOptionalParams = js.native
  def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

