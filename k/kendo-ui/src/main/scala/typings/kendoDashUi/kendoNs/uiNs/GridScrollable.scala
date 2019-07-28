package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridScrollable extends js.Object {
  var endless: js.UndefOr[Boolean] = js.undefined
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object GridScrollable {
  @scala.inline
  def apply(endless: js.UndefOr[Boolean] = js.undefined, virtual: js.UndefOr[Boolean] = js.undefined): GridScrollable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endless)) __obj.updateDynamic("endless")(endless)
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual)
    __obj.asInstanceOf[GridScrollable]
  }
}

