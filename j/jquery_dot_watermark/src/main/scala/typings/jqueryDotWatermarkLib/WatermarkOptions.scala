package typings
package jqueryDotWatermarkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarkOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
   // If true, plugin will detect and use native browser support for watermarks, if available. (e.g., WebKit's placeholder attribute.)
  var hideBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined
   // Default class name for all watermarks
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

object WatermarkOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    hideBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined,
    useNative: js.UndefOr[scala.Boolean] = js.undefined
  ): WatermarkOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideBeforeUnload)) __obj.updateDynamic("hideBeforeUnload")(hideBeforeUnload)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    __obj.asInstanceOf[WatermarkOptions]
  }
}

