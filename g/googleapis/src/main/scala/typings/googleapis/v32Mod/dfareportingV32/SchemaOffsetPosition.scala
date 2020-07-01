package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offset Position.
  */
@js.native
trait SchemaOffsetPosition extends js.Object {
  /**
    * Offset distance from left side of an asset or a window.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Offset distance from top side of an asset or a window.
    */
  var top: js.UndefOr[Double] = js.native
}

object SchemaOffsetPosition {
  @scala.inline
  def apply(left: js.UndefOr[Double] = js.undefined, top: js.UndefOr[Double] = js.undefined): SchemaOffsetPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOffsetPosition]
  }
}

