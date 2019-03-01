package typings
package koaDashRatelimitDashLruLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remaining extends js.Object {
  val remaining: js.UndefOr[java.lang.String] = js.undefined
  val reset: js.UndefOr[java.lang.String] = js.undefined
  val total: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Remaining {
  @scala.inline
  def apply(remaining: java.lang.String = null, reset: java.lang.String = null, total: java.lang.String = null): Anon_Remaining = {
    val __obj = js.Dynamic.literal()
    if (remaining != null) __obj.updateDynamic("remaining")(remaining)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_Remaining]
  }
}

