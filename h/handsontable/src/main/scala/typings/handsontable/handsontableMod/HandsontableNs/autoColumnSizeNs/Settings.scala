package typings.handsontable.handsontableMod.HandsontableNs.autoColumnSizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var syncLimit: js.UndefOr[String | Double] = js.undefined
  var userHeaders: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(syncLimit: String | Double = null, userHeaders: js.UndefOr[Boolean] = js.undefined): Settings = {
    val __obj = js.Dynamic.literal()
    if (syncLimit != null) __obj.updateDynamic("syncLimit")(syncLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(userHeaders)) __obj.updateDynamic("userHeaders")(userHeaders)
    __obj.asInstanceOf[Settings]
  }
}

