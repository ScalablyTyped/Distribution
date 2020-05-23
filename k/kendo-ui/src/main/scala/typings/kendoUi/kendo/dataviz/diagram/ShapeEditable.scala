package typings.kendoUi.kendo.dataviz.diagram

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
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeEditable]
  }
}

