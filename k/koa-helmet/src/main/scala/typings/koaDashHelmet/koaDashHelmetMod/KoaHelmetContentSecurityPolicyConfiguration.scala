package typings.koaDashHelmet.koaDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[Boolean] = js.undefined
  var directives: js.UndefOr[KoaHelmetContentSecurityPolicyDirectives] = js.undefined
  var disableAndroid: js.UndefOr[Boolean] = js.undefined
  var reportOnly: js.UndefOr[Boolean] = js.undefined
  var setAllHeaders: js.UndefOr[Boolean] = js.undefined
}

object KoaHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(
    browserSniff: js.UndefOr[Boolean] = js.undefined,
    directives: KoaHelmetContentSecurityPolicyDirectives = null,
    disableAndroid: js.UndefOr[Boolean] = js.undefined,
    reportOnly: js.UndefOr[Boolean] = js.undefined,
    setAllHeaders: js.UndefOr[Boolean] = js.undefined
  ): KoaHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserSniff)) __obj.updateDynamic("browserSniff")(browserSniff.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAndroid)) __obj.updateDynamic("disableAndroid")(disableAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(setAllHeaders)) __obj.updateDynamic("setAllHeaders")(setAllHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyConfiguration]
  }
}

