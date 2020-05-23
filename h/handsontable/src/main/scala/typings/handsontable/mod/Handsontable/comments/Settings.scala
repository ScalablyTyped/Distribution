package typings.handsontable.mod.Handsontable.comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var displayDelay: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(displayDelay: js.UndefOr[Double] = js.undefined): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayDelay)) __obj.updateDynamic("displayDelay")(displayDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

