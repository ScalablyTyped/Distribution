package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var anchor: js.UndefOr[Anchor] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * @param {boolean} [options.closeOnMove=false] If `true`, the popup will closed when the map moves.
    */
  var closeOnMove: js.UndefOr[Boolean] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double | PointLike | StringDictionary[PointLike]] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnMove: js.UndefOr[Boolean] = js.undefined,
    maxWidth: String = null,
    offset: Double | PointLike | StringDictionary[PointLike] = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnMove)) __obj.updateDynamic("closeOnMove")(closeOnMove.get.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

