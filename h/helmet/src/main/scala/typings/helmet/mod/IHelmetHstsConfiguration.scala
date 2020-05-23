package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHstsConfiguration extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeSubDomains: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
}

object IHelmetHstsConfiguration {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    includeSubDomains: js.UndefOr[Boolean] = js.undefined,
    includeSubdomains: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined,
    setIf: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean = null
  ): IHelmetHstsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (setIf != null) __obj.updateDynamic("setIf")(js.Any.fromFunction2(setIf))
    __obj.asInstanceOf[IHelmetHstsConfiguration]
  }
}

