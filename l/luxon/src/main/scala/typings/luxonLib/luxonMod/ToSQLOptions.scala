package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToSQLOptions extends js.Object {
  var includeOffset: js.UndefOr[scala.Boolean] = js.undefined
  var includeZone: js.UndefOr[scala.Boolean] = js.undefined
}

object ToSQLOptions {
  @scala.inline
  def apply(
    includeOffset: js.UndefOr[scala.Boolean] = js.undefined,
    includeZone: js.UndefOr[scala.Boolean] = js.undefined
  ): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOffset)) __obj.updateDynamic("includeOffset")(includeOffset)
    if (!js.isUndefined(includeZone)) __obj.updateDynamic("includeZone")(includeZone)
    __obj.asInstanceOf[ToSQLOptions]
  }
}

