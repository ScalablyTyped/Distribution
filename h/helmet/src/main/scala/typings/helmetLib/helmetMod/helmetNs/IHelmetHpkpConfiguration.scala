package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHpkpConfiguration extends js.Object {
  var includeSubdomains: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: scala.Double
  var reportOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reportUri: js.UndefOr[java.lang.String] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
  var sha256s: js.Array[java.lang.String]
}

object IHelmetHpkpConfiguration {
  @scala.inline
  def apply(
    maxAge: scala.Double,
    sha256s: js.Array[java.lang.String],
    includeSubdomains: js.UndefOr[scala.Boolean] = js.undefined,
    reportOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reportUri: java.lang.String = null,
    setIf: IHelmetSetIfFunction = null
  ): IHelmetHpkpConfiguration = {
    val __obj = js.Dynamic.literal(maxAge = maxAge, sha256s = sha256s)
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains)
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly)
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    if (setIf != null) __obj.updateDynamic("setIf")(setIf)
    __obj.asInstanceOf[IHelmetHpkpConfiguration]
  }
}

