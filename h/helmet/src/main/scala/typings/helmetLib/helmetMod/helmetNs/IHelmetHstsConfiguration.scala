package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHstsConfiguration extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var includeSubDomains: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
}

object IHelmetHstsConfiguration {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    includeSubDomains: js.UndefOr[scala.Boolean] = js.undefined,
    includeSubdomains: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    preload: js.UndefOr[scala.Boolean] = js.undefined,
    setIf: IHelmetSetIfFunction = null
  ): IHelmetHstsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains)
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (setIf != null) __obj.updateDynamic("setIf")(setIf)
    __obj.asInstanceOf[IHelmetHstsConfiguration]
  }
}

