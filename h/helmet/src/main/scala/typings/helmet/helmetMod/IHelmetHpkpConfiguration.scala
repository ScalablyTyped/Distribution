package typings.helmet.helmetMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
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
    setIf: (/* req */ Request, /* res */ Response) => Boolean = null
  ): IHelmetHpkpConfiguration = {
    val __obj = js.Dynamic.literal(maxAge = maxAge, sha256s = sha256s)
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains)
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains)
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly)
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    if (setIf != null) __obj.updateDynamic("setIf")(js.Any.fromFunction2(setIf))
    __obj.asInstanceOf[IHelmetHpkpConfiguration]
  }
}

