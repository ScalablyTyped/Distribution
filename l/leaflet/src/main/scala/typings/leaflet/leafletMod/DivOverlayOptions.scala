package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivOverlayOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[PointExpression] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
}

object DivOverlayOptions {
  @scala.inline
  def apply(
    className: String = null,
    offset: PointExpression = null,
    pane: String = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): DivOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[DivOverlayOptions]
  }
}

