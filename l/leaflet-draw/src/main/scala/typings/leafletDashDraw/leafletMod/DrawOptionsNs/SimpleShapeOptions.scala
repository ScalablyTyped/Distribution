package typings.leafletDashDraw.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleShapeOptions extends js.Object {
  /**
    * Determines if the draw tool remains enabled after drawing a shape.
    *
    * @default false
    */
  var repeatMode: js.UndefOr[Boolean] = js.undefined
}

object SimpleShapeOptions {
  @scala.inline
  def apply(repeatMode: js.UndefOr[Boolean] = js.undefined): SimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode)
    __obj.asInstanceOf[SimpleShapeOptions]
  }
}

