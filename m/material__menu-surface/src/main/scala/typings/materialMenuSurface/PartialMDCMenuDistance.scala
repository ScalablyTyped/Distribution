package typings.materialMenuSurface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/menu-surface.@material/menu-surface/types.MDCMenuDistance> */
trait PartialMDCMenuDistance extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object PartialMDCMenuDistance {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): PartialMDCMenuDistance = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMDCMenuDistance]
  }
}

