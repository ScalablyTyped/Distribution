package typings.gulpUglify.composerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("warn")
  var warn_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  def warn(data: js.Any*): Unit = js.native
}

