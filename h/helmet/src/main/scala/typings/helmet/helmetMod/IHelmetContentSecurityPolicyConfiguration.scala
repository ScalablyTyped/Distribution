package typings.helmet.helmetMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[Boolean] = js.undefined
  var directives: js.UndefOr[IHelmetContentSecurityPolicyDirectives] = js.undefined
  var disableAndroid: js.UndefOr[Boolean] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
  var reportOnly: js.UndefOr[
    Boolean | (js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean])
  ] = js.undefined
  var setAllHeaders: js.UndefOr[Boolean] = js.undefined
}

object IHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(
    browserSniff: js.UndefOr[Boolean] = js.undefined,
    directives: IHelmetContentSecurityPolicyDirectives = null,
    disableAndroid: js.UndefOr[Boolean] = js.undefined,
    loose: js.UndefOr[Boolean] = js.undefined,
    reportOnly: Boolean | (js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]) = null,
    setAllHeaders: js.UndefOr[Boolean] = js.undefined
  ): IHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserSniff)) __obj.updateDynamic("browserSniff")(browserSniff.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAndroid)) __obj.updateDynamic("disableAndroid")(disableAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    if (reportOnly != null) __obj.updateDynamic("reportOnly")(reportOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(setAllHeaders)) __obj.updateDynamic("setAllHeaders")(setAllHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetContentSecurityPolicyConfiguration]
  }
}

