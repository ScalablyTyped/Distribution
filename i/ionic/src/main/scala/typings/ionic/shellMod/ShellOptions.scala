package typings.ionic.shellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellOptions extends js.Object {
  val alterPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
}

object ShellOptions {
  @scala.inline
  def apply(alterPath: /* p */ String => String = null): ShellOptions = {
    val __obj = js.Dynamic.literal()
    if (alterPath != null) __obj.updateDynamic("alterPath")(js.Any.fromFunction1(alterPath))
    __obj.asInstanceOf[ShellOptions]
  }
}

