package typings.i18nextExpressMiddleware.mod

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
    maxAge: js.UndefOr[Double] = js.undefined,
    nsParam: String = null
  ): GetResourcesHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (lngParam != null) __obj.updateDynamic("lngParam")(lngParam.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (nsParam != null) __obj.updateDynamic("nsParam")(nsParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesHandlerOptions]
  }
}

