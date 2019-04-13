package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hstsOptions extends js.Object {
  var includeSubDomains: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
}

object hstsOptions {
  @scala.inline
  def apply(
    includeSubDomains: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    preload: js.UndefOr[scala.Boolean] = js.undefined
  ): hstsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    __obj.asInstanceOf[hstsOptions]
  }
}

