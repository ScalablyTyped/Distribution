package typings.handsontable.handsontableMod.HandsontableNs.commentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var displayDelay: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(displayDelay: Int | Double = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (displayDelay != null) __obj.updateDynamic("displayDelay")(displayDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

