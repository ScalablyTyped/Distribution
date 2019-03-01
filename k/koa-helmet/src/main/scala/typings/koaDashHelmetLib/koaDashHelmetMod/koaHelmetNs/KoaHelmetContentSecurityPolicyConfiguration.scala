package typings
package koaDashHelmetLib.koaDashHelmetMod.koaHelmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[scala.Boolean] = js.undefined
  var directives: js.UndefOr[KoaHelmetContentSecurityPolicyDirectives] = js.undefined
  var disableAndroid: js.UndefOr[scala.Boolean] = js.undefined
  var reportOnly: js.UndefOr[scala.Boolean] = js.undefined
  var setAllHeaders: js.UndefOr[scala.Boolean] = js.undefined
}

object KoaHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(
    browserSniff: js.UndefOr[scala.Boolean] = js.undefined,
    directives: KoaHelmetContentSecurityPolicyDirectives = null,
    disableAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    reportOnly: js.UndefOr[scala.Boolean] = js.undefined,
    setAllHeaders: js.UndefOr[scala.Boolean] = js.undefined
  ): KoaHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserSniff)) __obj.updateDynamic("browserSniff")(browserSniff)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(disableAndroid)) __obj.updateDynamic("disableAndroid")(disableAndroid)
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly)
    if (!js.isUndefined(setAllHeaders)) __obj.updateDynamic("setAllHeaders")(setAllHeaders)
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyConfiguration]
  }
}

