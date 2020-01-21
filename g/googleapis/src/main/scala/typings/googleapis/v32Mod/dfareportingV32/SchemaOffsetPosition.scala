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
  def apply(left: Int | Double = null, top: Int | Double = null): SchemaOffsetPosition = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOffsetPosition]
  }
}

