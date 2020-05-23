package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[Boolean] = js.undefined
  var directives: IHelmetContentSecurityPolicyDirectives
  var disableAndroid: js.UndefOr[Boolean] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
  var reportOnly: js.UndefOr[
    Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean])
  ] = js.undefined
  var setAllHeaders: js.UndefOr[Boolean] = js.undefined
}

object IHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(
    directives: IHelmetContentSecurityPolicyDirectives,
    browserSniff: js.UndefOr[Boolean] = js.undefined,
    disableAndroid: js.UndefOr[Boolean] = js.undefined,
    loose: js.UndefOr[Boolean] = js.undefined,
    reportOnly: Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]) = null,
    setAllHeaders: js.UndefOr[Boolean] = js.undefined
  ): IHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any])
    if (!js.isUndefined(browserSniff)) __obj.updateDynamic("browserSniff")(browserSniff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAndroid)) __obj.updateDynamic("disableAndroid")(disableAndroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.get.asInstanceOf[js.Any])
    if (reportOnly != null) __obj.updateDynamic("reportOnly")(reportOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(setAllHeaders)) __obj.updateDynamic("setAllHeaders")(setAllHeaders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetContentSecurityPolicyConfiguration]
  }
}

