package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcesHandlerOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var lngParam: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var nsParam: js.UndefOr[String] = js.undefined
}

object GetResourcesHandlerOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    lngParam: String = null,
    maxAge: Int | Double = null,
    nsParam: String = null
  ): GetResourcesHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (lngParam != null) __obj.updateDynamic("lngParam")(lngParam.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (nsParam != null) __obj.updateDynamic("nsParam")(nsParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesHandlerOptions]
  }
}

