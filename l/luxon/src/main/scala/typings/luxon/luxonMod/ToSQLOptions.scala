package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToSQLOptions extends js.Object {
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  var includeZone: js.UndefOr[Boolean] = js.undefined
}

object ToSQLOptions {
  @scala.inline
  def apply(includeOffset: js.UndefOr[Boolean] = js.undefined, includeZone: js.UndefOr[Boolean] = js.undefined): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOffset)) __obj.updateDynamic("includeOffset")(includeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(includeZone)) __obj.updateDynamic("includeZone")(includeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToSQLOptions]
  }
}

