package typings.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarkOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
   // If true, plugin will detect and use native browser support for watermarks, if available. (e.g., WebKit's placeholder attribute.)
  var hideBeforeUnload: js.UndefOr[Boolean] = js.undefined
   // Default class name for all watermarks
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object WatermarkOptions {
  @scala.inline
  def apply(
    className: String = null,
    hideBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): WatermarkOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBeforeUnload)) __obj.updateDynamic("hideBeforeUnload")(hideBeforeUnload.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatermarkOptions]
  }
}

