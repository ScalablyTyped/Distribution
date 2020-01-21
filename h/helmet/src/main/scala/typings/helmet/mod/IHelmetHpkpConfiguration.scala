package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHpkpConfiguration extends js.Object {
  var includeSubDomains: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.undefined
  var maxAge: Double
  var reportOnly: js.UndefOr[Boolean] = js.undefined
  var reportUri: js.UndefOr[String] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
  var sha256s: js.Array[String]
}

object IHelmetHpkpConfiguration {
  @scala.inline
  def apply(
    maxAge: Double,
    sha256s: js.Array[String],
    includeSubDomains: js.UndefOr[Boolean] = js.undefined,
    includeSubdomains: js.UndefOr[Boolean] = js.undefined,
    reportOnly: js.UndefOr[Boolean] = js.undefined,
    reportUri: String = null,
    setIf: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => Boolean = null
  ): IHelmetHpkpConfiguration = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sha256s = sha256s.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains.asInstanceOf[js.Any])
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri.asInstanceOf[js.Any])
    if (setIf != null) __obj.updateDynamic("setIf")(js.Any.fromFunction2(setIf))
    __obj.asInstanceOf[IHelmetHpkpConfiguration]
  }
}

