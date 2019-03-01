package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivOverlayOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[PointExpression] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
}

object DivOverlayOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    offset: PointExpression = null,
    pane: java.lang.String = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): DivOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[DivOverlayOptions]
  }
}

