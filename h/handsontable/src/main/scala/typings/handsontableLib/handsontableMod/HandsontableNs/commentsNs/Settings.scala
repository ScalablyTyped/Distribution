package typings
package handsontableLib.handsontableMod.HandsontableNs.commentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var displayDelay: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(displayDelay: scala.Int | scala.Double = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (displayDelay != null) __obj.updateDynamic("displayDelay")(displayDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

