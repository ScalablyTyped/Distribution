package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeAjaxOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
   // >0: Make sure we get an ajax error for invalid URLs
  var dataType: js.UndefOr[String] = js.undefined
   // false: Append random '_' argument to the request url to prevent caching.
  var timeout: js.UndefOr[Double] = js.undefined
}

object DynaTreeAjaxOptions {
  @scala.inline
  def apply(cache: js.UndefOr[Boolean] = js.undefined, dataType: String = null, timeout: Int | Double = null): DynaTreeAjaxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeAjaxOptions]
  }
}

