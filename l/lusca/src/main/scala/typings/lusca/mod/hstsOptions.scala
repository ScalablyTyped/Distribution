package typings.lusca.mod

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
    maxAge: js.UndefOr[Double] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined
  ): hstsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[hstsOptions]
  }
}

