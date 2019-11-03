package typings.helmet.helmetMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
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
    maxAge: Int | Double = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    setIf: (/* req */ Request[ParamsDictionary], /* res */ Response) => Boolean = null
  ): IHelmetHstsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains)
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (setIf != null) __obj.updateDynamic("setIf")(js.Any.fromFunction2(setIf))
    __obj.asInstanceOf[IHelmetHstsConfiguration]
  }
}

