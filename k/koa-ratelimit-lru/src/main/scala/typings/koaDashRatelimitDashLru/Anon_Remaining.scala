package typings.koaDashRatelimitDashLru

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remaining extends js.Object {
  val remaining: js.UndefOr[String] = js.undefined
  val reset: js.UndefOr[String] = js.undefined
  val total: js.UndefOr[String] = js.undefined
}

object Anon_Remaining {
  @scala.inline
  def apply(remaining: String = null, reset: String = null, total: String = null): Anon_Remaining = {
    val __obj = js.Dynamic.literal()
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Remaining]
  }
}

