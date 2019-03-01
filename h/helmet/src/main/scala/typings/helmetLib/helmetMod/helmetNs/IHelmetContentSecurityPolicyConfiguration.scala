package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[scala.Boolean] = js.undefined
  var directives: js.UndefOr[IHelmetContentSecurityPolicyDirectives] = js.undefined
  var disableAndroid: js.UndefOr[scala.Boolean] = js.undefined
  var loose: js.UndefOr[scala.Boolean] = js.undefined
  var reportOnly: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ])
  ] = js.undefined
  var setAllHeaders: js.UndefOr[scala.Boolean] = js.undefined
}

object IHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(
    browserSniff: js.UndefOr[scala.Boolean] = js.undefined,
    directives: IHelmetContentSecurityPolicyDirectives = null,
    disableAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    loose: js.UndefOr[scala.Boolean] = js.undefined,
    reportOnly: scala.Boolean | (js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ]) = null,
    setAllHeaders: js.UndefOr[scala.Boolean] = js.undefined
  ): IHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserSniff)) __obj.updateDynamic("browserSniff")(browserSniff)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(disableAndroid)) __obj.updateDynamic("disableAndroid")(disableAndroid)
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    if (reportOnly != null) __obj.updateDynamic("reportOnly")(reportOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(setAllHeaders)) __obj.updateDynamic("setAllHeaders")(setAllHeaders)
    __obj.asInstanceOf[IHelmetContentSecurityPolicyConfiguration]
  }
}

