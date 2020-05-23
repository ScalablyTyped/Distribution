package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridScrollable extends js.Object {
  var endless: js.UndefOr[Boolean] = js.undefined
  var virtual: js.UndefOr[Boolean | String] = js.undefined
}

object GridScrollable {
  @scala.inline
  def apply(endless: js.UndefOr[Boolean] = js.undefined, virtual: Boolean | String = null): GridScrollable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endless)) __obj.updateDynamic("endless")(endless.get.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridScrollable]
  }
}

