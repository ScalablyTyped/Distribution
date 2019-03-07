package typings
package handsontableLib.handsontableMod.HandsontableNs.autoRowSizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var syncLimit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(syncLimit: java.lang.String | scala.Double = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (syncLimit != null) __obj.updateDynamic("syncLimit")(syncLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

