package typings.materialUiCore.shapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/shape.Shape> */
@js.native
trait ShapeOptions extends js.Object {
  var borderRadius: js.UndefOr[Double] = js.native
}

object ShapeOptions {
  @scala.inline
  def apply(borderRadius: js.UndefOr[Double] = js.undefined): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOptions]
  }
}

