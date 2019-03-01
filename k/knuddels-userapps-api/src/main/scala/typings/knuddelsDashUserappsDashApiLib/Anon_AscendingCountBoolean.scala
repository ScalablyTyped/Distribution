package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingCountBoolean extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AscendingCountBoolean {
  @scala.inline
  def apply(ascending: js.UndefOr[scala.Boolean] = js.undefined, count: scala.Int | scala.Double = null): Anon_AscendingCountBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AscendingCountBoolean]
  }
}

