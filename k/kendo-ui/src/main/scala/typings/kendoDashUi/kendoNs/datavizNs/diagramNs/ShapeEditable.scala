package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeEditable extends js.Object {
  var connect: js.UndefOr[Boolean] = js.undefined
}

object ShapeEditable {
  @scala.inline
  def apply(connect: js.UndefOr[Boolean] = js.undefined): ShapeEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect)
    __obj.asInstanceOf[ShapeEditable]
  }
}

