package typings.handsontable.mod.Handsontable.autoColumnSize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var syncLimit: js.UndefOr[String | Double] = js.undefined
  var useHeaders: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(syncLimit: String | Double = null, useHeaders: js.UndefOr[Boolean] = js.undefined): Settings = {
    val __obj = js.Dynamic.literal()
    if (syncLimit != null) __obj.updateDynamic("syncLimit")(syncLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(useHeaders)) __obj.updateDynamic("useHeaders")(useHeaders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

