package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanInsideOptions extends js.Object {
  var padding: js.UndefOr[PointExpression] = js.undefined
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}

object PanInsideOptions {
  @scala.inline
  def apply(
    padding: PointExpression = null,
    paddingBottomRight: PointExpression = null,
    paddingTopLeft: PointExpression = null
  ): PanInsideOptions = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottomRight != null) __obj.updateDynamic("paddingBottomRight")(paddingBottomRight.asInstanceOf[js.Any])
    if (paddingTopLeft != null) __obj.updateDynamic("paddingTopLeft")(paddingTopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanInsideOptions]
  }
}

