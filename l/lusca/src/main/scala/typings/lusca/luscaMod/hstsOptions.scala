package typings.lusca.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hstsOptions extends js.Object {
  var includeSubDomains: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
}

object hstsOptions {
  @scala.inline
  def apply(
    includeSubDomains: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    preload: js.UndefOr[Boolean] = js.undefined
  ): hstsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    __obj.asInstanceOf[hstsOptions]
  }
}

