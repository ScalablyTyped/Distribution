package typings
package handsontableLib.handsontableMod.HandsontableNs.autoColumnSizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var syncLimit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var userHeaders: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    syncLimit: java.lang.String | scala.Double = null,
    userHeaders: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (syncLimit != null) __obj.updateDynamic("syncLimit")(syncLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(userHeaders)) __obj.updateDynamic("userHeaders")(userHeaders)
    __obj.asInstanceOf[Settings]
  }
}

