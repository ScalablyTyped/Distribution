package typings.mapboxDashGl.mapboxDashGlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var anchor: js.UndefOr[Anchor] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double | PointLike | StringDictionary[PointLike]] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    offset: Double | PointLike | StringDictionary[PointLike] = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

